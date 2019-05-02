package com.guarderia.app.web.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.guarderia.app.web.models.dao.INivelDAO;
import com.guarderia.app.web.models.entities.Nivel;

@Service
public class NivelService implements INivelService {
	
	@Autowired
	private INivelDAO dao;

	@Override
	public void save(Nivel nivel) {
		dao.save(nivel);
	}

	@Override
	public Nivel findById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
	}

	@Override
	public List<Nivel> findAll() {
		return (List<Nivel>)dao.findAll();
	}

}
