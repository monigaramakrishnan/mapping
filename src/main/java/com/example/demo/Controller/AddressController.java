package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Address;
import com.example.demo.service.AddressService;

@RestController
public class AddressController {
	
	@Autowired
	AddressService addservice;
	
	@PostMapping("/addAddress")
	public Address addAddress(@RequestBody Address address) {
		return addservice.addAddressDetails(address);
		
	}
	
	@GetMapping
	public List<Address> getAllAddress()
	{
		return addservice.getAllAddressDetails();
	}

}
