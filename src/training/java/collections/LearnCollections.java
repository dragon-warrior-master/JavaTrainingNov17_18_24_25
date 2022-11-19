package training.java.collections;

import java.util.*;

public class LearnCollections {

	public static void main(String[] args) {

//		List<String> list1 = Collections.emptyList();
//		
//		System.out.println(list1);

		// list = webElements.Text;

		List<String> names1 = new ArrayList<String>();
		List<String> names2 = new ArrayList<String>();
		names1.add("andia");
		names1.add("ASA");
		names1.add("Bhutan");

		names2.add("Singapore");
		names2.add("Malaysia");
		names2.add("Qatar");

		System.out.println("---------------------");

		String minName = Collections.min(names1);

		System.out.println("Min Name : " + minName);
		System.out.println("--------------------------");

		System.out.println("---------------------");

		String maxName = Collections.max(names1);

		System.out.println("Max Name : " + maxName);
		System.out.println("--------------------------");

		Collections.sort(names1, Comparator.reverseOrder());

		System.out.println("---------------------");
		System.out.println("Reverse Order");
		names1.forEach(name -> System.out.println(name));
		System.out.println("---------------------");

		Collections.addAll(names1, "Japan", "Singapore");

		names1.forEach(name -> System.out.println(name));

		List<String> list = Collections.emptyList();
		System.out.println("---------------------");
		Collections.sort(names1);

		names1.forEach(name -> System.out.println(name));
		System.out.println("---------------------");

		int count = Collections.frequency(names1, "India");// case sensitive
		System.out.println(count);

	}

}
