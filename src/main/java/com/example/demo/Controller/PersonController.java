package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Person;
import com.example.demo.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	PersonService perservice;
	
	@PostMapping("/addPerson")
	public Person addPerson(@RequestBody Person person)
	{
		return perservice.addPersonDetails(person);
	}
	
	@GetMapping("/getPerson")
	public List<Person> geAlltPerson()
	{
		return perservice.getAllPersonDetails();
	}

}
