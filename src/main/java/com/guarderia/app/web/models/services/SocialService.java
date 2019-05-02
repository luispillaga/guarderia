package com.guarderia.app.web.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guarderia.app.web.models.dao.ISocialDAO;
import com.guarderia.app.web.models.entities.Social;

@Service
public class SocialService implements ISocialService{

	
	@Autowired
	private ISocialDAO dao;
	
	
	@Override
	public void save(Social social) {
		// TODO Auto-generated method stub
		dao.save(social);
	}

	@Override
	public Social findById(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

	@Override
	public List<Social> findAll() {
		// TODO Auto-generated method stub
		return (List<Social>) dao.findAll();
	}

}
