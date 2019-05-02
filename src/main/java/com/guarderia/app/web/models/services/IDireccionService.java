package com.guarderia.app.web.models.services;

import java.util.List;

import com.guarderia.app.web.models.entities.Direccion;


public interface IDireccionService {

	public void save(Direccion direccion);
	public Direccion findById(Integer id);
	public void delete(Integer id);
	public List<Direccion> findAll();
}
