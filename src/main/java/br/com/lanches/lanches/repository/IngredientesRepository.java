package br.com.lanches.lanches.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.lanches.lanches.model.ValorIngredientes;

@Repository
public interface IngredientesRepository extends CrudRepository<ValorIngredientes, Long> {

}
