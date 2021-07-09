package com.revature.models;

public class Dog extends Animal {
	
	// Constructor
	public Dog(String name, int age, String breed, String temperament) {
		// default properties
		this.setSpecies("Dog");
		this.setStatus("Available");
		
		// custom properties
		this.setName(name);
		this.setAge(age);
		this.setBreed(breed);
		this.setTemperament(temperament);
		
		// calculate and set cost
		this.setPrice(age, this.getSpecies());
	}
	
	// methods
	@Override
	public String toString() {
		return String.format( "Name: %s%n"
							+ "Temperament: %s%n"
							+ "Breed: %s%n"
							+ "Age: %d%n"
							+ "Price: $%.2f%n", this.getName(), this.getTemperament(), this.getBreed(), this.getAge(), this.getPrice());
	}
}
