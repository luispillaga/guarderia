package com.guarderia.app.web.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.guarderia.app.web.models.entities.Servicio;

public interface IServicioDAO extends CrudRepository<Servicio, Integer> {

}
