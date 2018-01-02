package com.stackroute.activitystream.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.stackroute.activitystream.model.Message;
import com.stackroute.activitystream.model.UserTag;

public interface MessageRepository extends CrudRepository<Message, Integer> {

	@Query("from Message where circleName= :circleName order by postedDate desc")
	public List<Message> getMessagesFromCircle(@Param("circleName") String circleName);

	@Query("from Message where (receiverID= :username and senderID= :otherUsername) or (receiverID= :otherUsername and senderID= :username) order by postedDate desc")
	public List<Message> getMessagesFromUser(@Param("username") String username, @Param("otherUsername") String otherUsername);

	@Query("select distinct m.tag from Message m")
	public List<String> listAllTags();

	@Query("select tag from UserTag where username= :username")
	public List<String> listMyTags(@Param("username") String username);

	@Query("from Message where tag like %:tag% order by postedDate desc")
	public List<Message> showMessagesWithTag(@Param("tag") String tag);

	@Query("from UserTag where username=:username and tag=:tag")
	public UserTag getUserTag(@Param("username") String username, @Param("tag") String tag);

}
