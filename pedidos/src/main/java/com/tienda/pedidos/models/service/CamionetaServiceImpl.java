package com.tienda.pedidos.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tienda.pedidos.models.dao.CamionetaDao;
import com.tienda.pedidos.models.entity.Camioneta;

@Service
public class CamionetaServiceImpl implements ICamionetaService {
	
	@Autowired
	private CamionetaDao camionetaDao;

	@Override
	@Transactional(readOnly=true)
	public List<Camioneta> findAll() {
		
		return (List<Camioneta>) camionetaDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Camioneta findById(Long id) {
		
		return camionetaDao.findById(id).orElse(null);
	}

}
