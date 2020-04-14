package com.cg.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Student;

@RestController
@RequestMapping
public class Controller {
	
List<Student> e=new ArrayList<>();
	
	public Controller() {
		e.add(new Student(1,"Sarayu","CSE","LPU"));
		e.add(new Student(2,"B","ECE","LPU"));
				
	}
	@RequestMapping(value="/{name}", method=RequestMethod.GET)
	public String index(@PathVariable String name) {
		return "Welcome to Sring Boot!" + name;
	}

	@RequestMapping(value="/", method=RequestMethod.GET)
	public List<Student> index() {

		return e ;
	}
	

	@RequestMapping("/greet")
	public String greet() {
		return "Greetings from Spring Boot!";
	}

}
