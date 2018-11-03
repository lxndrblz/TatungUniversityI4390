/*
 * Invoke the operateBinary method by using an anonymous class as the method’s argument.
 * This anonymous class is used to compute the multiplication and also print out
 * the string “Invoke by anonymous class”.
 */
public class CalculatorB {
	interface IntegerMath {
		int operation(int a, int b);
	}

	public int operateBinary(int a, int b, IntegerMath m) {
		return m.operation(a, b);
	}

	public static void main(String... args) {
		// Create a new instance of the calculator class
		CalculatorB myApp = new CalculatorB();

		// Pass the multiplication as an argument and print out the results
		System.out.println("20 * 10 = " + myApp.operateBinary(30, 10, new IntegerMath() {
			public int operation(int a, int b) {
				// Print out the invoke comment
				System.out.println("Invoke by anonymous class");
				return a * b;
			}
		}));

	}
}
