package com.revature.models;

import java.util.ArrayList;

public class Customer extends User {
	// fields
	private String name;
	private double funds;
	private ArrayList<Animal> pets;
	
	// constructors
	public Customer(String username, String pass, String name) {
		super(username, pass);
		this.setName(name);
		this.setFunds(100);
	}
		
	// getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFunds() {
		return funds;
	}
	public void setFunds(double funds) {
		this.funds = funds;
	}
	public ArrayList<Animal> getPets() {
		return pets;
	}
	public void setPets(ArrayList<Animal> pets) {
		this.pets = pets;
	}
	
	
}
