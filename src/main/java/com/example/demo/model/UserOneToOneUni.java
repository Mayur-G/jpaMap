package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="User1Uni")
public class UserOneToOneUni {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	private String name;
	
	@OneToOne
	@JoinColumn(name = "address_id",referencedColumnName = "id")
	private AddressOneToOneUni addressOneToOneUni;

	public UserOneToOneUni(String name, AddressOneToOneUni addressOneToOneUni) {
		super();
		this.name = name;
		this.addressOneToOneUni = addressOneToOneUni;
	}
	
	
}
