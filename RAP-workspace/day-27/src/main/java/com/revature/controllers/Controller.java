package com.revature.controllers;

import java.util.Scanner;

import com.revature.services.UserService;
import com.revature.services.UserServiceImpl;
import com.revature.models.Customer;
import com.revature.models.Employee;
import com.revature.models.User;

public class Controller {
	// create user
	public static User user = null;
	private static UserService userService = new UserServiceImpl();
	
	// create scanner object
	public static Scanner scanner = new Scanner(System.in);
	
	// flag to keep track of whether or not user wants to keep using app
	public static boolean isRunning = true;
	
	public static void init() {
		// while the app is running...
		while (isRunning) {
			// ask user for choice #1: login, register, or quit
			int choice1 = displayLoginMenu();
			
			switch (choice1) {
				case 1: // call login service layer function
					
						// temporary hard-coded users to login with:
						user = new Customer("user1", "pass", "Geoffrey Webber", 100);
//						user = new Employee("employee1", "pass");
						
						break;
				case 2: // call register service layer function
						break;
				case 3: isRunning = false;
						displayGoodbyeMessage();
						break;
				default: System.out.println("Sorry, please enter a number from 1-3.");
						break;
			}
			
			// if user is an employee, have them make choice #2
			if (user != null && user instanceof Employee) {
				boolean isEmployee = true;
				while (isEmployee) {
					int choice2 = displayEmployeeMenu();
					
					switch(choice2) {
					case 1: // make service call to view available animals
								// have ability to add/remove/update animals
							break;
					case 2: // make service call to view current offers
								// have ability to accept/reject offers
							break;
					case 3: // make service call to view past adoptions
							break;
					case 4: user = null;
							isEmployee = false;
							break;
					case 5: isEmployee = false;
							isRunning = false;
							displayGoodbyeMessage();
							break;
					default: System.out.println("Sorry, please enter a number from 1-3.");
							break;
					}
				}
				
			} 
			// if user is a customer
			else if (user != null && user instanceof Customer) {
				boolean isCustomer = true;
				while (isCustomer) {
					int choice2 = displayCustomerMenu();
					
					switch(choice2) {
					case 1: // make service call to view available animals
								// have ability to make offer on an animal
							break;
					case 2: // make service call to view current offers
								// have ability cancel an offer made
							break;
					case 3: System.out.println("Current funds: " + userService.getFunds(user.getUsername()));
							break;
					case 4: user = null;
							isCustomer = false;
							break;
					case 5: isCustomer = false;
							isRunning = false;
							displayGoodbyeMessage();
							break;
					default: System.out.println("Sorry, please enter a number from 1-3.");
							break;
					}
				}
			}
			// else user not logged in, loop again
		}
	}
	
	public static void displayBanner() {
		System.out.printf("\n=======================================\n"
				+ "\nWelcome to MyAdoptionPlace!\n"
				+ "\n=======================================\n\n");
	}
	
	public static int displayLoginMenu() {
		displayBanner();
		System.out.println("1. Login\n2. Register\n3. Quit"); 
		int choice = 0;
		try {
			String text = scanner.nextLine();
			choice = Integer.parseInt(text);
		}catch(Exception ex){
			System.out.print("\nError: incorrect input!");
		}
		return choice;
	}
	
	public static int displayEmployeeMenu() {
		System.out.printf("\n=======================================\n"
				+ "\nEmployee Menu\n"
				+ "\n=======================================\n\n");
		
		System.out.printf("1. View current animals\n"
				+ "2. View current offers\n"
				+ "3. View past adoptions\n"
				+ "4. Log out\n"
				+ "5. Quit\n");
		
		int choice = 0;
		try {
			String text = scanner.nextLine();
			choice = Integer.parseInt(text);
		}catch(Exception ex){
			System.out.print("\nError: incorrect input!");
		}
		return choice;
	}
	
	public static int displayCustomerMenu() {
		System.out.printf("\n=======================================\n"
				+ "\nCustomer Menu\n"
				+ "\n=======================================\n\n");
		
		System.out.printf("1. View current animals\n"
				+ "2. View current offers\n"
				+ "3. View current funds\n"
				+ "4. Log out\n"
				+ "5. Quit\n");
		
		int choice = 0;
		try {
			String text = scanner.nextLine();
			choice = Integer.parseInt(text);
		}catch(Exception ex){
			System.out.print("\nError: incorrect input!");
		}
		return choice;
	}
	
	public static void displayGoodbyeMessage() {
		System.out.printf("\n\n\n======================================="
				+ "\n\n"
				+ "Thank you for using MyAdoptionPlace!"
				+ "\n\n"
				+ "=======================================\n\n\n");
	}
}
