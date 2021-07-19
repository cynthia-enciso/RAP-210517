package com.revature.test.services;

import static org.junit.runner.JUnitCore.runClasses;

import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

// run as a suite
@RunWith(Suite.class)
// include these classes
@SuiteClasses({UserServiceTester.class, AnotherServiceTester.class})
public class TestServiceSuite {
	public static void main(String[] args) {
		// run the classes and save result
		Result result = runClasses(UserServiceTester.class, AnotherServiceTester.class);
		
		// print out failing tests
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
	}
}
