package com.cg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.dao.Bank;
import com.cg.dao.Dao;
import com.cg.dao.DaoAccess;
import com.cg.dao.EmployeeImpl;

@SpringBootApplication
public class SprintBootDemoApplication implements CommandLineRunner{
	
	@Autowired
	EmployeeImpl e;
	
	@Autowired
	Bank b1;
	@Autowired
    DaoAccess dao;
	@Autowired
	Dao d;
	public static void main(String[] args) {
		
		SpringApplication.run(SprintBootDemoApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception
	{/*
		 * b1.setId(7); b1.setName("Sarayu"); b1.setDept("Analyst");
		 * 
		 * e.create(b1); System.out.println("inserted");
		 */
		System.out.println("retrieved");
		List<Bank> l=dao.retrieve();
		for(Bank b:l)
		{
			System.out.println(b.getId()+ " "+ b.getName()+" "+b.getDept());
		}
		
		System.out.println(d.findById(7));
	}

}
