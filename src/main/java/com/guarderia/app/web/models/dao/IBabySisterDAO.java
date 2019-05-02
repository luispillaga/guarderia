package com.guarderia.app.web.models.dao;

import com.guarderia.app.web.models.entities.BabySister;
import org.springframework.data.repository.CrudRepository;

public interface IBabySisterDAO extends CrudRepository<BabySister, Integer> {
}
