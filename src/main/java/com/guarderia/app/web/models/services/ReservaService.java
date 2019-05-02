package com.guarderia.app.web.models.services;

import com.guarderia.app.web.models.dao.IReservaDAO;
import com.guarderia.app.web.models.entities.Reserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService implements IReservaService {
    @Autowired
    private IReservaDAO dao;

    @Override
    public void save(Reserva reserva) {
        dao.save(reserva);
    }

    @Override
    public Reserva findById(Integer id) {
        return dao.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public List<Reserva> findAll() {
        return (List<Reserva>)dao.findAll();
    }
}
