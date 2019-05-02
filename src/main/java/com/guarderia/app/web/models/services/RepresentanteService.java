package com.guarderia.app.web.models.services;

import com.guarderia.app.web.models.dao.IRepresentanteDAO;
import com.guarderia.app.web.models.entities.Representante;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RepresentanteService implements IRepresentanteService {
    @Autowired
    private IRepresentanteDAO dao;

    @Override
    public void save(Representante representante) {
        dao.save(representante);
    }

    @Override
    public Representante findById(Integer id) {
        return dao.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public List<Representante> findAll() {
        return (List<Representante>)dao.findAll();
    }
}
