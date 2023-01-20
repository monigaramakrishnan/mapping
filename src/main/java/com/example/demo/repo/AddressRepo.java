package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

//import com.example.demo.Entity.Address;

import com.example.demo.Entity.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {

}
