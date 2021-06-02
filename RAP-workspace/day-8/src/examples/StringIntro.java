package examples;

public class StringIntro {
	public static void main(String[] args) {
		// string literal
		String str1 = "hello world";
		
		// string created using new keyword + constructor
		String str2 = new String("hello world");
		
		String str3 = "hello world";
		
		
		// == vs equals
		// == compares value of reference variables NOT object fields and their values
		System.out.println(str1 == str3);
		System.out.println(str1 == str2);
		
		//intern method: takes string object and puts it inside string pool
		str2 = str2.intern();
		System.out.println(str1 == str2);
		
		// equals method: compares the actual objects and the fields within them
		String str4 = new String("hello world");
		System.out.println(str1.equals(str4));
	}
}
