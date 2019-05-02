package com.guarderia.app.web.models.services;

import java.util.List;

import com.guarderia.app.web.models.entities.Social;


public interface ISocialService {

	public void save(Social social);
	public Social findById(Integer id);
	public void delete(Integer id);
	public List<Social> findAll();
}
