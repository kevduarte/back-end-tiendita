package com.tienda.pedidos.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tienda.pedidos.models.dao.PedidoDao;
import com.tienda.pedidos.models.entity.Pedido;

@Service
public class PedidoServiceImpl implements IPedidoService {
	
	@Autowired
	private PedidoDao pedidoDao;

	@Override
	@Transactional(readOnly=true)
	public List<Pedido> findAll() {
		return (List<Pedido>) pedidoDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Pedido findById(Long id) {
		return pedidoDao.findById(id).orElse(null);
	}
	
	@Override
	public Pedido addOrUpdatePedido(Pedido pedido) {
		
		return pedidoDao.save(pedido);
	}

}
