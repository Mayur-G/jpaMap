package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class ProjectManyToMany {
	
	@Id
	private int pid;
	private String projectName;
	
	@ManyToMany(mappedBy = "projects",cascade = { CascadeType.ALL })
	private List<EmpManyToMany> emps = new ArrayList<EmpManyToMany>();

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<EmpManyToMany> getEmps() {
		return emps;
	}

	public void setEmps(List<EmpManyToMany> emps) {
		this.emps = emps;
	}

	public ProjectManyToMany(int pid, String projectName, List<EmpManyToMany> emps) {
		super();
		this.pid = pid;
		this.projectName = projectName;
		this.emps = emps;
	}
	
	public ProjectManyToMany() {
		
	}
}
