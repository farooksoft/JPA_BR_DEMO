package com.stackroute.activitystream.service;

import java.util.List;
import com.stackroute.activitystream.model.User;

public interface UserService {
	public boolean save(User user);

	public boolean update(User user);

	public boolean delete(User user);

	public List<User> list();

	public boolean validate(String username, String password);

	public User get(String username);

	public boolean exists(String username);

}
