package com.revature.dao;

import java.util.List;

import com.revature.models.Animal;

//can be used with any kind of concrete database implementation
public interface AnimalDAO {
	//specify CRUD operations that should be created by concrete class
	
	// create
	public boolean addAnimal(Animal animal);
	
	// read
	public List<Animal> getAllAnimals();
	
	public List<Animal> getAnimalsOfUser(String username);
	
	public Animal getAnimal(String name);
	
	
	
	// update
	public boolean updateAnimalStatus(String name, String value);
	
	// delete
	// can be overloaded
	public boolean removeAnimal(String name);
}
