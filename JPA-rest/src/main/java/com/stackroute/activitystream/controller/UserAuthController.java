package com.stackroute.activitystream.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.activitystream.model.User;
import com.stackroute.activitystream.service.UserService;

@RestController
@RequestMapping("/api")
public class UserAuthController {

	@Autowired
	UserService userService;

	
	/*
	 * User Authentication
	 */
	@PostMapping("/authenticate")
	public ResponseEntity<User> authenticate(@RequestBody User user, HttpSession session) {
		
		if (userService.validate(user.getUsername(), user.getPassword())) {
			System.out.println("inside");
			User u = userService.get(user.getUsername());
			session.setAttribute("loggedInUser", u);
			session.setAttribute("loggedInUserName", u.getUsername());

			return new ResponseEntity<User>(u, HttpStatus.OK);
		}

		else {

			return new ResponseEntity<User>(HttpStatus.UNAUTHORIZED);
		}

	}

	
	/*
	 * User Logout
	 */
	@PutMapping("/logout")
	public ResponseEntity<User> logout(HttpSession session) {

		String username = (String) session.getAttribute("loggedInUserName");
		if (username != null) {

			System.out.println("logout-->username: " + username);
			User user = new User();
			session.invalidate();

			return new ResponseEntity<User>(user, HttpStatus.OK);
		} else {

			return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
		}

	}

}
