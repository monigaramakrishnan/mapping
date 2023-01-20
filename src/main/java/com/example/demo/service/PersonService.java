package com.example.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Person;
import com.example.demo.repo.PersonRepo;

@Service
public class PersonService {
	
	@Autowired
	PersonRepo prepo;
	
	public Person addPersonDetails(Person person)
	{
		//Person per=new Person();
		//per.setPersonName(person.getPersonName());
		//per.setAddress(person.getAddress());
		return prepo.save(person);
		
	}
	
	public List<Person> getAllPersonDetails()
	{
		List<Person> p=new ArrayList<>();
		//return  prepo.findAll().iterator().forEachRemaining(p::add);
		return prepo.findAll();
		//return StreamSupport.stream(repo.findAll().sp, false)
		
	}

}
