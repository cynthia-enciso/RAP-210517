package com.revature.models;

import java.util.List;

public class Customer extends User {
	// fields
	private String name;
	private double funds;
	private List<Animal> pets;
	
	// constructors
	public Customer(String username, String pass, String name) {
		super(username, pass);
		this.setName(name);
		this.setFunds(0);
	}
	
	public Customer(String username, String pass, String name, double funds) {
		super(username, pass);
		this.setName(name);
		this.setFunds(funds);
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
	public List<Animal> getPets() {
		return pets;
	}
	public void setPets(List<Animal> pets) {
		this.pets = pets;
	}
	
	@Override
	public String toString() {
		return "Username: " + this.getUsername() + "\nFunds: " + this.getFunds() + "\nPets: " + this.getPets();
	}
}
