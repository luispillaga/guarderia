package com.guarderia.app.web.models.services;

import java.util.List;

import com.guarderia.app.web.models.entities.Galeria;

public interface IGaleriaService {
	
	public void save(Galeria galeria);
	
	public Galeria findById(Integer id);
	
	public void delete(Integer id);
	
	public List<Galeria> findAll();

}
