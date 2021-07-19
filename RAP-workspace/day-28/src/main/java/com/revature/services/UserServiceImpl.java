package com.revature.services;

import com.revature.dao.UserDAO;
import com.revature.dao.UserDAOImpl;
import com.revature.models.Customer;

public class UserServiceImpl implements UserService {

	private UserDAO userDAO = new UserDAOImpl();
	
	@Override
	public double getFunds(String username) {
		double funds = 0;
		
		try {
			Customer user = (Customer) userDAO.getUser(username);
			funds = user.getFunds();
		} catch (ClassCastException ex) {
			System.out.println("User is not a Customer!");
			ex.printStackTrace();
		}
		
		return funds;
	}

}
