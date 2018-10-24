/*
 * Invoke the operateBinary method by using method reference to the method multiply.
 */

public class CalculatorD {
	interface IntegerMath {
		int operation(int a, int b);
	}

	public int multiply(int a1, int a2) {
		// Call the lambda function
		IntegerMath multiplication = (a, b) -> a1 * a2;
		return operateBinary(a1, a2, multiplication);
	}

	public int operateBinary(int a, int b, IntegerMath op) {
		return op.operation(a, b);
	}

	public static void main(String... args) {
		// Create a new instance of the calculator class
		CalculatorD myApp = new CalculatorD();

		// Print out the results
		System.out.println("20 * 10 = " + myApp.multiply(20, 10));
	}
}
