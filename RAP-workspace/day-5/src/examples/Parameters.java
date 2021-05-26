package examples;

public class Parameters {
	// global or class level scope
//	public static int myGlobalVariable = 5;
	
	public static void main(String[] args) {
		// local scope
		int x = 5;
		print(x);
		System.out.println("Value after print method is called: " + x);
	}
	
	// pass by value
	public static void print(int x) {
		System.out.println("Before change: " + x);
		x = 10;
		System.out.println("After change: " + x);
	}
	
	
}
