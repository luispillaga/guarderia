package com.guarderia.app.web.models.services;

import java.util.List;

import com.guarderia.app.web.models.entities.Resena;


public interface IResenaService {
	
	public void save(Resena resena);
	public Resena findById(Integer id);
	public void delete(Integer id);
	public List<Resena> findAll();

}
