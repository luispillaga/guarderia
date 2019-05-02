package com.guarderia.app.web.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.guarderia.app.web.models.dao.IGuarderiaDAO;
import com.guarderia.app.web.models.entities.Guarderia;

@Service
public class GuarderiaService implements IGuarderiaService {
	
	@Autowired
	private IGuarderiaDAO dao;

	@Override
	public void save(Guarderia guarderia) {
		dao.save(guarderia);
	}

	@Override
	public Guarderia findById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
	}

	@Override
	public List<Guarderia> findAll() {
		return (List<Guarderia>)dao.findAll();
	}

}
