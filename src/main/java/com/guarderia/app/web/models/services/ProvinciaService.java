package com.guarderia.app.web.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guarderia.app.web.models.dao.IProvinciaDAO;
import com.guarderia.app.web.models.entities.Provincia;


@Service
public class ProvinciaService implements IProvinciaService{
	
	@Autowired
	private IProvinciaDAO dao;


	@Override
	public void save(Provincia provincia) {
		// TODO Auto-generated method stub
		dao.save(provincia);
	}

	@Override
	public Provincia findById(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

	@Override
	public List<Provincia> findAll() {
		// TODO Auto-generated method stub
		return (List<Provincia>) dao.findAll();
	}

}
