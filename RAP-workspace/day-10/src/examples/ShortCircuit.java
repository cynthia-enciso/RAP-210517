package examples;

public class ShortCircuit {
	// use PPT example
	public static void main(String[] args) {
		boolean variable = false;
		if(variable && printAndReturnTrue()){
			System.out.println("this won’t print");
		}else{
			System.out.println("The statement was false.");
		}
		
		// create two booleans and use XOR
//		boolean bool1 = true;
//		boolean bool2 = false;
	//	
//		System.out.println(bool1^bool2);
	}
	
	public static boolean printAndReturnTrue(){
		System.out.println("This returns true.");
		return true;
	}
	
	
}
