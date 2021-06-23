package examples;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class UsingMaps {
	public static void main(String[] args) {
		// hashtables cannot contain null
		Hashtable<String, Integer> hashTable = new Hashtable<>();
//		hashTable.put(null, 5);
//		hashTable.put("One", null);
		
		// hashmap can contain one null key and many null values
		// unordered
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("One", 1);
		hashMap.put("Two", 2);
		hashMap.put("Three", 3);
		hashMap.put("Four", 4);
		hashMap.put("Five", 5);
		hashMap.put("Five", 6);
		System.out.println(hashMap);
		
		// treemap
			// sorted
			// no null keys, can have null values
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("Bravo", 1);
		treeMap.put("Delta", 2);
		treeMap.put("Echo", 3);
		treeMap.put("Charlie", 4);
		treeMap.put("Alpha", 5);
		System.out.println(treeMap);
		
		// linkedhashmap
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("One", 1);
		linkedHashMap.put("Two", 2);
		linkedHashMap.put("Three", 3);
		linkedHashMap.put("Four", 4);
		linkedHashMap.put("Five", 5);
		System.out.println(linkedHashMap);
		
		// maps methods
		// get: get value from key
		System.out.println(hashMap.get("One"));
		System.out.println(hashMap.containsKey("Two"));
		System.out.println(hashMap.containsValue(2));
		
		// keySet
		Set<String> keys = hashMap.keySet();
		System.out.println(keys);
		// values
		Collection<Integer> collection = hashMap.values();
		System.out.println(collection);
		// entrySet
		Set<Entry<String, Integer>> entrySet = hashMap.entrySet();
		System.out.println(entrySet);
		
		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			System.out.println(entry);
		}
	}
}
