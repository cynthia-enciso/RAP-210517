package examples;

public class DataTypes {
	public static void main(String[] args) {
		// calling static method
		ShortCircuit.printAndReturnTrue();
		
		// byte
		byte myMinByte = -128;
		byte myMaxByte = 127;
		
		// short
		short myMinShort = -32_768;
		short myMaxShort = 32_767;
		
		// int
		int myMinInt = -2_147_483_648;
		int myMaxInt = 2_147_483_647;
		
		// long
		long myMinLong = -9_223_372_036_854_775_808L;
		long myMaxLong = 9_223_372_036_854_775_807L;
		
		// float
		float myFloat =  5.55555555555555555F;
		System.out.println(myFloat);
		
		double myDouble = 5.55555555555555555;
		System.out.println(myDouble);
		
		// char
		char myCharacter = 'a';
		System.out.println((int)myCharacter);
		
		// use char in for loop
//		for (int letter = 'a'; letter <= 'z'; letter++) {
//			System.out.println(letter);
//		}
		// come back to this part after we learn about casting
	}
	
}
