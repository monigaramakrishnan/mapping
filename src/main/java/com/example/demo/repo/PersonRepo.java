package com.example.demo.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Integer> {
	

}
