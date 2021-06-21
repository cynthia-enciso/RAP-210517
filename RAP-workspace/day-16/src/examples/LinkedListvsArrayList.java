package examples;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListvsArrayList {
	public static void main(String[] args) {
		System.out.println("::::::::::: ArrayList ::::::::::::");
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(5);
		arrayList.add(5);
		arrayList.add(5);
		arrayList.add(5);
		arrayList.add(5);
		arrayList.add(5);
		
		System.out.println(arrayList);
		
		arrayList.set(0, 6);
		System.out.println(arrayList);
		arrayList.remove(4);
		System.out.println(arrayList);
		
		System.out.println("::::::::::: LinkedList ::::::::::::");
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
	
		
		System.out.println(linkedList);
		
		linkedList.set(0, 6);
		System.out.println(linkedList);
		linkedList.remove(4);
		System.out.println(linkedList);
		
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
		
		linkedList.addFirst(1);
		linkedList.removeLast();
		System.out.println(linkedList);
		
	}
}
