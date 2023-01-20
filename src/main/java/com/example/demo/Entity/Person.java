package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;

import lombok.ToString;



@Entity

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String personName;
	
	//@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn//(name="add_id")
	//@PrimaryKeyJoinColumn
	//@Embedded
	@JsonIgnore
	@OneToOne(mappedBy="person",cascade = CascadeType.ALL)
	private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	

}
