package examples.functionals;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UsingLambdas {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3);
		
		// object-oriented way
		Consumer<Integer> consumer = new PrintOut<Integer>();
		list.forEach(consumer);
		
		// lambda way
		list.forEach(element -> System.out.println(element));
		// alternative syntax
//		list.forEach((element) -> {System.out.println(element);});
		
		// using a custom functional interface
		Printer<String> printer = (argument) -> System.out.println(argument);
		
		printer.printOut("hello");
		
		// closure
		System.out.println(concat("Hello", "World"));
	}
	
	public static String concat(String one, String two) {
		// use lambda to provide implementation for concat interface
		Concat c = (s1, s2) -> s1 + s2;
		
		// use implementation
		return c.concat(one, two);
	}
}
