package examples;

public class Casting {
	public static void main(String[] args) {
		//upcasting: implicit cast
		int myInt = 100;
		double myDouble = myInt;
		
		//downcasting: explicit cast, we have to do it ourselves
		double myNewDouble = 100.2345;
		int myNewInt = (int) myNewDouble;
//		System.out.println(myNewDouble);
//		System.out.println(myNewInt);
		
		int a = 1;
		Integer myWrapper = a; // wrapper class
//		a.toString(); //can't convert primitive to String object
		System.out.println(myWrapper.toString()); // can convert object to object
		
		// we know that characters are treated as numbers
		char myChar = 'a';
		System.out.println((int) myChar);
	}
}
