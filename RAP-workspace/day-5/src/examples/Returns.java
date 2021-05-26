package examples;

public class Returns {
	public static void main(String[] args) {
		// value returned but not used, no output
		sum(4, 5);
		
		// useful for one-time use
		System.out.println(sum(4, 5));
		
		// useful if you want to save the value for future use or multiple uses
		int mySum = sum(4, 5);
		System.out.println(mySum);
	}
	
	public static int sum(int a, int b) {
//		int value = a + b;
//		return value;
		
		return a + b;
	}
}
