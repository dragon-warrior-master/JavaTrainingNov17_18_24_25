package training.java.collections;

import java.util.*;

public class ArrayLists {

	public static void main(String[] args) {

		int[] rollno = { 1, 2, 3, 4, 4, 56, 34, };

		// maintains order of insertion
		// stores the duplicate
		List<Integer> list = new ArrayList<>();

		list.add(4);

		list.add(5);
		list.add(10);
		list.add(8);
		System.out.println(list);
		list.remove(1);

		System.out.println("After removing : " + list);
		list.remove(Integer.valueOf(10));
		System.out.println("After removing : " + list);

		System.out.println("Value at 1st index " + list.get(1));

		System.out.println("Size" + list.size());
		list.set(1, 98);
		System.out.println("Inserted " + list);
		System.out.println("---------------------------------------- ");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));			
		}
		
		System.out.println("---------------------------------------- ");
		for (Integer number : list) {
			System.out.println(number);
			
		}
		System.out.println("---------------------------------------- ");
		
		Iterator<Integer> iter =  list.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		

	}

}
