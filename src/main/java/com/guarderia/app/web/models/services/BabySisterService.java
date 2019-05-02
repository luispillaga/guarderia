package com.guarderia.app.web.models.services;

import com.guarderia.app.web.models.dao.IBabySisterDAO;
import com.guarderia.app.web.models.entities.BabySister;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BabySisterService implements IBabySisterService {
    @Autowired
    private IBabySisterDAO dao;

    @Override
    public void save(BabySister babySister) {
        dao.save(babySister);
    }

    @Override
    public BabySister findById(Integer id) {
        return dao.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public List<BabySister> findAll() {
        return (List<BabySister>)dao.findAll();
    }
}
