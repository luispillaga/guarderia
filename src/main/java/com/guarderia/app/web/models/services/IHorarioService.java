package com.guarderia.app.web.models.services;

import java.util.List;

import com.guarderia.app.web.models.entities.Horario;

public interface IHorarioService {
	
	public void save(Horario horario);
	
	public Horario findById(Integer id);
	
	public void delete(Integer id);
	
	public List<Horario> findAll();

}
