package com.guarderia.app.web.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.guarderia.app.web.models.entities.Horario;

public interface IHorarioDAO extends CrudRepository<Horario, Integer>  {

}
