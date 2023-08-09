package com.tienda.pedidos.models.service;

import java.util.List;

import com.tienda.pedidos.models.entity.Cliente;

public interface IClienteService {
	public List<Cliente> findAll();
	public Cliente findById(Long id);

}
