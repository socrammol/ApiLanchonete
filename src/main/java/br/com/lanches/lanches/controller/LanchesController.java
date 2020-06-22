package br.com.lanches.lanches.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lanches.lanches.dto.PedidoDTO;
import br.com.lanches.lanches.service.PedidoService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/lanche")
@CrossOrigin(origins = { "http://localhost:8081" }, allowCredentials = "true")
public class LanchesController {
	@Autowired
	PedidoService pedidoService;
	@ApiResponses(value = {
		    @ApiResponse(code = 200, message = "Retorna o valor do sanduiche"),
		})
	@PostMapping(produces = "application/json",consumes="application/json")
	public String criaLanches(@RequestBody PedidoDTO pedido) {

		double valor = pedidoService.calculaPedido(pedido);
		String total = "o valor a ser pago e: R$" + valor;
		return total;

	}

}
