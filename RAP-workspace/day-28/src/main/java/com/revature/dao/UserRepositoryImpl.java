package com.revature.dao;

import java.util.List;

import com.revature.models.Animal;
import com.revature.models.Customer;
import com.revature.models.User;

public class UserRepositoryImpl implements UserRepository {

	private UserDAO userDAO = new UserDAOImpl();
	private AnimalDAO animalDAO = new AnimalDAOImpl();
	
	@Override
	public User getUser(String username) {
		Customer user = (Customer) userDAO.getUser(username);
		List<Animal> animals = animalDAO.getAnimalsOfUser(username);
		
		user.setPets(animals);
		return user;
	}
	
	public static void main(String[] args) {
		UserRepository userRepo = new UserRepositoryImpl();
		
		User user = userRepo.getUser("user1");
		
		System.out.println(user);
		
	}
}
