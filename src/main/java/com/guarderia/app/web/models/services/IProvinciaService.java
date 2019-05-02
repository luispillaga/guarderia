package com.guarderia.app.web.models.services;

import java.util.List;

import com.guarderia.app.web.models.entities.Provincia;


public interface IProvinciaService {

	public void save(Provincia provincia);
	public Provincia findById(Integer id);
	public void delete(Integer id);
	public List<Provincia> findAll();
}
