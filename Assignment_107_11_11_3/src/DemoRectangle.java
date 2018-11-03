public class DemoRectangle {

	public static void main(String[] args) {
		// Integer Rectangle
		Rectangle<Integer> integerRectangle = new Rectangle<>(100, 100, new Coordinates<Integer, Integer>(300, 300));
		integerRectangle.printRectangle();

		// Double Rectangle
		Rectangle<Double> doubleRectangle = new Rectangle<>(123.456, 123.456,
				new Coordinates<Double, Double>(345.67, 345.67));
		doubleRectangle.printRectangle();
	}

}
