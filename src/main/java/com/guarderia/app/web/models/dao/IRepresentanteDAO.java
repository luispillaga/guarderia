package com.guarderia.app.web.models.dao;

import com.guarderia.app.web.models.entities.Representante;
import org.springframework.data.repository.CrudRepository;

public interface IRepresentanteDAO extends CrudRepository<Representante, Integer> {
}
