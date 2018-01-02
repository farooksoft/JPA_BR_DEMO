package com.stackroute.activitystream.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.stackroute.activitystream.model.UserCircle;

public interface UserCircleRepository extends CrudRepository<UserCircle, Integer> {

	@Query("select uc from UserCircle uc where uc.username= :username and uc.circleName= :circleName")
	UserCircle getUsernameAndCircleName(@Param("username") String username, @Param("circleName") String circleName);

	@Query("select circleName from UserCircle where username = :username")
	List<String> findCircleNameByUserName(@Param("username") String username);

}
