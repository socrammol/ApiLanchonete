package br.com.lanches.lanches.dto;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.lanches.lanches.repository.IngredientesRepository;

public class XEggBacon {

	@Autowired
	IngredientesRepository ingredientesRepository;
	private IngredientesDTO ingredientes = new IngredientesDTO(0, 1, 1, 1, 1);

	@Override
	public String toString() {
		return "XBancon [ingredientes=" + ingredientes + "]";
	}

	public IngredientesDTO getIngredientes() {
		return ingredientes;
	}

}
