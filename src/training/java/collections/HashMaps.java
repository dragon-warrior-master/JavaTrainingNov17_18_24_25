package training.java.collections;

import java.util.*;
import java.util.Map.Entry;

public class HashMaps {

	public static void main(String[] args) {

		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		Map<String, Integer> hashMap1 = new HashMap<String, Integer>();

		hashMap.put("One", 1);
		hashMap.put("Two", 2);
		hashMap.put("Three", 3);
		hashMap.put("Four", 4);
		hashMap.put("Five", 5);
		
		
		hashMap.putIfAbsent("Five", 10);
		
		
		
		
		System.out.println(hashMap);
//		
//		System.out.println("Keys " + hashMap.keySet());

//		hashMap.keySet().forEach(key -> {
//
//			System.out.println(key);
//		});
//
//		for (String s : hashMap.keySet()) {
//
//			System.out.println("Keys " + s);
//		}
//		
//		System.out.println("Values " + hashMap.values());
//		for(String s :hashMap.keySet()){
//			System.out.println("Values " + s);
//		}

//		hashMap.entrySet();
//
//		Set<Entry<String, Integer>> set = hashMap.entrySet();
//
//		for (Map.Entry<String, Integer> e : hashMap.entrySet()) {
//
//			System.out.println(e.getKey());
//			System.out.println(e.getValue());
//		}

	}

}
