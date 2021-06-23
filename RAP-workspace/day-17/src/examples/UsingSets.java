package examples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class UsingSets {
	// aren't with indexes
	// do not allow duplicates
	// can be unordered
	public static void main(String[] args) {
		// hashset
			// allows null values
		HashSet<String> hashSet = new HashSet<>();
		
		// common methods collection interface asks for: add, remove, contains
		hashSet.add("Hello");
		hashSet.add("there");
		hashSet.add("my");
		hashSet.add("name");
		hashSet.add("is");
		hashSet.add("Cynthia");
//		hashSet.add(null); 
		System.out.println(hashSet);
		System.out.println(hashSet.contains("is"));
		hashSet.remove("is");
		System.out.println(hashSet);
		System.out.println(hashSet.contains("is"));
		
		// treeset
			// doesn't allow null values
			// keeps insertion order
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.addAll(hashSet);
		System.out.println(treeSet);
		
		// linkedhashset
			// allows null
			// keeps insertion order
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("Hello");
		linkedHashSet.add("there");
		linkedHashSet.add("my");
		linkedHashSet.add("name");
		linkedHashSet.add("is");
		linkedHashSet.add("Cynthia");
//		linkedHashSet.add(null);
		System.out.println(linkedHashSet);
	}
}
