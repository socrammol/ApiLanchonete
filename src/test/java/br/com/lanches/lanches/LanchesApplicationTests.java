package br.com.lanches.lanches;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.lanches.lanches.repository.IngredientesRepository;

@SpringBootTest
class LanchesApplicationTests {
	@Autowired
	IngredientesRepository ingredientesRepository;

	@Test
	void contextLoads() {
	}

}
