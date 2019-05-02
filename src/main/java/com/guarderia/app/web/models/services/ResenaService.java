package com.guarderia.app.web.models.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guarderia.app.web.models.dao.IResenaDAO;
import com.guarderia.app.web.models.entities.Resena;


@Service
public class ResenaService implements IResenaService {

	@Autowired
	private IResenaDAO dao;

	@Override
	public void save(Resena resena) {
		// TODO Auto-generated method stub
		dao.save(resena);
	}

	@Override
	public Resena findById(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

	@Override
	public List<Resena> findAll() {
		// TODO Auto-generated method stub
		return (List<Resena>) dao.findAll();
	}
	
	

}
