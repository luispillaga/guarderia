package com.guarderia.app.web.models.services;

import com.guarderia.app.web.models.entities.Child;

import java.util.List;

public interface IChildService {
    public void save(Child child);

    public Child findById(Integer id);

    public void delete(Integer id);

    public List<Child> findAll();
}
