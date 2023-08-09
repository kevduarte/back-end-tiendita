package com.tienda.pedidos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.tienda.pedidos.models.entity.Pedido;

public interface PedidoDao extends CrudRepository<Pedido, Long> {

}
