package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Animal;
import com.revature.models.Cat;
import com.revature.models.Dog;
import com.revature.utils.DAOUtility;

public class AnimalDAOImpl implements AnimalDAO {

	// fields
	private Connection connection;
	private PreparedStatement statement;
	
	// methods
	@Override
	public boolean addAnimal(Animal animal) {
		try {
			// make connection
			connection = DAOUtility.getConnection();
			String sql = "insert into animals values (default, ?, ?, ?, ?, ?, ?, ?, ?);";
			statement = connection.prepareStatement(sql);
			
			statement.setString(1, animal.getStatus());
			statement.setString(2, animal.getName());
			statement.setDouble(3, animal.getPrice());
			statement.setDouble(4, animal.getAge());
			statement.setString(5, animal.getBreed());
			statement.setString(6, animal.getSpecies());
			statement.setString(7, animal.getTemperament());
			statement.setString(8, animal.getOwner());
			
			return statement.executeUpdate() != 0;
			
		} catch(SQLException ex) {
			System.out.println("Error: cannot add animal.");
			ex.printStackTrace();
			return false;
		} finally {
			closeResources();
		}
	}

	@Override
	public Animal getAnimal(String text) {
Animal animal = null;
		
		try {
			connection = DAOUtility.getConnection();
			String sql = "select * from animals where name = ?;";
			statement = connection.prepareStatement(sql);
			statement.setString(1, text);
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {
				String status = rs.getString("status");
				String name = rs.getString("name");
				double age = rs.getDouble("age");
				String breed = rs.getString("breed");
				String species = rs.getString("species");
				String temperament = rs.getString("temperament");
				String ownerName = rs.getString("owner_username");
				
				if (species.equals("Dog")) {
					animal = new Dog(status, name, age, breed, temperament, ownerName);
				} else {
					animal = new Cat(status, name, age, breed, temperament, ownerName);
				}
			}
			
		} catch(SQLException ex) {
			System.out.println("Error: Cannot get specified animal.");
			ex.printStackTrace();
		} finally {
			closeResources();
		}

		return animal;
	}

	@Override
	public List<Animal> getAllAnimals() {
		List<Animal> animals = new ArrayList<>();
		
		try {
			connection = DAOUtility.getConnection();
			String sql = "select * from animals;";
			statement = connection.prepareStatement(sql);
		
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {
				String status = rs.getString("status");
				String name = rs.getString("name");
				double age = rs.getDouble("age");
				String breed = rs.getString("breed");
				String species = rs.getString("species");
				String temperament = rs.getString("temperament");
				String ownerName = rs.getString("owner_username");
				
				if (species.equals("Dog")) {
					animals.add(new Dog(status, name, age, breed, temperament, ownerName));
				} else {
					animals.add(new Cat(status, name, age, breed, temperament, ownerName));
				}
			}
			
		} catch(SQLException ex) {
			System.out.println("Error: Cannot get animals.");
			ex.printStackTrace();
		} finally {
			closeResources();
		}

		return animals;
	}

	@Override
	public List<Animal> getAnimalsOfUser(String username) {
List<Animal> animals = new ArrayList<>();
		
		try {
			connection = DAOUtility.getConnection();
			String sql = "select * from animals where owner_username = ?;";
			statement = connection.prepareStatement(sql);
			statement.setString(1, username);
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {
				String status = rs.getString("status");
				String name = rs.getString("name");
				double age = rs.getDouble("age");
				String breed = rs.getString("breed");
				String species = rs.getString("species");
				String temperament = rs.getString("temperament");
				String ownerName = rs.getString("owner_username");
				
				if (species.equals("Dog")) {
					animals.add(new Dog(status, name, age, breed, temperament, ownerName));
				} else {
					animals.add(new Cat(status, name, age, breed, temperament, ownerName));
				}
			}
			
		} catch(SQLException ex) {
			System.out.println("Error: Cannot get specified animals.");
			ex.printStackTrace();
		} finally {
			closeResources();
		}

		return animals;
	}

	@Override
	public boolean updateAnimalStatus(String text, String value) {
		try {
			connection = DAOUtility.getConnection();
			String sql = "update animals set status = ? where name = ?;";
			statement = connection.prepareStatement(sql);
			statement.setString(1, value);
			statement.setString(2, text);
			return statement.executeUpdate() != 0;
		} catch(SQLException ex) {
			System.out.println("Error: Cannot get specified animal.");
			ex.printStackTrace();
			return false;
		} finally {
			closeResources();
		}
	}

	@Override
	public boolean removeAnimal(String text) {
		try {
			connection = DAOUtility.getConnection();
			String sql = "delete from animals where name = ?;";
			statement = connection.prepareStatement(sql);
			statement.setString(1, text);
			return statement.executeUpdate() != 0;
		} catch(SQLException ex) {
			System.out.println("Error: Cannot get specified animal.");
			ex.printStackTrace();
			return false;
		} finally {
			closeResources();
		}
	}
	
	public void closeResources() {
		try {
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
			if (statement != null && !statement.isClosed()) {
				statement.close();
			}
			
		} catch(SQLException ex) {
			System.out.println("Error: could not close resources.");
			ex.printStackTrace();
		}
	}
	
	// just for testing purposes
	public static void main(String[] args) {
		AnimalDAO animalDAO = new AnimalDAOImpl();
		// look up animals from the db
		List<Animal> animals = animalDAO.getAllAnimals();
//		
//		for (Animal animal : animals) {
//			System.out.println(animal);
//		}
//		
//		// add animal to db
//		Animal dog = new Dog("Available", "Daisy", 0.2, "Shih-Tzu", "Friendly", null);
//		System.out.println("Added animal: " + animalDAO.addAnimal(dog));
//		
//		// look up animals from the db
//		animals = animalDAO.getAllAnimals();
//		
//		for (Animal animal : animals) {
//			System.out.println(animal);
//		}
		
		// look up a specific animal from the db
		Animal animal1 = animalDAO.getAnimal("Daisy");
		System.out.println(animal1);
		
		// update a specific animal
		System.out.println(animalDAO.updateAnimalStatus("Daisy", "Unavailable"));
		
		// remove an animal
		System.out.println(animalDAO.removeAnimal("Daisy"));
		
		animals = animalDAO.getAllAnimals();
//		
		for (Animal animal : animals) {
			System.out.println(animal);
		}
	}

}
