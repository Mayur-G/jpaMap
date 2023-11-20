package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Car1To1Bi")
public class CarOneToOneBi {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	@OneToOne(mappedBy = "car")
	private OwnerOneToOneBi ownerOneToOneBi;
	
	public CarOneToOneBi() {
		// TODO Auto-generated constructor stub
	}

	public CarOneToOneBi(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public OwnerOneToOneBi getOwnerOneToOneBi() {
		return ownerOneToOneBi;
	}

	public void setOwnerOneToOneBi(OwnerOneToOneBi ownerOneToOneBi) {
		this.ownerOneToOneBi = ownerOneToOneBi;
	}

	@Override
	public String toString() {
		return "CarOneToOneBi [id=" + id + ", name=" + name + "]";
	}
	
	
}
