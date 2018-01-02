package com.stackroute.activitystream.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.stackroute.activitystream.model.UserCircle;
import com.stackroute.activitystream.repository.CircleRepository;
import com.stackroute.activitystream.repository.UserCircleRepository;
import com.stackroute.activitystream.repository.UserRepository;
import com.stackroute.activitystream.service.UserCircleService;

@Service
public class UserCircleServiceImpl implements UserCircleService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private CircleRepository circleRepository;

	@Autowired
	private UserCircleRepository userCircleRepository;

	public boolean addUser(String username, String circleName) {

		UserCircle userCircle = new UserCircle();
		userCircle.setCircleName(circleName);
		userCircle.setUsername(username);

		try {
			if (userRepository.findOne(username) != null && circleRepository.findOne(circleName) != null) {
				if (userCircleRepository.getUsernameAndCircleName(username, circleName) == null) {
					userCircleRepository.save(userCircle);
				}
			} else
				return false;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	public boolean removeUser(String username, String circleName) {
		UserCircle userCircle = userCircleRepository.getUsernameAndCircleName(username, circleName);
		try {
			userCircleRepository.delete(userCircle);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	public List<String> getMyCircles(String username) {

		return userCircleRepository.findCircleNameByUserName(username);
	}

	public UserCircle get(String username, String circleName) {

		return userCircleRepository.getUsernameAndCircleName(username, circleName);
	}

}
