package examples;

import java.util.Arrays;

public class UsingArrays {
	public static void main(String[] args) {
		int[] array = {42, 20, 5, 1, 34, 50, 2, 14, 86};
		
		// printing out
		System.out.println(array);
		System.out.println(Arrays.toString(array));
		
		// sorting
		Arrays.sort(array, 2, 7);
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		// binary search
		System.out.println(Arrays.binarySearch(array, 3, array.length - 1, 2));
		System.out.println(Arrays.binarySearch(array, 2));
	}
}
