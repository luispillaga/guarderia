package com.guarderia.app.web.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.guarderia.app.web.models.entities.Guarderia;

public interface IGuarderiaDAO extends CrudRepository<Guarderia, Integer> {

}
