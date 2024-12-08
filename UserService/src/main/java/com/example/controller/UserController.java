package com.example.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
		@Autowired
		private UserService userService;
		
		@PostMapping("/create")
		public ResponseEntity<User> createUser(@RequestBody User user) {
		    System.out.println("Received User: " + user);
		    User createdUser = userService.saveUser(user);
		    return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
		}

		@GetMapping("/{id}")
	    public User getUserById(@PathVariable long id) {
	        Optional<User> userOptional = userService.getUserById(id);
	        return userOptional.orElse(null);
	    }
		 @DeleteMapping("/{id}")
		    public ResponseEntity<String> deleteUser(@PathVariable long id) {
		        userService.deleteUser(id);
		        return new ResponseEntity<>("User deleted successfully.", HttpStatus.OK);
		    }
		 @GetMapping("/test")
		 public String test() {
			 return "all good";
		 }
}
