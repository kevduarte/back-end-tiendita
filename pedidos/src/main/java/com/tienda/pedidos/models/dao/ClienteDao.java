package com.tienda.pedidos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.tienda.pedidos.models.entity.Cliente;

public interface ClienteDao extends CrudRepository<Cliente, Long>{

}
