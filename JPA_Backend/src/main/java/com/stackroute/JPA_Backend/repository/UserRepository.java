package com.stackroute.JPA_Backend.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.stackroute.JPA_Backend.model.User;

public interface UserRepository extends CrudRepository<User, String>{

	
}
