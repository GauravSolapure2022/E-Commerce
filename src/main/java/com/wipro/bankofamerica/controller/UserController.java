package com.wipro.bankofamerica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.bankofamerica.model.User;
import com.wipro.bankofamerica.service.UserService;

@RestController
@RequestMapping("/Product")
public class UserController {
	
	@Autowired
	private UserService userservice;
	

	@PostMapping("/saveProduct")
	public ResponseEntity<User>saveUser(@RequestBody User user)
	{
		return userservice. saveUser(user);
	}
	

	@GetMapping("/getAllUsers")
	public ResponseEntity<List<User>>getAllUsers()
	{
		 return userservice.getAllUsers();
	}
	
	@GetMapping("/getSingleUser/{uid}")
	public ResponseEntity<User>getSingleUser(@PathVariable  Integer uid)
	{
		return userservice.getSingleUser(uid);
	}
	
	@GetMapping ("/getUserByuserName/{username}")
	public ResponseEntity<User>getUserByUserName(@PathVariable String username)
	{
		 return userservice.getUserByUserName(username);
	}
	
	@GetMapping("/getUserByCity/{city}")
	public ResponseEntity<List<User>>getUserByCity(@PathVariable String city)
	{
		return userservice.getUserByCity(city);
		
	}
	
	@DeleteMapping("/deleteUserById/{uid}")
	public ResponseEntity<User>deleteUserById(@PathVariable Integer uid)
	{
		return userservice.deleteById(uid);
	}
	
	@PutMapping("/updateUse")
	public ResponseEntity<User>updateUser(@RequestBody User user)
	{
		return userservice.updateUser(user);
	}

}
