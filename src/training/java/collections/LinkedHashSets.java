package training.java.collections;

import java.util.*;

public class LinkedHashSets {

	public static void main(String[] args) {

		
		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		
		linkedHashSet.add(34);
		linkedHashSet.add(34);
		linkedHashSet.add(34);
		linkedHashSet.add(34);
		linkedHashSet.add(34);
		System.out.println(linkedHashSet);
		
		linkedHashSet.add(89);
		linkedHashSet.add(null);
		linkedHashSet.add(23);
		linkedHashSet.add(67);
		System.out.println(linkedHashSet);
		
		//linked Hashset maintains order and does not allows duplicates
	}

}
