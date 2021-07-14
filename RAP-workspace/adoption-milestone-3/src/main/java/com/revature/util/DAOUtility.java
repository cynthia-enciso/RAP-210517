package com.revature.util;

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
}
