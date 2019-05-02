package com.guarderia.app.web.models.services;

import com.guarderia.app.web.models.entities.ResenaBabySister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IResenaBabySisterService {
    public void save(ResenaBabySister resenaBabySister);

    public ResenaBabySister findById(Integer id);

    public void delete(Integer id);

    public List<ResenaBabySister> findAll();
}
