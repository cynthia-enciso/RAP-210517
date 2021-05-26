package examples;

public class VarArgs {
	
	// under the hood the JVM creates an array of args (if any) and passes that into
	// the main method
	// you CAN use varargs instead of String[] in main method because both can take in an array
	public static void main(String[] args) {
		takeStrings(5, "world");
		
		// varargs method can take many different arguments
		takeInts();
		takeInts(4);
		takeInts(1, 2, 3, 4, 5, 6 , 7);
		takeInts(new int[] {1, 2, 3, 4});
		
		// int[] param can only take int arrays
		takeIntArray(new int[] {1, 2, 3, 4});
		
	}
	
	public static void takeStrings(int a, String b, String... c) {
		System.out.println(a + " " + b);
	}
	
	// you can pass in however many ints or none at all OR an array of ints
	public static void takeInts(int... input) {
		System.out.println("start of method call");
		System.out.println(input.length);
		for (int element : input) {
            System.out.println(element);
        }
	}
	
	// you need to pass in an array
	public static void takeIntArray(int[] input) {
		
	}
}
