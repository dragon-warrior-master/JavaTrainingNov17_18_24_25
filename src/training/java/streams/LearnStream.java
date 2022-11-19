package training.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LearnStream {

	public static void main(String[] args) {

		List<String> names1 = new ArrayList<String>();
		names1.add("India");
		names1.add("USA");
		names1.add("Bhutan");
		names1.add("Bhutan");
		names1.add("Qatar");
		names1.add("Qatar");

		System.out.println("----------------------------------------");

		List<String> name = names1.stream().distinct().collect(Collectors.toList());

		System.out.println(" distinct : " + name);
		

		// names1.forEach(name -> System.out.println(" " + name));
		System.out.println("----------------------------------------");
		List<Integer> number = Arrays.asList(2, 3, 4, 5, 3);

		List<Integer> squares = number.stream().map(n -> n * n).collect(Collectors.toList());

		number.forEach(n -> System.out.print(" " + n));

		System.out.println("----------------------------------------");
		List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 3);

		List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.print("Even : " + evenNumbers);

		System.out.println();
		System.out.println("----------------------------------------");

		// We want to have name with first letter as small letter
		List<String> lowercase = names1.stream().map(country -> country.toLowerCase()).collect(Collectors.toList());

		lowercase.forEach(x -> System.out.println(" " + x));

		System.out.println("----------------------------------------");
		List<String> countryWithI = names1.stream().filter(country -> country.startsWith("I"))
				.collect(Collectors.toList());
		countryWithI.forEach(x -> System.out.println(" " + x));

		names1.stream().collect(Collectors.toList());

		System.out.println("----------------------------------------");

		List<String> namess = names1.stream().distinct().collect(Collectors.toList());

		countryWithI.forEach(x -> System.out.println(" " + x));

		names1.stream().collect(Collectors.toList());
		
		

	}

}
