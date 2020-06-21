package br.com.lanches.lanches.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lanches.lanches.dto.PedidoDTO;
import br.com.lanches.lanches.service.PedidoService;
@RestController
@RequestMapping("/lanche")
@CrossOrigin(origins = { "http://localhost:8081" }, allowCredentials = "true")
public class LanchesController {
	@Autowired
	PedidoService pedidoService;
	
	
	@PostMapping
	public double criaLanches(@RequestBody PedidoDTO pedido) {
		
		return pedidoService.calculaPedido(pedido);
		
	}
	
}
