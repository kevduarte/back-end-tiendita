package com.tienda.pedidos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.pedidos.models.entity.Cliente;
import com.tienda.pedidos.models.service.IClienteService;

@RestController
public class ClienteController {
	
	@Autowired
	private IClienteService clienteService;
	
	@GetMapping("/clientes")
	public List<Cliente> listar(){
		return clienteService.findAll();
	}
	
	@GetMapping("/cliente/{id}")
	public Cliente detalle(@PathVariable Long id){
		return clienteService.findById(id);
	}

}
