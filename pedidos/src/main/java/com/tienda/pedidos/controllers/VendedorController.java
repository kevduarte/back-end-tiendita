package com.tienda.pedidos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.pedidos.models.entity.Vendedor;
import com.tienda.pedidos.models.service.IVendedorService;

@RestController
public class VendedorController {
	
	@Autowired
	private IVendedorService vendedorService;
	
	@GetMapping("/vendedor")
	public List<Vendedor> listar(){
		return vendedorService.findAll();
	}
	
	@GetMapping("/vendedor/{id}")
	public Vendedor detalle(@PathVariable Long id){
		return vendedorService.findById(id);
	}

}
