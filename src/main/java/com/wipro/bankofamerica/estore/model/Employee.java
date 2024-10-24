package com.wipro.bankofamerica.estore.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private long Id;

	private String firstName;

	private String lastName;

	private String emailId;

	private String city;

  //@OneToMany(cascade = CascadeType.ALL,)
	//@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
	//private List<Address> addresses;
    @OneToMany(cascade = CascadeType.ALL , mappedBy = "employee" )
     @JsonManagedReference
     private List<Address> addresses ;
	public Employee() {
	}

	public Employee(String firstName, String lastName, String emailId, String city, List<Address> addresses) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.city = city;
		this.addresses = addresses;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
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

}
