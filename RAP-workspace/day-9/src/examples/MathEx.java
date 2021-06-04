package examples;

import java.util.Random;

public class MathEx {
	public static void main(String[] args) {
		System.out.println("\n------------------ Math Fields -------------------------");
		System.out.println(Math.E); // log stuff that I don't remember anything about
		System.out.println(Math.PI); // involves circles
		
		System.out.println("\n------------------ Math Methods -------------------------");
		// abs
		System.out.println(Math.abs(-100));
		
		// floor, ceiling, round
		System.out.println("Number rounded down: " + Math.floor(4.8));
		System.out.println("Number rounded up: " + Math.ceil(4.2));
		
		System.out.println("Number rounded down, depending: " + Math.round(4.2));
		System.out.println("Number rounded up, depending: " + Math.round(4.8));
		
		// max and min
		System.out.println("Larger of two numbers: " + Math.max(4, 5));
		System.out.println("Smaller of two numbers: " + Math.min(4, 5));
		
		// sqrt
		System.out.println("Square root: " + Math.sqrt(64));
		
		System.out.println("\n------------------ Math.random() -------------------------");

		System.out.println("Random number between 0 and 1 (with decimals): " + Math.random());

		System.out.println("Random number between 0 and 9 (with decimals): " + (Math.random() * 10));
		
		System.out.println("Random number between 1 and 10 (with decimals): " + (Math.random() * 10) + 1);

		System.out.println("Random number between 0 and 10: " + Math.floor(Math.random() * 10 + 1));
		
		// using random class vs math.random
		Random random = new Random();
		
		// random number between 0 (inclusive) and 10 (exclusive)
		System.out.println("Random int generated from random object's method: " + random.nextInt(10) + 1);
	}
}
