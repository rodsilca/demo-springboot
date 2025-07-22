package com.rodsproject.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodsproject.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User user = new User(1L, "fdsfd", "fdsfsdfsdfsdf", "fdsfdsfds","fdfdsf");
		return ResponseEntity.ok().body(user);
	}
}
