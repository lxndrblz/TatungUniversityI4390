/*
 * Add a method, called multiply, in the Calculator class to compute the
 * multiplication of two integers. This method should be designed to 
 * also print out the string “method in the Calculator class”.
 * Then, invoke the operateBinary method by using lambda expression.
 * This lambda expression should call the method multiple to
 * compute multiplication.
 */
public class CalculatorC {
	interface IntegerMath {
		int operation(int a, int b);
	}

	public int multiply(int a, int b) {
		System.out.println("Method in the Calculator class");
		return a * b;
	}

	public int operateBinary(int a, int b, IntegerMath op) {
		return multiply(a, b);
	}

	public static void main(String... args) {
		// Create a new instance of the calculator class
		CalculatorC myApp = new CalculatorC();
		// Call the lambda function
		IntegerMath multiplication = (a, b) -> a * b;
		// Print out the results
		System.out.println("20 * 10 = " + myApp.operateBinary(0, 10, multiplication));
	}
}
