package com.stackroute.activitystream.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.stackroute.activitystream.model.UserTag;

public interface UserTagRepository extends JpaRepository<UserTag, String> {

	@Query("from UserTag where username=:username and tag=:tag")
	public UserTag getUserTag(@Param("username") String username, @Param("tag") String tag);

}
