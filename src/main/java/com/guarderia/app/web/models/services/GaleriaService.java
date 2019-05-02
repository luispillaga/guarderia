package com.guarderia.app.web.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.guarderia.app.web.models.dao.IGaleriaDAO;
import com.guarderia.app.web.models.entities.Galeria;

@Service
public class GaleriaService implements IGaleriaService {
	
	@Autowired
	private IGaleriaDAO dao;

	@Override
	public void save(Galeria galeria) {
		dao.save(galeria);
	}

	@Override
	public Galeria findById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
	}

	@Override
	public List<Galeria> findAll() {
		return (List<Galeria>)dao.findAll();
	}

}
