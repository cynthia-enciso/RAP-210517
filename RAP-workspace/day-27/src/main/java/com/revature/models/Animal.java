package com.revature.models;

public abstract class Animal {
	// fields
	private String status;
	private String name;
	private double price;
	private double age;
	private String breed;
	private String temperament;
	private String species;
	private String ownerName;
	
	// getters and setters
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	/*
	 * Dog prices: puppy = 25, adult = 20, senior = 15
	 * Cat prices: kitten = 20, adult = 15, senior = 10 
	 */
	public void setPrice(double age, String type) {
		switch (type) {
		case "Dog": if (age < 1) {
						this.price = 25;
					} else if (age > 10) {
						this.price = 15;
					} else  {
						this.price = 20;
					}
					break;
		case "Cat": if (age < 1) {
						this.price = 20;
					} else if (age > 10) {
						this.price = 10;
					} else  {
						this.price = 15;
					}
					break;
		default: /* TODO: something here */
					break;
		}
		
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getTemperament() {
		return temperament;
	}
	public void setTemperament(String temperament) {
		this.temperament = temperament;
	}
	
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getOwner() {
		return ownerName;
	}
	public void setOwner(String ownerName) {
		this.ownerName = ownerName;
	}
	
	
}
