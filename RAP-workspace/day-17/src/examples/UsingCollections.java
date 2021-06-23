package examples;

import java.util.ArrayList;
import java.util.Collections;

public class UsingCollections {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(2);
		list.add(1);
		list.add(5);
		list.add(3);
		System.out.println(list);
		
		// useful collections utility class static helper methods
		Collections.sort(list);
		System.out.println(list);
		System.out.println(Collections.min(list));
		System.out.println(Collections.max(list));
		System.out.println(Collections.binarySearch(list, 2));
		Collections.reverse(list);
		System.out.println(list);
	}
}
