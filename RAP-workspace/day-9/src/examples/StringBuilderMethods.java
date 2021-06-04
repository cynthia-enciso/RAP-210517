package examples;

public class StringBuilderMethods {
	public static void main(String[] args) {
		String word = "hello";
		StringBuilder mutable = new StringBuilder("hello there");
		
		System.out.println("------------------ Length -------------------------");
		// length method works the same: length of characters
		System.out.println("Length of string: " + word.length());
		System.out.println("Length of mutable string: " + mutable.length());
		
//		mutable.setLength(30);
//		System.out.println("After setting length: " + mutable);
		
		System.out.println("\n------------------ Capacity -------------------------");
		// capacity: number of character spaces that have been allocated to the object
			// each new object starts with a capacity of 16
		System.out.println("Capacity of mutable string object: " + mutable.capacity());
		
		System.out.println("\n------------------ Adding/Removing -------------------------");
		// append
			// takes any data type and converts it into a string, then adds it to the end of the StringBuilder object
		System.out.println(mutable.append(", my name is Cynthia"));
		System.out.println("Length of mutable string: " + mutable.length());
		
		// replace: takes in three arguments, the starting index, the ending index, and the replacement string
		System.out.println(mutable.replace(24, 31, "Ralph"));
		System.out.println("Length of mutable string: " + mutable.length());
		
		// setCharAt: replace only one character
		mutable.setCharAt(25, 'o');
		System.out.println(mutable);
		
		// delete 
		System.out.println(mutable.delete(5,  11));
		System.out.println("Length of mutable string: " + mutable.length());
		
		mutable.deleteCharAt(5);
		System.out.println(mutable);
		
		System.out.println("\n------------------ Reverse -------------------------");
		System.out.println(mutable.reverse());
	}
}
