package br.com.lanches.lanches.dto;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.lanches.lanches.model.ValorIngredientes;
import br.com.lanches.lanches.repository.IngredientesRepository;

public class XBurger {
	@Autowired
	IngredientesRepository ingredientesRepository;

	private IngredientesDTO ingredientes = new IngredientesDTO(0, 0, 1, 0, 1);

	@Override
	public String toString() {
		return "XBancon [ingredientes=" + ingredientes + "]";
	}

	public IngredientesDTO getIngredientes() {
		return ingredientes;
	}

}
