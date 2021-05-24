package examples;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		// array creation
		int[] intArray = {1, 2, 3, 4, 5};
		String[] stringArray = new String[5];
		
		// without arrays toString method
//		System.out.println(intArray);
//		System.out.println(stringArray);
		
		// using toString method
//		System.out.println(Arrays.toString(intArray));
//		System.out.println(Arrays.toString(stringArray));
		
		// array:  {1, 2, 3, 4, 5} ?
		// indices: 0  1  2  3  4  5
		
//		System.out.println(intArray[intArray.length - 1]);
		
		// access elements of the array
//		System.out.println(intArray[0]);
		
		// adding elements
		stringArray[0] = "Hello";
//		System.out.println(stringArray[0]);
		
		// https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
		
		// multiple-dimensional arrays
		// we want to look for a specific value inside an array of arrays
		int lookingFor = 8;
		int outerIndex = -1;
		int innerIndex = -1;
		
		int[][] multiArray = {
				{1, 2, 3, 4, 5},		// 0
				{6, 7, 8, 9, 10},		// 1
			//   0  1  2  3  4
				{11, 12, 13, 14, 15}	// 2
		};
		
//		System.out.println(multiArray[1][2]);
		
		//outer loop
		search:
		for (int i = 0; i < multiArray.length; i++) {
			// inner loop
			for (int j = 0; j < multiArray[0].length; j++) {
				// if the current element is what I'm looking for,
					// change indices
					// break out
				if (multiArray[i][j] == lookingFor) {
					outerIndex = i;
					innerIndex = j;
					System.out.println("broke inner loop");
					break search;
				}
				System.out.println("going to next element");
			}
			System.out.println("at loops end");
		}
		
		if (outerIndex != -1 && innerIndex != 1) {
			System.out.println("Found " + lookingFor + " at " + outerIndex + ", " + innerIndex);
		} else {
			System.out.println("Not found");
		}
		
		// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/branch.html
	}
}
