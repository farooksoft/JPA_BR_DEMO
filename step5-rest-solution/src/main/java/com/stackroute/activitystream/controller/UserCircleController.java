package com.stackroute.activitystream.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.stackroute.activitystream.model.UserCircle;
import com.stackroute.activitystream.service.CircleService;
import com.stackroute.activitystream.service.UserCircleService;
import com.stackroute.activitystream.service.UserService;

@RestController
@RequestMapping("/api/usercircle")
public class UserCircleController {

	@Autowired
	UserCircleService userCircleService;

	@Autowired
	private UserService userService;

	@Autowired
	private CircleService circleService;

	@Autowired
	UserCircle userCircle;

	@PutMapping("/addToCircle/{username}/{circleName}")
	public ResponseEntity<UserCircle> addUser(@PathVariable("username") String username,
			@PathVariable("circleName") String circleName, HttpSession session) {
		String loggedInUserName = (String) session.getAttribute("loggedInUserName");
		if (loggedInUserName == null) {
			return new ResponseEntity<UserCircle>(HttpStatus.UNAUTHORIZED);
		}
		if (userService.get(username) == null || circleService.get(circleName) == null) {
			return new ResponseEntity<UserCircle>(HttpStatus.NOT_FOUND);

		}
		if (userCircleService.get(username, circleName) != null) {
			return new ResponseEntity<UserCircle>(HttpStatus.CONFLICT);
		}
		boolean status = userCircleService.addUser(username, circleName);
		if (status == false) {

			return new ResponseEntity<UserCircle>(HttpStatus.INTERNAL_SERVER_ERROR);

		} else {

			return new ResponseEntity<UserCircle>(HttpStatus.OK);
		}

	}

	@PutMapping("/removeFromCircle/{username}/{circleName}")
	public ResponseEntity<UserCircle> removeUser(@PathVariable("username") String username,
			@PathVariable("circleName") String circleName, HttpSession session) {
		String loggedInUserName = (String) session.getAttribute("loggedInUserName");
		if (loggedInUserName == null) {
			return new ResponseEntity<UserCircle>(HttpStatus.UNAUTHORIZED);
		}
		boolean status = userCircleService.removeUser(username, circleName);
		if (status == false) {

			return new ResponseEntity<UserCircle>(HttpStatus.INTERNAL_SERVER_ERROR);

		} else {
			return new ResponseEntity<UserCircle>(HttpStatus.OK);

		}

	}

	/* Retrieve circles for a specific user */

	@GetMapping("/searchByUser/{username}")
	public ResponseEntity<List<String>> getMyCircles(@PathVariable("username") String username, HttpSession session) {
		String loggedInUserName = (String) session.getAttribute("loggedInUserName");
		if (loggedInUserName == null) {
			return new ResponseEntity<List<String>>(HttpStatus.UNAUTHORIZED);
		}

		return new ResponseEntity<List<String>>(userCircleService.getMyCircles(username), HttpStatus.OK);

	}

}
