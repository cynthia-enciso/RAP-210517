package com.revature.daos;

import java.util.List;

import com.revature.models.Animal;

public interface AnimalDAO {
	// define the behavior that the implementing classes need to have
	
	// CRUD operations
	
	// create animal
	public boolean addAnimal(Animal animal);
	
	// read animal(s)
	public Animal getAnimal(String text);
	
	public List<Animal> getAllAnimals();
	
	public List<Animal> getAnimalsOfUser(String username);
	
	// update animal
	public boolean updateAnimalStatus(String text, String value);
	
	// delete animal
	public boolean removeAnimal(String text);
}
