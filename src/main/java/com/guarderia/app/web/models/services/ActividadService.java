package com.guarderia.app.web.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.guarderia.app.web.models.dao.IActividadDAO;
import com.guarderia.app.web.models.entities.Actividad;

@Service
public class ActividadService implements IActividadService{

	@Autowired
	private IActividadDAO dao;
	
	@Override
	public void save(Actividad actividad) {
		dao.save(actividad);
	}

	@Override
	public Actividad findById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
	}

	@Override
	public List<Actividad> findAll() {
		return (List<Actividad>)dao.findAll();
	}

}
