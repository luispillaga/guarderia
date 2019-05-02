package com.guarderia.app.web.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.guarderia.app.web.models.dao.IServicioDAO;
import com.guarderia.app.web.models.entities.Servicio;

@Service
public class ServicioService implements IServicioService{
	
	@Autowired
	private IServicioDAO dao;

	@Override
	public void save(Servicio servicio) {
		dao.save(servicio);
	}

	@Override
	public Servicio findById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
	}

	@Override
	public List<Servicio> findAll() {
		return (List<Servicio>)dao.findAll();
	}

}
