/*
 * Invoke the operateBinary method by using lambda expression.
 * This lambda expression computes the result of multiplication and also print out
 * the string “Invoke by lambda expression”.
 * 
 * Given Calculator Class:
 *     public class Calculator {
 *      interface IntegerMath { int operation(int a, int b); }
 *      // method operateBinary performs a mathematical operation on two integer operands
 *      // The operation itself is specified by an instance of IntegerMath
 *      public int operateBinary(int a, int b, IntegerMath op) {
 *               return op.operation(a, b);
 *      }
 *      public static void main(String... args) {
 *           Calculator myApp = new Calculator();
 *           IntegerMath addition = (a, b) -> a + b;      // addition operation with lambda expressions
 *           IntegerMath subtraction = (a, b) -> a - b;  // subtraction operation with lambda expressions
 *           System.out.println("40 + 2 = " +
 *                             myApp.operateBinary(40, 2, addition));
 *           System.out.println("20 - 10 = " +
 *                             myApp.operateBinary(20, 10, subtraction));
 *      }
 *  } 
 * 
 */
public class CalculatorA {
	interface IntegerMath {
		int operation(int a, int b);
	}

	public int operateBinary(int a, int b, IntegerMath op) {
		System.out.println("Invoked by lambda expression");
		return op.operation(a, b);
	}

	public static void main(String... args) {
		// Create a new instance of the calculator class
		CalculatorA myApp = new CalculatorA();
		// Call the lambda function
		IntegerMath multiplication = (a, b) -> a * b;
		// Print out the results
		System.out.println("20 * 10 = " + myApp.operateBinary(20, 10, multiplication));
	}
}
