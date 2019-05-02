package com.guarderia.app.web.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.guarderia.app.web.models.entities.Ciudad;

public interface ICiudadDAO extends CrudRepository<Ciudad, Integer> {

}
