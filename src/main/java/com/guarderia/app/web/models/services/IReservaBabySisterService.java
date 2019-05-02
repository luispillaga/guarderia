package com.guarderia.app.web.models.services;

import com.guarderia.app.web.models.entities.ReservaBabySister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IReservaBabySisterService {
    public void save(ReservaBabySister reservaBabySister);

    public ReservaBabySister findById(Integer id);

    public void delete(Integer id);

    public List<ReservaBabySister> findAll();
}
