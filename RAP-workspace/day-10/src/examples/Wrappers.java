package examples;

public class Wrappers {
	public static void main(String[] args) {
		// int to Integer
		int myInt = 5;
//		Integer myIntWrapper = myInt; // autoboxing 
		String myString = "5";
		Integer myIntWrapper = Integer.parseInt(myString);
		System.out.println(myIntWrapper);
		
		// Integer to int
		Integer myInteger = 5;
		int myNewInt = myInteger; // unboxing
		
		System.out.println(myInteger instanceof Integer);
	}
}
