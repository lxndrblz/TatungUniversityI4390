/*
 * Invoke the operateBinary method by using an anonymous class as the method’s argument.
 * This anonymous class is used to compute the multiplication and also print out
 * the string “Invoke by anonymous class”.
 */
public class CalculatorB {
	interface IntegerMath {
		int operation(int a, int b);
	}
	static class Multiplication implements IntegerMath{
		private int a, b;
		
		Multiplication(int a, int b){
			this.a=a;
			this.b=b;
		}
		
		public int getA() {
			return a;
		}
		public void setA(int a) {
			this.a = a;
		}
		public int getB() {
			return b;
		}
		public void setB(int b) {
			this.b = b;
		}

		@Override
		public int operation(int a, int b) {
			System.out.println("Invoked by anonymous class");
			return a*b;
		}
	}

	public int operateBinary(Multiplication m) {
		return m.operation(m.a,m.b);
	}

	public static void main(String... args) {
		// Create a new instance of the calculator class
		CalculatorB myApp = new CalculatorB();
		// Create a new instance of the multiplication Class
		Multiplication multiplication = new Multiplication(20,10);
		// Pass the multiplication as an argument and print out the results
		System.out.println("20 * 10 = " + myApp.operateBinary(multiplication));

	}
}
