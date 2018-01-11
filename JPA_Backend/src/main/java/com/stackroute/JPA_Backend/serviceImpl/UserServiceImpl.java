package com.stackroute.JPA_Backend.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.JPA_Backend.model.User;
import com.stackroute.JPA_Backend.repository.UserRepository;
import com.stackroute.JPA_Backend.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	public boolean save(User user) {

		return (userRepository.save(user) != null);
	}

	public boolean update(User user) {

		return (userRepository.save(user) != null);

	}

	public boolean delete(User user) {

		userRepository.delete(user);
		if (userRepository.findOne(user.getUsername()) != null) {
			return false;
		} else
			return true;
	}

	public List<User> list() {
		return (List<User>) userRepository.findAll();
	}

	
	public User get(String username) {
		return userRepository.findOne(username);

	}

	public boolean exists(String username) {

		return userRepository.exists(username);

	}
}
