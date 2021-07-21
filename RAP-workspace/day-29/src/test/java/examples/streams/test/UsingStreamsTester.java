package examples.streams.test;

import static examples.streams.UsingStreams.getAdults;
import static examples.streams.UsingStreams.groupByGender;
import static examples.streams.UsingStreams.sortedInts;
import static examples.streams.UsingStreams.sum;
import static examples.streams.UsingStreams.toUpperCase;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import examples.streams.Person;

public class UsingStreamsTester {
	//Create new output stream destinations
	private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private static final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	
	//Save original output stream destinations 
	private static final PrintStream originalOut = System.out;
	private static final PrintStream originalErr = System.err;
	
	@BeforeClass
	public static void setUpStreams() {
		//Set up output streams on System to use new destinations 
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}
	
	@AfterClass
	public static void restoreStreams() {
		//restore original destinations 
	    System.setOut(originalOut);
	    System.setErr(originalErr);
	}
	
	@Test
	public void testSumSuccess() {
		// create argument for method we are testing
		List<Integer> argument = Arrays.asList(1, 1, 1);
		
		// assert expectation
		assertEquals(3 , sum(argument));
	}
	
	@Test
	public void testToUpperCaseSuccess() {
		// create argument for method we are testing
		List<String> input = Arrays.asList("a", "b", "c");
		
		// get result from method
		List<String> actualResult = toUpperCase(input);
		
		// create expected result
		List<String> expectedResult = new ArrayList<>();
		expectedResult.add("A");
		expectedResult.add("B");
		expectedResult.add("C");
		
		// compare actual to expected results
		assertEquals(expectedResult, actualResult); 
	}
	
	@Test
	public void testGetAdultsSuccess() {
		// create argument for method we are testing
		Person one = new Person("Bobby", 5, "Male");
		Person two = new Person("Caleb", 27, "Male");
		Person three = new Person("Monica", 19, "Female");
		
		List<Person> input = Arrays.asList(one, two, three);
	
		// get result from method
		List<Person> actualResult = getAdults(input);
		
		// create expected result
		List<Person> expectedResult = Arrays.asList(two, three);
		
		// compare actual to expected results
		assertEquals(expectedResult, actualResult); 
	}
	
	@Test
	public void testSortedIntsSucess() {
		// create argument
		List<Integer> input = Arrays.asList(4, 25, 18, 9);
		
		sortedInts(input);
		String expected = "4\r\n9\r\n18\r\n25\r\n";
		assertEquals(expected, outContent.toString());
		
	}
	
	@Test
	public void testGroupByGenderSuccess() {
		// create argument for method we are testing
		Person one = new Person("Bobby", 5, "Male");
		Person two = new Person("Caleb", 27, "Male");
		Person three = new Person("Monica", 19, "Female");
		
		List<Person> input = Arrays.asList(one, two, three);
	
		// get result from method
		Map<String, List<Person>> actualResult = groupByGender(input);
		
		// create expected result
		Map<String, List<Person>> expectedResult = new HashMap<>();
		expectedResult.put("Female", Arrays.asList(three));
		expectedResult.put("Male", Arrays.asList(one, two));
		
		// compare actual to expected results
		assertEquals(expectedResult, actualResult); 
	}
}
