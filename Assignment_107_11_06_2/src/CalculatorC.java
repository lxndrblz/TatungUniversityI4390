/*
 * Add a method, called multiply, in the Calculator class to compute the
 * multiplication of two integers. This method should be designed to 
 * also print out the string “method in the Calculator class”.
 * Then, invoke the operateBinary method by using lambda expression.
 * This lambda expression should call the method multiple to
 * compute multiplication.
 */
interface IntegerMath {
	int operateBinary(int a, int b);
}
public class CalculatorC implements IntegerMath{


	public static int multiply(int a, int b) {
		System.out.println("Method in the Calculator class");
		return a * b;
	}

	public int operateBinary(int a, int b) {
		return multiply(a, b);
	}

	public static void main(String... args) {
		// Invoke multiply using a lambda expression
		IntegerMath multiplication = (a,b) -> multiply(a,b);
		// Print out the results
		System.out.println("20 * 10 = " + multiplication.operateBinary(20, 10));
	}
}
