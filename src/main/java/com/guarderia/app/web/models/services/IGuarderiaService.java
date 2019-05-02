package com.guarderia.app.web.models.services;

import java.util.List;

import com.guarderia.app.web.models.entities.Guarderia;

public interface IGuarderiaService {
	
public void save(Guarderia guarderia);
	
	public Guarderia findById(Integer id);
	
	public void delete(Integer id);
	
	public List<Guarderia> findAll();

}
