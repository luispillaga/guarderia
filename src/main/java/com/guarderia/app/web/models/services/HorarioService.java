package com.guarderia.app.web.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.guarderia.app.web.models.dao.IHorarioDAO;
import com.guarderia.app.web.models.entities.Horario;

@Service
public class HorarioService implements IHorarioService {

	@Autowired
	private IHorarioDAO dao;
	
	@Override
	public void save(Horario horario) {
		dao.save(horario);
	}

	@Override
	public Horario findById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
	}

	@Override
	public List<Horario> findAll() {
		return (List<Horario>)dao.findAll();
	}

}
