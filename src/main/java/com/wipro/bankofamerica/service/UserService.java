package com.wipro.bankofamerica.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.model.User;

@Service
public interface UserService {

	ResponseEntity<User> saveUser(User user);

	ResponseEntity<List<User>> getAllUsers();

	ResponseEntity<User> getSingleUser(Integer uid);

	ResponseEntity<User> getUserByUserName(String username);

	ResponseEntity<List<User>> getUserByCity(String city);

	ResponseEntity<User> deleteById(Integer uid);

	ResponseEntity<User> updateUser(User user);
	
	

}
