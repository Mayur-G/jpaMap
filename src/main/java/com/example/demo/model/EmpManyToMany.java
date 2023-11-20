package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class EmpManyToMany {

	@Id
	private int eid;
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name="empp_projj",
			joinColumns = @JoinColumn(name="emp_idd"),
			inverseJoinColumns = @JoinColumn(name="proj_idd")
			)
	private List<ProjectManyToMany> projects = new ArrayList<ProjectManyToMany>();

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ProjectManyToMany> getProjects() {
		return projects;
	}

	public void setProjects(List<ProjectManyToMany> projects) {
		this.projects = projects;
	}

	public EmpManyToMany(int eid, String name, List<ProjectManyToMany> projects) {
		super();
		this.eid = eid;
		this.name = name;
		this.projects = projects;
	}
	
	public EmpManyToMany() {
	
	}
	
}
