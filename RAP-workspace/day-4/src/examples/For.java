package examples;

public class For {
	public static void main(String[] args) {
		String myString = "Hello World";
		
		// manually move characters of string into char array
		char[] charArray = new char[myString.length()];
		
		
		for (int i = 0; i < myString.length(); i++) {
			charArray[i] = myString.charAt(i);
		}
		
		// do not need to use Arrays.toString method to print out
		System.out.println(charArray);
		
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(i + ": " + charArray[i]);
		}
		
		
		// enhanced for loop
		for (char c : charArray) {
			System.out.println(c);
		}
		
		// shortcut: to charArray
		for (char c : myString.toCharArray()) {
			System.out.println(c);
		}
		
		// prime example
		// about prime numbers:
			// primes are greater than 1
			// primes are divisible by only 1 and itself, so we don't count those
			// factors of a number can't be greater than half of it
			// https://www.omnicalculator.com/math/factor#what-is-a-factorfactor-definition
		int myNumber = 28;
		boolean isPrime = true;
		
		// for loop
		for (int i = 2; i <= myNumber / 2; i++) {
			// checks if our number IS divisible by our potential factor
			// if so, not a prime number
			if (myNumber % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		// if statement
		if (isPrime) {
			System.out.println("number is prime!");
		} else {
			System.out.println("number is NOT prime!");
		}
		
	}
}
