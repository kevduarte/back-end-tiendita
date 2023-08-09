package com.tienda.pedidos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.pedidos.models.entity.Pedido;
import com.tienda.pedidos.models.service.IPedidoService;

@RestController
public class PedidoController {
	
	@Autowired
	private IPedidoService pedidoService;
	
	@GetMapping("/pedidos")
	public List<Pedido> listar(){
		return pedidoService.findAll();
	}
	
	@GetMapping("/pedido/{id}")
	public Pedido detalle(@PathVariable Long id){
		return pedidoService.findById(id);
	}
	
	@PostMapping("nuevo-pedido")
	public ResponseEntity<Pedido> addPedido(@RequestBody Pedido pedido){
		
		Pedido pedidos = null;
		try {
			pedidos=pedidoService.addOrUpdatePedido(pedido);
			
		}catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Pedido>(pedidos, HttpStatus.OK);
		
	}

}
