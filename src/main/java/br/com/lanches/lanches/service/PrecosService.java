package br.com.lanches.lanches.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lanches.lanches.dto.ValoresDTO;
import br.com.lanches.lanches.model.ValorIngredientes;
import br.com.lanches.lanches.repository.IngredientesRepository;

@Service
public class PrecosService {
	@Autowired
	IngredientesRepository ingredientesRepository;

	public Optional<ValorIngredientes> buscaValores() {
		return ingredientesRepository.findById(1L);

	}

	public Optional<ValorIngredientes> alteraValor(ValoresDTO valores) {
		Optional<ValorIngredientes> valorIngredientes = ingredientesRepository.findById(1L);
		if (valorIngredientes.isPresent() && valores != null) {

			if (valores.getAlface() > 0) {
				valorIngredientes.get().setAlface(valores.getAlface());
			}
			if (valores.getBacon() > 0) {
				valorIngredientes.get().setBacon(valores.getBacon());
			}
			if (valores.getHamburguer() > 0) {
				valorIngredientes.get().setHamburguer(valores.getHamburguer());
			}
			if (valores.getOvo() > 0) {
				valorIngredientes.get().setOvo(valores.getOvo());
			}
			if (valores.getQueijo() > 0) {
				valorIngredientes.get().setQueijo(valores.getQueijo());
			}
			ingredientesRepository.save(valorIngredientes.get());
		}

		return valorIngredientes;
	}

}
