package com.revature.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DAOUtility {

	// shared, constant values
	private static String CONNECTION_USERNAME;
	private static String CONNECTION_PASSWORD;
	private static String CONNECTION_URL;
	// create a connection object
	private static Connection connection;
	
	// static initialization block
		// need to be outside of methods, inside of class
		// code executed only once (whenever class is loaded into memory)
		// why are we using it? to initilize our static properties once we finally get to our sensitive data
	static {
		try {
			// https://mkyong.com/java/java-read-a-file-from-resources-folder/
			InputStream inputStream = DAOUtility.class.getClassLoader().getResourceAsStream("config.properties");
			Properties properties = new Properties();
			properties.load(inputStream);
			
			// get property, return named variable
				// the names I gave the strings can be anything, but they contain
				// the variable name
			String CONNECTION_USERNAME_VAR = properties.getProperty("CONNECTION_USERNAME");
			String CONNECTION_PASSWORD_VAR = properties.getProperty("CONNECTION_PASSWORD");
			String CONNECTION_URL_VAR = properties.getProperty("CONNECTION_URL");
			
			// now that we have the names of the variables, use getenv 
			// to then get the variable and set are fields to the respective values
			CONNECTION_USERNAME = System.getenv(CONNECTION_USERNAME_VAR);
			CONNECTION_PASSWORD = System.getenv(CONNECTION_PASSWORD_VAR);
			CONNECTION_URL = System.getenv(CONNECTION_URL_VAR);
			
			//another way to do it
			CONNECTION_USERNAME = System.getenv(properties.getProperty("CONNECTION_USERNAME"));
			CONNECTION_PASSWORD = System.getenv(properties.getProperty("CONNECTION_PASSWORD"));
			CONNECTION_URL = System.getenv(properties.getProperty("CONNECTION_URL"));
			
			// close stream
			inputStream.close();
		} catch(IOException ex) {
			System.out.println("Failed to load from properties file.");
			ex.printStackTrace();
		}
				
	}
	
	public static Connection getConnection() throws SQLException {
		// try to register driver (not necessary if in class path)
		try {
			// registers a driver to driver manager: class responsible for getting a connection
			Class.forName("org.postgresql.Driver");
		}catch(ClassNotFoundException ex) {
			System.out.println("Could not register driver!");
			ex.printStackTrace();
		}
		
		if (connection == null || connection.isClosed()) {
			connection = DriverManager.getConnection(CONNECTION_URL, CONNECTION_USERNAME, CONNECTION_PASSWORD);
		}
		return connection;
	}
}
