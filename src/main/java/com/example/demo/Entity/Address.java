package com.example.demo.Entity;




import jakarta.persistence.CascadeType;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;

@Entity
//@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String street;
	private String city;
	private String state;
//	
//	//@OneToOne(mappedBy="address")
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="pers_id")
	private Person person;
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
	this.person = person;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

}
