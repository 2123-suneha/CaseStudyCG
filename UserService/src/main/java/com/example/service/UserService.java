package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repository.UserRepository;

@Service
public class UserService {
		@Autowired
		private UserRepository userRepository;
		
		public User saveUser(User user) {
			return userRepository.save(user);
		}
		 public Optional<User> getUserById(long id) {
		        return userRepository.findById(id);
		    }
		 public void deleteUser(long id) {
		        userRepository.deleteById(id);
		    }
}