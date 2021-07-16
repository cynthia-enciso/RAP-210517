package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.models.Customer;
import com.revature.models.Employee;
import com.revature.models.User;
import com.revature.utils.DAOUtility;

public class UserDAOImpl implements UserDAO {

	private Connection connection;
	private PreparedStatement statement;
	
	@Override
	public User getUser(String text) {
		
		User user = null;
		
		try {
			connection = DAOUtility.getConnection();
			String sql = "select * from users where username = ?;";
			statement = connection.prepareStatement(sql);
			statement.setString(1, text);
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {
				String username = rs.getString("username");
				String name = rs.getString("pass");
				String pass = rs.getString("name");
				double funds = rs.getDouble("funds");
				
				// user is a customer
				if (name != null && funds != 0) {
					user = new Customer(username, pass, name, funds);
				} else {
					user = new Employee(username, pass);
				}
			}
			
			return user;
			
		} catch(SQLException ex) {
			System.out.println("Error: Cannot get user.");
			ex.printStackTrace();
		} finally {
			closeResources();
		}

		return user;
	}

	private void closeResources() {
		try {
			if (statement != null && !statement.isClosed()) {
				statement.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		} catch(SQLException ex) {
			System.out.println("Error: Could not close resources.");
			ex.printStackTrace();
		}
	}

}
