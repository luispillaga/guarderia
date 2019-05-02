package com.guarderia.app.web.models.services;

import java.util.List;

import com.guarderia.app.web.models.entities.Actividad;


public interface IActividadService {
	
	public void save(Actividad actividad);
	
	public Actividad findById(Integer id);
	
	public void delete(Integer id);
	
	public List<Actividad> findAll();


}
