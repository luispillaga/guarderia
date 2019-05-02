package com.guarderia.app.web.models.services;

import com.guarderia.app.web.models.dao.IReservaBabySisterDAO;
import com.guarderia.app.web.models.entities.ReservaBabySister;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ReservaBabySisterService implements IReservaBabySisterService {
    @Autowired
    private IReservaBabySisterDAO dao;

    @Override
    public void save(ReservaBabySister reservaBabySister) {
        dao.save(reservaBabySister);
    }

    @Override
    public ReservaBabySister findById(Integer id) {
        return dao.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public List<ReservaBabySister> findAll() {
        return (List<ReservaBabySister>)dao.findAll();
    }
}
