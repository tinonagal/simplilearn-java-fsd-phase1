package com.simplilearn.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCollectionExample {

	public static void main(String[] args) {
		
		System.out.println("HashMap");
		Map<String, String> hashMap = new HashMap<>();
		
		System.out.println(hashMap.put("001", "John"));
		System.out.println(hashMap.put("002", "Matt"));
		System.out.println(hashMap.put("003", "Ivy"));
		System.out.println(hashMap.put("004", "Jane"));
		System.out.println(hashMap.put("001", "Neve"));
		System.out.println(hashMap.put("002", "Ben"));
		System.out.println(hashMap.put("003", "Mike"));
		System.out.println(hashMap.put("004", null));
		System.out.println(hashMap.put(null, null));
		
		
		System.out.println(hashMap);
		
		for(Map.Entry m : hashMap.entrySet()) {
			System.out.println("Entry: " + m);
			System.out.println("Key: " + m.getKey() + " Value: " + m.getValue());
		}
		
		HashMap<String ,String> hMap = new HashMap<>();
		
		hMap.put("Toy", "Truck");
		hMap.put("Game", "Basketball");
		hMap.put("Food", "Burger");
		
		hashMap.putAll(hMap);
		System.out.println("Added HashMap: " + hashMap);
		
		System.out.println(hashMap.remove(null));
		System.out.println(hashMap.remove("Game","Basketball"));
		
		System.out.println("After .remove: "+ hashMap);	
		
		System.out.println("LinkedHashMap");
		Map<String, String> linkedHashMap = new LinkedHashMap<>();
		
		linkedHashMap.put("004","Bud");
		linkedHashMap.put("002","John");
		linkedHashMap.put("001","Dave");
		linkedHashMap.put("003","Jay");
		
		System.out.println(linkedHashMap);
		
		
		System.out.println("TreeMap");
		Map<String, String> treeMap = new TreeMap<>();
		
		treeMap.put("001","John");
		treeMap.put("004","Andy");
		treeMap.put("003","Ben");
		treeMap.put("002","Ken");
		
		System.out.println(treeMap);
		
		

	}

}
