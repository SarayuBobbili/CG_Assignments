package com.cg.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="Bank")
public class Bank {
	
	@Id
	@Column(name="id")
    private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="dept")
	private String dept;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	
	  public String toString() { return "Bank [id=" + id + ", name=" + name +
	  ", dept=" + dept + "]"; }
	 
	
}
