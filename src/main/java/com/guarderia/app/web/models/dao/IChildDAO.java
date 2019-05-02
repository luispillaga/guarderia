package com.guarderia.app.web.models.dao;

import com.guarderia.app.web.models.entities.Child;
import org.springframework.data.repository.CrudRepository;

public interface IChildDAO extends CrudRepository<Child, Integer> {
}
