package com.revature.services;

import com.revature.daos.UserDAO;
import com.revature.daos.UserDAOImpl;
import com.revature.models.Customer;

public class UserServiceImpl implements UserService {

	private UserDAO userDAO = new UserDAOImpl();
	
	@Override
	public double getFunds(String username) {
		double funds = 0;
		
		try {
			Customer user = (Customer) userDAO.getUser(username);
			funds = user.getFunds();
		} catch(ClassCastException ex) {
			System.out.println("Error: user is not a customer, could not get funds");
		}
		return funds;
	}

}
