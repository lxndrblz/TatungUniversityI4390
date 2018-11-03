
/**
 * Generic class Rectangle to represent a rectangle in 2-dimensional plane
 */

/**
 * @author alexanderbilz
 *
 */

// Class for storing the Coordinates as generics
class Coordinates<T, S> {

	// Method for easily printing the coordinats
	@Override
	public String toString() {
		return "Coordinates [x=" + first + ", y=" + second + "]";
	}

	public T first;
	public S second;

	// Constructor.
	public Coordinates(T a, S b) {
		first = a;
		second = b;
	}
}

public class Rectangle<T> {

	private T width;
	private T length;
	private Coordinates<T, T> lowerLeftCorner;

	// Constructor for generic Rectangle
	public Rectangle(T width, T length, Coordinates<T, T> lowerLeftCorner) {
		this.width = width;
		this.length = length;
		this.lowerLeftCorner = lowerLeftCorner;
	}

	// Get Width
	public T getWidth() {
		return width;
	}

	// Set Width
	public void setWidth(T width) {
		this.width = width;
	}

	// Get Length
	public T getLength() {
		return length;
	}

	// Set Length
	public void setLength(T length) {
		this.length = length;
	}

	// Get Lower Left Corner
	public Coordinates<T, T> getLowerLeftCorner() {
		return lowerLeftCorner;
	}

	// Set Lower Left Corner
	public void setLowerLeftCorner(Coordinates<T, T> lowerLeftCorner) {
		this.lowerLeftCorner = lowerLeftCorner;
	}

	// Print Method for outputting all variables to the command line
	public void printRectangle() {
		System.out.println("Rectangle [width=" + width + ", length=" + length + ", lowerLeftCorner="
				+ lowerLeftCorner.toString() + "]");
	}
}
