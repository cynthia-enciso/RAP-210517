package examples.reflections;

import java.util.Arrays;
import java.util.Scanner;

public class UsingReflections {
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		String input = "";
		
		while(!input.equals("quit") && !input.equals("q")) {
			System.out.println("Do you want to create an object A or B?"
					+ "\nOr press q and enter to quit.");
			input = scan.next().toLowerCase();
			
			Object o = null;
			
			switch(input) {
			case "a":
				o = new A(); 
				break; 
			case "b":
				o = new B(); 
				break; 
			case "q":
			case "quit":
				o = null;
				System.out.println("Goodbye!");
				break;
			default:
				System.out.println("I don't understand.");
			}
			
			if( o != null) {
				//Use reflection to get the properties of class, even if some are private
				System.out.println(Arrays.toString(o.getClass().getDeclaredConstructors()));
				System.out.println(Arrays.toString(o.getClass().getDeclaredFields()));
			}
		}
		
		scan.close(); 
	}
}
