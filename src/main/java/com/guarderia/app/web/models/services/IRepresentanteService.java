package com.guarderia.app.web.models.services;

import com.guarderia.app.web.models.entities.Representante;

import java.util.List;

public interface IRepresentanteService {
    public void save(Representante representante);

    public Representante findById(Integer id);

    public void delete(Integer id);

    public List<Representante> findAll();
}
