package br.com.lanches.lanches.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import br.com.lanches.lanches.model.ValorIngredientes;
import br.com.lanches.lanches.repository.IngredientesRepository;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class LancheRepositoryTeste {
	@Autowired
	private IngredientesRepository ingredientesRepository;
	
	@Test
	public void createSholdPersistData() {
		ValorIngredientes valorIngredientes = new ValorIngredientes(1,2,3,4,5);
		this.ingredientesRepository.save(valorIngredientes);
		Assertions.assertThat(valorIngredientes.getAlface()).isEqualTo(1);
		Assertions.assertThat(valorIngredientes.getBacon()).isEqualTo(2);
		Assertions.assertThat(valorIngredientes.getHamburguer()).isEqualTo(3);
		Assertions.assertThat(valorIngredientes.getOvo()).isEqualTo(4);
		Assertions.assertThat(valorIngredientes.getQueijo()).isEqualTo(5);
	}
	
	@Test
	public void deleteSholdPersistData() {
		ValorIngredientes valorIngredientes = new ValorIngredientes(1,2,3,4,5);
		this.ingredientesRepository.save(valorIngredientes);
		ingredientesRepository.delete(valorIngredientes);
		Assertions.assertThat(ingredientesRepository.findById(valorIngredientes.getId())).isEmpty();
		
	}
	
	@Test
	public void updateSholdPersistData() {
		ValorIngredientes valorIngredientes = new ValorIngredientes(1,2,3,4,5);
		this.ingredientesRepository.save(valorIngredientes);
		valorIngredientes.setAlface(5);
		valorIngredientes.setBacon(4);
		Assertions.assertThat(valorIngredientes.getAlface()).isEqualTo(5);
		Assertions.assertThat(valorIngredientes.getBacon()).isEqualTo(4);

	}

}
