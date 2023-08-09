package com.tienda.pedidos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.tienda.pedidos.models.entity.Vendedor;

public interface VendedorDao extends CrudRepository<Vendedor, Long>{ 

}
