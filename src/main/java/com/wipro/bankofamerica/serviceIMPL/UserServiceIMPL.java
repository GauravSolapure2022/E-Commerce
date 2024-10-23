package com.wipro.bankofamerica.serviceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.model.User;
import com.wipro.bankofamerica.repositry.UserRepositry;
import com.wipro.bankofamerica.service.UserService;

@Service
public class UserServiceIMPL implements UserService {
	
	@Autowired
	private UserRepositry userRepo;

	@Override
	public ResponseEntity<User> saveUser(User user) {
		

		if (userRepo.existsById(user.getUid())) 
		{
			return new ResponseEntity<User>(user, HttpStatus.ALREADY_REPORTED);
		}
		
		else {
			return new ResponseEntity<User>((User) userRepo.save(user), HttpStatus.CREATED);
		}
		
	}

	@Override
	public ResponseEntity<List<User>> getAllUsers() {
		
		
		return new ResponseEntity<List<User>>(userRepo.findAll(), HttpStatus.OK);
		
	
	}

	@Override
	public ResponseEntity<User> getSingleUser(Integer uid) {
		

		if (userRepo.existsById(uid)) 
		{
			return new ResponseEntity<User>((User) userRepo.findById(uid).get(),HttpStatus.ACCEPTED);
		}
		else {
			
			return new ResponseEntity<User>(new User(),HttpStatus.BAD_REQUEST);
		}
	
		
	}

	@Override
	public ResponseEntity<User> getUserByUserName(String username) {
		
		return new ResponseEntity<User>(userRepo.findByUsername(username),HttpStatus.ACCEPTED);
		
	}

	@Override
	public ResponseEntity<List<User>> getUserByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<User> deleteById(Integer uid) {
		

		if (userRepo.existsById(uid)) 
		{
			User user =(User) userRepo.findById(uid).get();
			userRepo.deleteById(uid);
			
			return new ResponseEntity<User>(user, HttpStatus.ACCEPTED);
		}
		
		else {
			
			return new ResponseEntity<User>(new User(),HttpStatus.BAD_REQUEST);
		}		

		
	}

	@Override
	public ResponseEntity<User> updateUser(User user) {
		
		  if(userRepo.existsById(user.getUid()))
	      {
	    	  userRepo.save(user);
	    	  return new ResponseEntity<User>((User) userRepo.save(user), HttpStatus.CREATED);
	      }
	      
	      else {
			 return new ResponseEntity<User>(user ,HttpStatus.CONFLICT);
		}
	}
	


}
