package examples;

public class ContinueBreak {
	public static void main(String[] args) {
		
		int myInt = 0;
		
		for(;;) {
			System.out.println("in loop");
			
			myInt++;
			
			if (myInt != 8) {
				System.out.println(myInt);
				continue;
			}
			
			System.out.println("before break");
			
			if (myInt == 8) {
				System.out.println("x is 8, break loop!");
				break;
			}
		}
		
		System.out.println("after for loop");
	}
}
