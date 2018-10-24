
public class Lamp {
	// Represents the state of the lamp, true means the lamp is switched on
	private boolean state;

	// Default Constructor for the lamp, with state switched off
	public Lamp() {
		state = false;
	}

	// Constructor to pass the state
	public Lamp(boolean state) {
		this.state = state;
	}

	// Change the state of the lamp to on
	public void switchOn() {
		state = true;
	}

	// Change the state of the lamp to off
	public void switchOff() {
		state = false;
	}

	// Returns the current state of the lamp
	public boolean getState() {
		return state;
	}

	// Prints the state of the lamp as a console output
	public void printState() {
		if (getState()) {
			System.out.println("The lamp is currently ON");
		} else {
			System.out.println("The lamp is currently OFF");
		}
	}
}
