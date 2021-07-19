package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.controllers.Controller;
import com.revature.models.Cat;
import com.revature.models.Customer;
import com.revature.models.Dog;
import com.revature.models.Employee;
import com.revature.models.User;
import com.revature.util.DAOUtility;

public class UserDAOImpl implements UserDAO {
	
	private Connection connection;
	private PreparedStatement statement;
	private static final Logger LOG = LogManager.getLogger(Controller.class);
	
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
			LOG.error("Error: Cannot get user.", ex);
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
			LOG.error("Error: Could not close resources.", ex);
		}
	}
	
	public static void main(String[] args) {
		UserDAO userDAO = new UserDAOImpl();
		
		User user = userDAO.getUser("user1");
		System.out.println(user);
	}
}
