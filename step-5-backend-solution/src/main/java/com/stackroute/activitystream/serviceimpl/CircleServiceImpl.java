package com.stackroute.activitystream.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.stackroute.activitystream.model.Circle;
import com.stackroute.activitystream.repository.CircleRepository;
import com.stackroute.activitystream.repository.UserRepository;
import com.stackroute.activitystream.service.CircleService;

@Service
public class CircleServiceImpl implements CircleService {

	@Autowired
	private CircleRepository circleRepository;

	@Autowired
	private UserRepository userRepository;

	public boolean save(Circle circle) {
		if (circleRepository.findOne(circle.getCircleName()) != null
				|| userRepository.findOne(circle.getCreatorId()) == null) {
			return false;
		} else {

			return (circleRepository.save(circle) != null);
		}
	}

	public List<Circle> getAllCircles() {

		return circleRepository.findAll();
	}

	public List<Circle> getAllCircles(String searchString) {

		return circleRepository.findAll(searchString);
	}

	public Circle get(String circleName) {

		return circleRepository.findOne(circleName);
	}

	public boolean delete(Circle circle) {
		if (circleRepository.findOne(circle.getCircleName()) != null) {
			return false;
		} else {
			circleRepository.delete(circle);
			return true;
		}
	}

}
