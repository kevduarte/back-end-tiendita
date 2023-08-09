package com.tienda.pedidos.models.service;

import java.util.List;

import com.tienda.pedidos.models.entity.Vendedor;

public interface IVendedorService {
	
	public List<Vendedor> findAll();
	public Vendedor findById(Long id);

}
