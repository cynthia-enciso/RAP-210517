package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnection {
	// we need our postgres login information
	private static final String CONNECTION_USERNAME = "postgres";
	// forgot your password? run script:
		// alter user postgres with password 'new password';
		// and then right click on your server in postgres, edit connection, and change password
	private static final String CONNECTION_PASSWORD = "pass";
	// Connection URL follows this format:
		// protocol://ip or domain:port/database name
	private static final String CONNECTION_URL = "jdbc:postgresql://localhost:5432/postgres";
	
	// test connection
	public static void main(String[] args) {
		// try to register our driver: optional
		try {
			// registers a driver to driver manager: class responsible for getting a connection
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException ex) {
			System.out.println("Could not register driver!");
			ex.printStackTrace();
		}
		
		// try to connect 
		try {
			Connection connection = DriverManager.getConnection(CONNECTION_URL, CONNECTION_USERNAME, CONNECTION_PASSWORD);
			System.out.println("Connection is valid: " + connection.isValid(5));
			connection.close();
		} catch (SQLException ex) {
			System.out.println("Failed to connect!");
			ex.printStackTrace();
		}
	}
}
