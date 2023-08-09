package com.tienda.pedidos.models.service;

import java.util.List;

import com.tienda.pedidos.models.entity.Camioneta;

public interface ICamionetaService {
	
	public List<Camioneta> findAll();
	public Camioneta findById(Long id);

}
