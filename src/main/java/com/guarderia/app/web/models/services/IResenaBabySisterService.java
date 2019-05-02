package com.guarderia.app.web.models.services;

import com.guarderia.app.web.models.entities.ResenaBabySister;

import java.util.List;

public interface IResenaBabySisterService {
    public void save(ResenaBabySister resenaBabySister);

    public ResenaBabySister findById(Integer id);

    public void delete(Integer id);

    public List<ResenaBabySister> findAll();
}
