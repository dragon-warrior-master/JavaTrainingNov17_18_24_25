package training.java.exceptions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LearnExceptions {

	public static void main(String[] args) throws InterruptedException, ArithmeticException {

//		printTable(5);
//		String s = "";

		Employee emp = new Employee();
		try {
			emp.printName();
		} catch (Exception e) {
			System.out.println(e.getMessage());			
		}		
		
	}
	
	
	
	
	

	public static void printTable(Integer number) {
		Employee emp = new Employee();
		
		//System.out.println(8/0);
		
		try {

			for (int i = 1; i <= 10; i++) {
				emp.printName();
				System.out.println(5 / 0);
				//Arithmatic Exception

				//System.out.println(number*i);
			}
		} catch (java.lang.ArithmeticException e) {
			System.out.println("Exception has occured ::" + e.getMessage());
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println(" ArrayIndexOutOfBoundsException Exception has occured ::" + e.getMessage());
		} catch (java.lang.NullPointerException e) {
			System.out.println(" Null Exception has occured ::" + e.getMessage());
		} catch (Exception e) {
			System.out.println(" Exception has occured ::" + e.getMessage());
		} finally {
			System.out.println("Finally Block executed....");
		}

		System.out.println("Further COde...");

		try {
			System.out.println("Further COde...");
			System.out.println("Further COde...");
		} catch (Exception e) {

		}
		
		

		/// nested try catch
		// try catch with in try catch

		// findElement(By.XPath("xpath")); NoSuchElementException

//		try {
//
//			try {
//				findElement(By.XPath("xpath"));
//
//			} catch (NoSuchElementException e) {
//
//				try {
//					findElement(By.XPath("xpath"));
//				} catch (Exception e) {
//
//				}
//
//			}
//			System.out.println(5 / 0);
//
//		} catch (ArithmeticException e) {
//
//		}

//		try {
//
//			try {
//				emp.printName();
//
//			} catch (NullPointerException e) {
//
//			}
//			System.out.println(5 / 0);
//
//		} catch (ArithmeticException e) {
//
//		}

	}

}

class Employee {
	void printName() throws Exception {
		
		//throw
		for (int i = 1; i <=10; i++) {
			
			
			
			System.out.println(i);
			if(i==5) {
				throw new Exception("Count has arrived to 5");
			}
			
		}
		

	}
}