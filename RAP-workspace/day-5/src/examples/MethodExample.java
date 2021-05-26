package examples;

public class MethodExample {
	public static void main(String[] args) {
		//invoke/run/call another method
		// it belongs to the class NOT to objects of the class
		anotherMethod();
		MethodExample.anotherMethod(); // more explicit
		
		int myInt = 5;
		
		// need an object to use an instance method
		MethodExample object = new MethodExample();
		object.hello();
	}
	
	// class-level method
	public static void anotherMethod() {
		System.out.println("something");
	}
	
	// instance method
	public void hello() {
		System.out.println("hello");
	}
}
