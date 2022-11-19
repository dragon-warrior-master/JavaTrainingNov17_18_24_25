package training.java.stringprograms;

public class LearnStrings {

	public static void main(String[] args) {

		fibonacciSeries(10);

	}

	// fibonacci series 0 , 1,1,2,3,5,8,13................
	public static void fibonacciSeries(Integer numberOfElements) {// numberOfElements = 10

		// 1. what we know to do that program for ex. logic , preconditions, inputs,
		// outputs

		if (numberOfElements < 3) {
			System.out.println("Max 3 number needed...");
		} else {
			System.out.print("0 , 1");
		}
		int a = 0, b = 1;
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum = a + b;
			System.out.print(", " + sum);
			a = b;
			b = sum;

		}

	}

}
