package com.guarderia.app.web.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guarderia.app.web.models.dao.IDireccionDAO;
import com.guarderia.app.web.models.entities.Direccion;



@Service
public class DireccionService implements IDireccionService{

	@Autowired
	private IDireccionDAO dao;
	
	@Override
	public void save(Direccion direccion) {
		// TODO Auto-generated method stub
		dao.save(direccion);
	}

	@Override
	public Direccion findById(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

	@Override
	public List<Direccion> findAll() {
		// TODO Auto-generated method stub
		return (List<Direccion>) dao.findAll();
	}

}
