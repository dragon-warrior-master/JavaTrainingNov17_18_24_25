package training.java.collections;

import java.util.*;

public class HashSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> hashSet = new HashSet<Integer>();

		hashSet.add(89);
		hashSet.add(8);
		hashSet.add(89);
		hashSet.add(89);
		System.out.println("values :  " + hashSet);
		hashSet.add(90);
		hashSet.add(76);
		hashSet.add(23);
		System.out.println("values :  " + hashSet); //[23, 8, 89, 90, 76] [23, 8, 89, 90, 76]
		
	}

}
