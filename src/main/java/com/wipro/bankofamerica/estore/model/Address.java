package com.wipro.bankofamerica.estore.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long Id;
	private String street;
	private String city;
	private String state;
	private String zip;
	
	@ManyToOne
    @JoinColumn(name = "employee_id")
	@JsonBackReference
    private Employee employee;
	
	
	 public Address() {}

	 public Address(String street, String city, String state, String zip, Employee employee) {
	        this.street = street;
	        this.city = city;
	        this.state = state;
	        this.zip = zip;
	        this.employee = employee;
	    }
	 
	 
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	
	
	

}
