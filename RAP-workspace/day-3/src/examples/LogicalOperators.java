package examples;

public class LogicalOperators {
	public static void main(String[] args) {
		// not operator
		boolean myBool = true;
//		System.out.println(!myBool);
		
		// bitwise operators: | and &
		// they work on binary digits or bits of input values
		
		int int1 = 6; // 0110
		int int2 = 5; // 0101
		
		// 0110
		// 0101
		// ----
		// 0111 ---> 7
		
		int orResult = int1 | int2;
//		System.out.println(orResult);
		
		
		// 0110
		// 0101
		// ----
		// 0100 ---> 4
		
		int andResult = int1 & int2;
//		System.out.println(andResult);
		
		// | & vs || &&
		boolean myTrue = true; // 1
		boolean myFalse = false; // 0
		
//		System.out.println(myTrue | myFalse);
//		System.out.println(myTrue & myFalse);
		
		// something to consider: BOTH operands are evaluated
			if (myTrue || evaluatedMethod()) {
				System.out.println("both operands returned true");
			} else {
				System.out.println("one operand was false");
			}
	}
	
	public static boolean evaluatedMethod() {
		System.out.println("method was evaluated!");
		return true;
	}
}
