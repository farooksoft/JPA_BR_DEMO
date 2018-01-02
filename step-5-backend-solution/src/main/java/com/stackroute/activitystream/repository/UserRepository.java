package com.stackroute.activitystream.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.stackroute.activitystream.model.User;

public interface UserRepository extends CrudRepository<User, String> {

	@Query("select u from User u where u.username = :username and u.password = :password")
	User validate(@Param("username") String username, @Param("password") String password);
}
