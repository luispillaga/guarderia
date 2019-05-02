package com.guarderia.app.web.models.services;

import com.guarderia.app.web.models.entities.Reserva;

import java.util.List;

public interface IReservaService {
    public void save(Reserva reserva);

    public Reserva findById(Integer id);

    public void delete(Integer id);

    public List<Reserva> findAll();
}
