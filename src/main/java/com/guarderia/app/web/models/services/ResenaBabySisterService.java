package com.guarderia.app.web.models.services;

import com.guarderia.app.web.models.dao.IResenaBabySisterDAO;
import com.guarderia.app.web.models.entities.ResenaBabySister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResenaBabySisterService implements IResenaBabySisterService {
    @Autowired
    private IResenaBabySisterDAO dao;

    @Override
    public void save(ResenaBabySister resenaBabySister) {
        dao.save(resenaBabySister);
    }

    @Override
    public ResenaBabySister findById(Integer id) {
        return dao.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public List<ResenaBabySister> findAll() {
        return (List<ResenaBabySister>)dao.findAll();
    }
}
