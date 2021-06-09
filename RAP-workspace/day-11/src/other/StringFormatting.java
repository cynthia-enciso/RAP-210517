package other;

public class StringFormatting {
	/* String formatting
	 * 
	 * create a string:
	 * String.format("%[argument_index$][flags][width][.precision]conversion character", arguments);
	 * OR
	 * print to console:
	 * System.out.printf("%[argument_index$][flags][width][.precision]conversion character", arguments); 
	 * System.out.format("%[argument_index$][flags][width][.precision]conversion character", arguments);
	 * 
	 * Argument Index (optional)
	 * specify which argument is being used in which place 
	 * 
	 * Flag (optional)
	 * modify the output format 
	 * 
	 * Width (optional)
	 * specify how many characters it should contain
	 * 
	 * Precision (optional)
	 * for decimal numbers, how many decimal places it should have
	 * 
	 * Conversion Characters:
	 * d = whole number
	 * f = decimal number
	 * e = decimal number in scientific notation
	 * s = string or other java object
	 * b = boolean
	 * c = char
	 * n = newline
	 *  and more!
	 * 
	 */
	public static void main(String[] args) {
		
		// using argument index
//		System.out.format("%2$d%n", 1, 2, 3, 4);
//		System.out.format("%2$d, %1$d, %4$d%n", 1, 2, 3, 4);
//		System.out.format("%s, %d%n", "hello", 5);
		
		// precision
		System.out.format("%.2f%n", 3.4532);
		System.out.printf("%20.5f%n", 140.66342644);
		
		// just a conversion character
//		System.out.printf("%d%n", 100);
//		System.out.printf("|%10d|%n", 100); // needs to take up ten spaces, right justified
//		System.out.printf("|%-10d|%n", 100);// needs to take up ten spaces, left justified
//		System.out.printf("|%010d|%n", 100); // needs to take up ten spaces, empty spaces filled with zeros
//		
//		System.out.printf("|%+10d|%n", 100); // needs to take up ten spaces, needs to show sign
//		System.out.printf("|%+10d|%n", -100); // needs to take up ten spaces, needs to show sign
//		System.out.printf("|%(10d|%n", -100); // needs to take up ten spaces, negative numbers are in parenthesis
//		System.out.printf("|%,d|%n", 100_000); // add commas	
	}
}
