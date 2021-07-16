package com.revature.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import com.revature.models.Animal;
import com.revature.models.Cat;
import com.revature.models.Dog;

public class DAOUtility {
	private static String CONNECTION_USERNAME;
	private static String CONNECTION_PASSWORD;
	private static String CONNECTION_URL;
	private static Connection connection;
	
	// static initialization block: 
		// need to be outside of methods, inside of class
		// code executed only once (whenever class is loaded into memory)
		// why are we using it? to initilize our static properties once we finally get to our sensitive data
	static {
		try {
			// get reference to properties file
			DAOUtility.class.getClassLoader();
			InputStream input = ClassLoader.getSystemResourceAsStream("config.properties");
			Properties properties = new Properties();
			properties.load(input);
			
			// take values from keys in file
			String CONNECTION_USERNAME_VAR = properties.getProperty("CONNECTION_USERNAME");
			String CONNECTION_PASSWORD_VAR = properties.getProperty("CONNECTION_PASSWORD");
			String CONNECTION_URL_VAR = properties.getProperty("CONNECTION_URL");
			
			CONNECTION_USERNAME = System.getenv(CONNECTION_USERNAME_VAR);
			CONNECTION_PASSWORD = System.getenv(CONNECTION_PASSWORD_VAR);
			CONNECTION_URL = System.getenv(CONNECTION_URL_VAR);
			
			// shorter step 
			CONNECTION_USERNAME = System.getenv(properties.getProperty("CONNECTION_USERNAME"));
			CONNECTION_PASSWORD = System.getenv(properties.getProperty("CONNECTION_PASSWORD"));
			CONNECTION_URL = System.getenv(properties.getProperty("CONNECTION_URL"));
			
			input.close();
		} catch(IOException ex) {
			System.out.println("Failed to load properties from file.");
			ex.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException ex) {
			System.out.println("Could not register driver!");
			ex.printStackTrace();
		}
		
		if (connection == null || connection.isClosed()) {
			connection = DriverManager.getConnection(CONNECTION_URL, CONNECTION_USERNAME, CONNECTION_PASSWORD);
		}
		
		return connection;
	}
	
	
	// test
	public static void main(String[] args) {
		// calling method that uses a statement
			// processed on db side
//		getAllAnimals();
		
		// calling a method that uses a statement and allows for sql injection
//		getAnimalByNameNotPrepared("Chloe");
//		getAnimalByNameNotPrepared("'; truncate table animals cascade; --");
		
//		System.out.println("Try to get animals again: ");
//		getAllAnimals();
		
		// calling a method that uses a prepared statement
		getAllAnimals();
		getAnimalByNamePrepared("Chloe");
		getAnimalByNamePrepared("'; truncate table animals cascade; --");
		
		System.out.println("Try to get animals again: ");
		getAllAnimals();
	}
	
	
	// statement
	public static void getAllAnimals() {
		try (Connection connection = getConnection();
			 Statement statement = connection.createStatement();
			) {
			
			ResultSet rs = statement.executeQuery("select * from animals");
			
			ArrayList<Animal> animals = new ArrayList<>();
			
			while (rs.next()) {
				String status = rs.getString("status");
				String name = rs.getString("name");
				double price = rs.getDouble("price");
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
			
			System.out.println("");
			for(Animal animal : animals) {
				System.out.println(animal);
			}
			
			
			// might not be reached if exception thrown
//			connection.close();
//			statement.close();
		} catch(SQLException ex) {
			System.out.println("Could not get all animals.");
			ex.printStackTrace();
		} finally {
			// cannot see locally scoped variables in try block
//			connection.close();
//			statement.close();
		}
	}
	
	public static void getAnimalByNameNotPrepared(String text) {
		
		String sql = "Select * from animals where name = '" + text + "'";
		
		try (Connection connection = getConnection();
			Statement statement = connection.createStatement();
			){
			
			statement.execute(sql);
			ResultSet rs = statement.getResultSet();
			
			while (rs.next()) {
				String status = rs.getString("status");
				String name = rs.getString("name");
				double price = rs.getDouble("price");
				double age = rs.getDouble("age");
				String breed = rs.getString("breed");
				String species = rs.getString("species");
				String temperament = rs.getString("temperament");
				String ownerName = rs.getString("owner_username");
				System.out.println(status + "\n" + name + "\n" +
						breed + "\n" + species);
			}
			
		} catch (SQLException ex) {
			System.out.println("Failure");
			ex.printStackTrace();
		}
	}
	
	public static void getAnimalByNamePrepared(String text) {
		String sql = "Select * from animals where name = ?";
		
		try (Connection connection = getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			){
			
			// first parameter: parameter's place in prepared statement
			// second parameter: value to pass in 
			statement.setString(1, text);
			statement.executeQuery();
			ResultSet rs = statement.getResultSet();
			
			while (rs.next()) {
				String status = rs.getString("status");
				String name = rs.getString("name");
				double price = rs.getDouble("price");
				double age = rs.getDouble("age");
				String breed = rs.getString("breed");
				String species = rs.getString("species");
				String temperament = rs.getString("temperament");
				String ownerName = rs.getString("owner_username");
				System.out.println(status + "\n" + name + "\n" +
						breed + "\n" + species);
			}
		} catch (SQLException ex) {
			System.out.println("Failure");
			ex.printStackTrace();
		}
	}
}
