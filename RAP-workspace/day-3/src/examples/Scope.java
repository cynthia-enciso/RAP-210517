package examples;

// class OR global scope
public class Scope {
	public static int int1 = 5;
	
	// method OR local scope
	public static void main(String[] args) {
		// if statement OR block scope
		if(true) {
			int int1 = 3;
			System.out.println(int1); // looking inside its scope and higher scopes available
		}
		
		System.out.println(int1); // looking inside its scope and higher scopes available
	}
}
