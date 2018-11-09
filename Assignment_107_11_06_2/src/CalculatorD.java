/*
 * Invoke the operateBinary method by using method reference to the method multiply.
 */

public class CalculatorD {
	interface IntegerMath {
		int operation(int a, int b);
	}

	public int multiply(int a, int b) {
		System.out.println("Method Reference in the Calculator class");
		return a *b;
	}

	public int operateBinary(int a, int b, IntegerMath op) {
		return op.operation(a, b);
	}

	public static void main(String... args) {
		// Create a new instance of the calculator class
		CalculatorD myApp = new CalculatorD();
		// Method reference
		IntegerMath multiplication = myApp::multiply;
		// Call multiply and print out the results
		System.out.println("20 * 10 = " + myApp.operateBinary(20, 10, multiplication));
	}
}
