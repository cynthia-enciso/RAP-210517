package other;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] unsorted = {4, 9, 14, 2, 6, 12, 15};
		int[] sorted = mergeSort(unsorted, 0, unsorted.length - 1);
		System.out.println(Arrays.toString(sorted));
	}
	
	// n log n : divides the array into two halves and takes linear time to merge two halves. 
	// divide and conquer:
			// divide problem into subproblems
			// solve subproblems
			// combine solutions
	public static int[] mergeSort(int[] array, int beginning, int end) {
		System.out.println(Arrays.toString(Arrays.copyOfRange(array, beginning, end + 1)));
		// base case: array of one element
		if (beginning == end) {
			int[] baseArray = {array[beginning]};
			return baseArray;
		}
		
		// find midpoint
		int mid = (beginning + end) / 2;
		
		// recursive calls
		// this keeps getting called until you get a two-element array, then you reach base case and return value
		int[] temp1 = mergeSort(array, beginning, mid);
		int[] temp2 = mergeSort(array, mid + 1, end);
		
		System.out.println("merged called with " + Arrays.toString(temp1) + " and " + Arrays.toString(temp2));
		int[] merged = merge(temp1, temp2);
		
		
		return merged;
	}
	
	//
	public static int[] merge(int[] temp1, int[] temp2) {
		int[] array = new int[temp1.length + temp2.length];
		
		for (int k = 0, i = 0, j = 0; k < array.length; k++) {
			
			// if you can iterate over both temp arrays
			if(i < temp1.length && j < temp2.length) {
				// compare and assign smaller value to array
				if (temp1[i] <= temp2[j]) {
					array[k] = temp1[i];
					i++;
				} else {
					array[k] = temp2[j];
					j++;
				}
			}
			// if one subarray is already iterated over, just add elements of other array
			else if (i == temp1.length) {
				array[k] = temp2[j];
				j++;
			} else {
				array[k] = temp1[i];
				i++;
			}
			
		}
		
		System.out.println("after merging: " + Arrays.toString(array));
		return array;
	}
}
