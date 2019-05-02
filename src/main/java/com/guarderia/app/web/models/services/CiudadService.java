package com.guarderia.app.web.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guarderia.app.web.models.dao.ICiudadDAO;
import com.guarderia.app.web.models.entities.Ciudad;


@Service
public class CiudadService implements ICiudadService {

	@Autowired
	private ICiudadDAO dao;
	
	
	@Override
	public void save(Ciudad ciudad) {
		// TODO Auto-generated method stub
		dao.save(ciudad);
	}

	@Override
	public Ciudad findById(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

	@Override
	public List<Ciudad> findAll() {
		// TODO Auto-generated method stub
		return (List<Ciudad>) dao.findAll();
	}

}
