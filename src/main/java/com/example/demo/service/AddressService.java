package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Address;
import com.example.demo.repo.AddressRepo;

@Service
public class AddressService {
	
	@Autowired
	AddressRepo addrepo;
	
	
	public Address addAddressDetails (Address address)
	{
		Address add=new Address();
		//.add.setId(address.getId());
		add.setState(address.getState());
		add.setCity(address.getCity());
		add.setStreet(address.getStreet());
		add.setPerson(address.getPerson());
		return addrepo.save(add);
	}


	public List<Address> getAllAddressDetails() {
		// TODO Auto-generated method stub
		return addrepo.findAll();
	}

}
