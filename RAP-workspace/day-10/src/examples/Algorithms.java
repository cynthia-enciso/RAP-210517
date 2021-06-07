package examples;

import java.util.Arrays;

public class Algorithms {
	public static void main(String[] args) {
		int[] sortedArray = {1, 2, 3, 4, 5};
//		System.out.println(binarySearch(sortedArray, 5));
		int[] unsortedArray = {6, 2, 4, 8, 5, 1};
//		System.out.println(Arrays.toString(unsortedArray));
//		selectionSort(unsortedArray);
//		System.out.println(Arrays.toString(unsortedArray));
		
		System.out.println(Arrays.toString(unsortedArray));
		bubbleSort(unsortedArray);
		System.out.println(Arrays.toString(unsortedArray));
	}
	// binary search: O(log n)
		// array need to be sorted first!
	public static int binarySearch(int[] array, int value) {
		// things to keep track of
		int beginIndex = 0;
		int endIndex = array.length - 1;
		
		// we have an array to look at (even if it includes just one element)
		while(beginIndex <= endIndex) {
			// find midpoint
			System.out.printf("Calculating midpoint: (%d + %d) / 2 = %d%n", beginIndex, endIndex, (beginIndex + endIndex)/ 2);
			int midIndex = (beginIndex + endIndex) / 2;
			int midValue = array[midIndex];
			
			// debugging 
			System.out.println("beginIndex= " + beginIndex + " endIndex = "+ endIndex);
			System.out.println("midIndex= " + midIndex + " midValue = "+ midValue);
			
			//make decision based off of midpoint and value we are looking for
			if (value == midValue) {
				return midIndex;
			} else if (value > midValue) {
				// {1, 2, 3, 4, 5}
				//  0  1  2  3  4
				beginIndex = midIndex + 1;
			} else {
				endIndex = midIndex;
			}
		}
		
		// not found
		return -1;
	}
	
	// selection sort
	public static void selectionSort(int[] array) {
		// outer loop iterates over every element
		for (int i = 0; i < array.length; i++) {
			// at the beginning of this iteration, set minIndex to current element
			int minIndex = i;
			
			// inner loop iterates over every other element in array
			for (int j = i + 1; j < array.length; j++) {
				// compare values
				if (array[j] < array[minIndex]) {
					// change minimum index of needed
					minIndex = j;
				}
			}
			
			// perform a swap
			int temp = array[i];
			
			array[i] = array[minIndex];
			array[minIndex] = temp;
		}
			
	}
	
	// bubble sort
	public static void bubbleSort(int[] array) {
		// first loop, iterate over the array 
		for (int i = 0; i < array.length; i++) {
			// compare current element with next element
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					// perform a swap
					int temp = array[j];
					System.out.println("Swapping "+(j+1)+":"+ array[j+1]+" "+j+":"+array[j]);
					array[j] = array[j + 1];
					array[j + 1] = temp;
					System.out.println("Array is currently: "+Arrays.toString(array));
				}
			}
		}
	}
}
