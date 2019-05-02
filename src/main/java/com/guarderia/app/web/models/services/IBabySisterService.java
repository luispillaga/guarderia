package com.guarderia.app.web.models.services;

import com.guarderia.app.web.models.entities.BabySister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IBabySisterService {
    public void save(BabySister babySister);

    public BabySister findById(Integer id);

    public void delete(Integer id);

    public List<BabySister> findAll();
}
