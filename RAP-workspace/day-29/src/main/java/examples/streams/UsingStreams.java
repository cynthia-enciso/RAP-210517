package examples.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UsingStreams {
	// reduce: takes in a BinaryOperator
	// BinaryOperator: Represents an operation upon two operands of the same type, 
	// producing a result of the same type as the operands.
	public static int sum(List<Integer> list) {
		return list.stream().reduce(0, (sum, element) -> {return sum + element;});
	}
	
	// map (takes in a function functional interface) and collect
	// Function interface: 
	// Represents a function that accepts one argument and produces a result.
	public static List<String> toUpperCase(List<String> list) {
		return list.stream().map(word -> word.toUpperCase()).collect(Collectors.toList());
	}
	
	// filter: uses a predicate (functional interface or lambda)
	// Represents a predicate (boolean-valued function) of one argument.
	public static List<Person> getAdults(List<Person> list) {
		return list.stream().filter(person -> person.getAge() > 17).collect(Collectors.toList());
	}
	
	// sorted and forEach (takes in a consumer)
	public static void sortedInts(List<Integer> list) {
		list.stream().sorted().forEach(number -> System.out.println(number));
	}
	
	// collectors: groupingBy
	public static Map<String, List<Person>> groupByGender(List<Person> list) {
		// :: <-- used to reference methods, also introduced in Java 8
		// applies a function/method to a given argument
		return list.stream().collect(Collectors.groupingBy(Person::getGender));
	}
}
