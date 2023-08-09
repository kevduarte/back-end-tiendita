package com.tienda.pedidos.models.service;

import java.util.List;
import com.tienda.pedidos.models.entity.Pedido;

public interface IPedidoService {
	
	public List<Pedido> findAll();
	public Pedido findById(Long id);
	public Pedido addOrUpdatePedido(Pedido pedido);
}
