package com.revature.test.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.ArgumentMatchers.anyString;
//importing a static method
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.revature.dao.UserDAO;
import com.revature.models.Customer;
import com.revature.models.Employee;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTester {

	@Mock
	private static UserDAO userDAO;
	
	@BeforeClass
	public static void setUpBeforeClass() {
		System.out.println("Running once before all tests");
		// another way to mock with mockito
		// userDAO = mock(UserDAO.class);
	}
	
	@Before
	public void setUpBeforeEachTest() {
		System.out.println("Running before each test.");
	}
	
	@After
	public void tearDownAfterEachTest() {
		System.out.println("Running after each test.");
	}
	
	@AfterClass
	public static void tearDownAfterClass() {
		System.out.println("Running once after all tests");
	}
	
	// tests
	@Test
	public void testGetFundsReturnsDefault() {
		System.out.println("testGetFundsReturnsDefault is running.");
		
		// mock dao and then stub getFunds
		when(userDAO.getUser(anyString())).thenReturn(new Customer("user1", "password", "John Doe"));
		
		// get mocked return value
		Customer user = (Customer) userDAO.getUser("anything");
		
		// compare values
		double valueExpected = 0;
		double valueReturned = user.getFunds();
		
		// third parameter is a margin of error:
				// because they are doubles, they are imprecise
				// how off can the precision be?
		assertEquals(valueExpected, valueReturned, .05);
		
	}
	
	@Test
	public void testGetFundsReturnsSpecified() {
		System.out.println("testGetFundsFails is running.");

		when(userDAO.getUser(anyString())).thenReturn(new Customer("user1", "password", "John Doe", 100));

		Customer user = (Customer) userDAO.getUser("anything");
		
		// value I think should NOT be returned
		double unsuccessValue = 0;
		
		// actual value returned
		double testValue = user.getFunds();

		assertNotEquals(unsuccessValue, testValue, 0.5);
	}
	
	//@Ignore <-- to keep a test from running
	@Test (expected = ClassCastException.class) // remove this and we get an error, not a failure
	public void testGetFundsException() {
		System.out.println("testGetFundsException is running.");
		
		when(userDAO.getUser(anyString())).thenReturn(new Employee("user1", "password"));

		Customer user = (Customer) userDAO.getUser("anything");

		verify(userDAO).getUser("anything");

		// should cause exception
		user.getFunds();
	}
}
