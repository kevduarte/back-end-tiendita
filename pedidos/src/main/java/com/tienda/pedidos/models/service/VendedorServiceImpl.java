package com.tienda.pedidos.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tienda.pedidos.models.dao.VendedorDao;
import com.tienda.pedidos.models.entity.Vendedor;

@Service
public class VendedorServiceImpl implements IVendedorService{
	
	@Autowired
	private VendedorDao vendedorDao;

	@Override
	@Transactional(readOnly=true)
	public List<Vendedor> findAll() {
		return (List<Vendedor>) vendedorDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Vendedor findById(Long id) {
		return vendedorDao.findById(id).orElse(null);
	
	}

}
