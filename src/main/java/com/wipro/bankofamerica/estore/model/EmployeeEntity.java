package com.wipro.bankofamerica.estore.model;

import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class EmployeeEntity {

	@GeneratedValue(strategy = GenerationType.AUTO)
@Id
	private int id;
	private String firstName;
	private String lastName;
	private  String emailId;
	private  String city;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "employee_id")
    private List<AddressesEntity> addresses;
    

}
