package examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class UsingIterator {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(2);
		list.add(1);
		list.add(5);
		list.add(3);
		System.out.println(list);
		
		for (Integer element : list) {
        	System.out.println(element);
        }
		
		System.out.println("");
		
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			iterator.remove();
		}
		
//		System.out.println(list);
		
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Hello");
		hashSet.add("there");
		hashSet.add("my");
		hashSet.add("name");
		hashSet.add("is");
		hashSet.add("Cynthia");
		
		Iterator<String> iterator2 = hashSet.iterator();
		while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
		
		System.out.println("");
		
		for (String element : hashSet) {
        	System.out.println(element);
        }
	}
}
