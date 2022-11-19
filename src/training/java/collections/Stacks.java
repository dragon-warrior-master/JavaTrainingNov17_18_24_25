package training.java.collections;

import java.util.*;

public class Stacks {

	public static void main(String[] args) {

		
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(3);
		stack.push(76);
		stack.push(6);
		stack.push(3);
		stack.push(43);
		
		System.out.println(stack);
		
		System.out.println("Top Element   : "+ stack.peek());
		
		System.out.println("Push Top Element   : "+ stack.push(67));
		
		System.out.println(stack);
		
		System.out.println("Pop Top Element   : "+ stack.pop());
		System.out.println(stack);
	}

}
