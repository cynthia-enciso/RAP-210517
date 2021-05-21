package examples;

public class IfStatements {
	public static void main(String[] args) {
		int int1 = 6;
		int int2 = 6;
		
		// conditions, you need to return a boolean
//		if(5 | 6) {
//			
//		}
		
		boolean myBool = true;
		
//		if (myBool && 5 < 6) {
//			System.out.println("yes");
//		} else {
//			System.out.println("no");
//		}
		
		if (int1 < int2) {
			System.out.println("int1 is less than int2");
		} else if (int1 > int2) {
			System.out.println("int1 is greater than int2");
		} else {
			System.out.println("the are the same");
		}
		
		//nested if statements with movie-going example
		// r movies: 18 or older OR 13 or older with parent
		// t movies: 13 or older OR with parent
		// e movie: anyone can watch
		char movieRating = 'R';
		int age = 13;
		boolean isWithParent = false;
		
		
		//write your pseudocode to help you
		// if it is rated r
		if (movieRating == 'R') {
			// are they 18 or older?
			if (age >= 18) {
				System.out.println("You can see the movie!");
			} 
			// are they 13 or older and with parent?
			else if (age >= 13 && isWithParent) {
				System.out.println("You can see the movie!");
			}
			// otherwise, they can't watch it!
			else {
				System.out.println("Sorry kid, you're too young!");
			}
		}
		// else if it is rated t
		else if (movieRating == 'T') {
			// are they 13 or older?
			if (age >= 13) {
				System.out.println("You can see the movie!");
			}
			// are they with a parent?
			else if (isWithParent) {
				System.out.println("You can see the movie!");
			}
			// otherwise
			else {
				System.out.println("Sorry kid, you're too young!");
			}
		}
		// otherwise (it is rated e)
		else {
			System.out.println("You can see the movie!");
		}
		
		// example with modulus operator
		int int3 = 6;
		
		// check if number is even
		if (int3 % 2 == 0) {
			System.out.println("it is even!");
		} else {
			System.out.println("it is NOT even!");
		}
		
		// ternary operators 
		String myString1 = (int2 % 2 == 0) ?  "it is even" : "it is NOT even";
//		System.out.println((int2 % 2 == 0) ?  "it is even" : "it is NOT even");
		
		int myValue = 5;
		// nesting is bad because confusing
		 String myString2 = myValue > 10 ? "yes" : ( myValue < 3 ? "no" : (myValue > 0 ? "yes" : "no"));
	}
}
