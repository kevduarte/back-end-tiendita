package com.tienda.pedidos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.pedidos.models.entity.Camioneta;
import com.tienda.pedidos.models.service.ICamionetaService;

@RestController
public class CamionetaController {
	
	@Autowired
	private ICamionetaService camionetaService;
	
	@GetMapping("/camionetas")
	public List<Camioneta> listar(){
		return camionetaService.findAll();
	}
	
	@GetMapping("/camionetas/{id}")
	public Camioneta detalle(@PathVariable Long id){
		return camionetaService.findById(id);
	}

}
