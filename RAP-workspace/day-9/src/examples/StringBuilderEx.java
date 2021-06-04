package examples;

public class StringBuilderEx {
	public static void main(String[] args) {
		String word = "hello";
		StringBuilder mutable = new StringBuilder("hello");
		
		System.out.println("------------------ Mutability -------------------------");
		// strings work like primitives when we talk about pass by value
		System.out.println("String before change: " + word);
		changeString(word);
		System.out.println("String after change: " + word);
		
		// strings built with string builder act mutable
		System.out.println("StringBuilder object before change: " + mutable);
		changeString(mutable);
		System.out.println("StringBuilder object after change: " + mutable);
	}
	
	public static void changeString(String word) {
		word += " there";
	}
	
	public static void changeString(StringBuilder word) {
		word.append(" there");
	}
}
