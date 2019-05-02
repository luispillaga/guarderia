package com.guarderia.app.web.models.services;

import java.util.List;

import com.guarderia.app.web.models.entities.Nivel;

public interface INivelService {
	
	public void save(Nivel nivel);
	
	public Nivel findById(Integer id);
	
	public void delete(Integer id);
	
	public List<Nivel> findAll();

}
