package training.java.collections;

import java.util.*;

public class LinkedLists {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<Integer>();
		
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
		
		
		Queue<Integer> queuelist = new LinkedList<Integer>();
		queuelist.add(4);

		
		queuelist.add(98);
		System.out.println(queuelist.containsAll(list));
		System.out.println("Peek Element   " + queuelist.peek());
		
		System.out.println("Poll Element   " + queuelist.poll());
		System.out.println("Poll Element   " + queuelist.poll());
		
		System.out.println("Linked List " + queuelist.element());
		
	}

}
