package br.com.lanches.lanches.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lanches.lanches.dto.IngredientesDTO;
import br.com.lanches.lanches.dto.PedidoDTO;
import br.com.lanches.lanches.dto.XBancon;
import br.com.lanches.lanches.dto.XBurger;
import br.com.lanches.lanches.dto.XEgg;
import br.com.lanches.lanches.dto.XEggBacon;
import br.com.lanches.lanches.model.ValorIngredientes;
import br.com.lanches.lanches.repository.IngredientesRepository;

@Service
public class PedidoService {
	@Autowired
	IngredientesRepository ingredientesRepository;

	public double calculaPedido(PedidoDTO pedido) {
		Optional<ValorIngredientes> valores = ingredientesRepository.findById(1L);
		double soma = 0;

		if (pedido.getXbancon() > 0) {
			XBancon xbacon = new XBancon();
			soma += buscaValor(xbacon.getIngredientes(), valores);
		}

		if (pedido.getXburguer() > 0) {
			XBurger xburger = new XBurger();
			soma += buscaValor(xburger.getIngredientes(), valores);
		}

		if (pedido.getXegg() > 0) {
			XEgg xegg = new XEgg();
			soma += buscaValor(xegg.getIngredientes(), valores);
		}

		if (pedido.getXeggbacon() > 0) {
			XEggBacon xEggBacon = new XEggBacon();
			soma += buscaValor(xEggBacon.getIngredientes(), valores);
		}
		if (pedido.getIngredientes() != null) {
			soma = verificaValorPedidoPersonalizado(pedido.getIngredientes(), valores);

		}
		return soma;
	}

	private double verificaValorPedidoPersonalizado(IngredientesDTO ingredientes, Optional<ValorIngredientes> valores) {
		double soma = 0;
		int resto = 0;

		if (ingredientes.getHamburguer() % 3 == 0) {
			resto = ingredientes.getHamburguer() / 3;
			ingredientes.setHamburguer(ingredientes.getHamburguer() - resto);
		}
		if (ingredientes.getQueijo() % 3 == 0) {
			resto = ingredientes.getQueijo() / 3;
			ingredientes.setQueijo(ingredientes.getQueijo() - resto);
		}
		soma = buscaValor(ingredientes, valores);
		if (ingredientes.getAlface() > 0 && ingredientes.getBacon() == 0) {
			soma = soma * 0.90;
		}
		return soma;

	}

	private double buscaValor(IngredientesDTO ingredientes, Optional<ValorIngredientes> valores) {
		if (valores.isPresent()) {
			return ((ingredientes.getAlface() * valores.get().getAlface())
					+ (ingredientes.getBacon() * valores.get().getBacon())
					+ (ingredientes.getHamburguer() * valores.get().getHamburguer())
					+ (ingredientes.getOvo() * valores.get().getOvo())
					+ (ingredientes.getQueijo() * valores.get().getQueijo()));
		}
		return 0;
	}

}
