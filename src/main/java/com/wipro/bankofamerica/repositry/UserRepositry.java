package com.wipro.bankofamerica.repositry;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.bankofamerica.model.User;

@Repository
public interface UserRepositry extends JpaRepository<User, Serializable> {
	

	 public User findByUsername(String username);
	 
	 public User findByCity(String city);
	 

}
