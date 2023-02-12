package com.simplilearn.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollectionExample {

	public static void main(String[] args) {
		System.out.println("HashSet");
		Set<String> hashSet = new HashSet<>();
		
		System.out.println(hashSet.add("John"));
		System.out.println(hashSet.add("Matt"));
		System.out.println(hashSet.add("Toni"));
		System.out.println(hashSet.add("Eric"));
		System.out.println(hashSet.add("Matt"));
		System.out.println(hashSet.add(null));
		
		System.out.println("HashSet: " + hashSet);
		
		Iterator<String> setItr = hashSet.iterator();
		
		while(setItr.hasNext()) {
			System.out.println(setItr.next());
		}
		System.out.println(hashSet.remove("Matt"));
		System.out.println("After using remove():" + hashSet);
		
		System.out.println("LinkedHashSet");
		Set<String> linkedHashSet = new LinkedHashSet<>();
		
		linkedHashSet.add("Basketball");
		linkedHashSet.add("Volleyball");
		linkedHashSet.add("Football");
		linkedHashSet.add("Golf");
		linkedHashSet.add("Soccer");
		linkedHashSet.add(null);
		
		System.out.println(linkedHashSet);
		
		linkedHashSet.remove("Basketball");
		System.out.println("After linkedHasSet.remove" + linkedHashSet);
		
	
		System.out.println("sortedTreeSet");
		Set<String> sortedTreeSet = new TreeSet<>();
		
		sortedTreeSet.add("Ray");
		sortedTreeSet.add("Boy");
		sortedTreeSet.add("Baby");
		sortedTreeSet.add("John");
		sortedTreeSet.add("Alice");
		
		System.out.println(sortedTreeSet);
		
	}

}
