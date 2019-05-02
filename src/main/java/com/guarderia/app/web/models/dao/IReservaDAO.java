package com.guarderia.app.web.models.dao;

import com.guarderia.app.web.models.entities.Reserva;
import org.springframework.data.repository.CrudRepository;

public interface IReservaDAO extends CrudRepository<Reserva, Integer> {
}
