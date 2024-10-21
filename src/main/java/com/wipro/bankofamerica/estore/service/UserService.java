package com.wipro.bankofamerica.estore.service;

import org.springframework.stereotype.Service;

import com.wipro.bankofamerica.estore.model.User;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {

    	public User loginUser(String username, String password);
    	
	    public User saveUser(User user);

	    public List<User> getAllUser();

	    public List<User> getListByCity(String city);

	    public Optional<User> getUserByUserName(String username);

}
