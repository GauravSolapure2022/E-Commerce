package com.wipro.bankofamerica.estore.model;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;



@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstName;
	private String lastName;
	private String emailId;
	private String city;
	
	


	 @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
	    private List<Address> address = new ArrayList<>();

	    // Getters and setters
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public String getEmailId() {
	        return emailId;
	    }

	    public void setEmailId(String emailId) {
	        this.emailId = emailId;
	    }

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    public List<Address> getAddress() {
	        return address;
	    }

	    public void setAddress(List<Address> address) {
	        this.address = address;
	    }

}
