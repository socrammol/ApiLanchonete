package br.com.lanches.lanches.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lanches.lanches.dto.ValoresDTO;
import br.com.lanches.lanches.model.ValorIngredientes;
import br.com.lanches.lanches.service.PrecosService;

@RestController
@RequestMapping("/preco")
@CrossOrigin(origins = { "http://localhost:8081" }, allowCredentials = "true")
public class PrecosController {
	@Autowired
	PrecosService precosService;
	
	@GetMapping
	public Optional<ValorIngredientes> valorIngredientes() {
		return precosService.buscaValores();
	}
	
	@PutMapping
	public  Optional<ValorIngredientes> alteraValores(@RequestBody ValoresDTO valores){
		
		return precosService.alteraValor(valores);
		
	}
}
