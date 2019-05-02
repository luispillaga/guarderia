package com.guarderia.app.web.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.guarderia.app.web.models.entities.Actividad;

public interface IActividadDAO extends CrudRepository<Actividad, Integer>  {

}
