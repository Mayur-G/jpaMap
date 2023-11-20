package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Onwer1To1Bi")
public class OwnerOneToOneBi {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	@OneToOne
	@JoinColumn(name="car_id",referencedColumnName = "id")
	private CarOneToOneBi car;
	
	public OwnerOneToOneBi() {
		// TODO Auto-generated constructor stub
	}

	public OwnerOneToOneBi(String name) {
		super();
		this.name = name;
	}

	public CarOneToOneBi getCar() {
		return car;
	}

	public void setCar(CarOneToOneBi car) {
		this.car = car;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "OwnerOneToOneBi [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}
