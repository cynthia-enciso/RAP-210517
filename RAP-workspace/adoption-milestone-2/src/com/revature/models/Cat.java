package com.revature.models;

public class Cat extends Animal {

	// Constructor
	public Cat(String status, String name, double age, String breed, String temperament) {
		// default properties
		this.setSpecies("Cat");
		
		// custom properties
		this.setName(name);
		this.setAge(age);
		this.setBreed(breed);
		this.setTemperament(temperament);
		
		// calculate and set cost
		this.setPrice(age, this.getSpecies());
		
	}
	
	//methods
	@Override
	public String toString() {
		return String.format( "Name: %s%n"
							+ "Temperament: %s%n"
							+ "Breed: %s%n"
							+ "Age: %.1f%n"
							+ "Price: $%.2f%n", this.getName(), this.getTemperament(), this.getBreed(), this.getAge(), this.getPrice());
	}
		
}
