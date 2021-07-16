package com.revature.models;

public class Cat extends Animal {

	// Constructor
	public Cat(String status, String name, double age, String breed, String temperament, String owner) {
		// default properties
		this.setSpecies("Cat");
		
		// custom properties
		this.setStatus(status);
		this.setName(name);
		this.setAge(age);
		this.setBreed(breed);
		this.setTemperament(temperament);
		this.setOwner(owner);
		
		// calculate and set cost
		this.setPrice(age, this.getSpecies());
		
	}
	
	//methods
	@Override
	public String toString() {
		return String.format( "Name: %s%n"
							+ "Temperament: %s%n"
							+ "Breed: %s%n"
							+ "Age: %f%n"
							+ "Price: $%.2f%n", this.getName(), this.getTemperament(), this.getBreed(), this.getAge(), this.getPrice());
	}
		
}
