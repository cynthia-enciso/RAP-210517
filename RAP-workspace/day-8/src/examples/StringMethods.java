package examples;

public class StringMethods {
	public static void main(String[] args) {
		String myString = "Hello there, my name is Cynthia.";
		
		// charAt - returns a char
		System.out.println(myString.charAt(0));
		char myChar = myString.charAt(0);
		String myNewString = String.valueOf(myChar);
		System.out.println(myNewString instanceof String);
		
		
		// indexOf - returns an int
		System.out.println(myString.indexOf('e'));
		
		// length - returns an int
		System.out.println(myString.length());
		
		// substring - returns a string
		System.out.println(myString.substring(5, 25));
		System.out.println(myString);
		
		// contains - returns a boolean
		System.out.println(myString.contains(Character.toString('e')));
		
		for (char letter : myString.toCharArray()) {
			System.out.print(letter);
		}
	}
}
