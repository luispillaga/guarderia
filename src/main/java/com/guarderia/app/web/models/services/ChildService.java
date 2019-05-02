package com.guarderia.app.web.models.services;

import com.guarderia.app.web.models.dao.IChildDAO;
import com.guarderia.app.web.models.entities.Child;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChildService implements IChildService {
    @Autowired
    private IChildDAO dao;

    @Override
    public void save(Child child) {
        dao.save(child);
    }

    @Override
    public Child findById(Integer id) {
        return dao.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public List<Child> findAll() {
        return (List<Child>)dao.findAll();
    }
}
