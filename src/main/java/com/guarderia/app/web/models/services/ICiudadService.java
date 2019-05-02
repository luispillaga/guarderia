package com.guarderia.app.web.models.services;

import java.util.List;

import com.guarderia.app.web.models.entities.Ciudad;

public interface ICiudadService {

	public void save(Ciudad ciudad);
	public Ciudad findById(Integer id);
	public void delete(Integer id);
	public List<Ciudad> findAll();
}
