package com.stackroute.JPA_Backend.service;

import java.util.List;

import com.stackroute.JPA_Backend.model.User;

public interface UserService {
	public boolean save(User user);

	public boolean update(User user);

	public boolean delete(User user);

	public List<User> list();

	public User get(String username);

	public boolean exists(String username);

}
