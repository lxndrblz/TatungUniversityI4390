
public class DemoLamp {
	public static void main(String[] args) {
	// Create instance of the lamp that's on
	Lamp mylamp1 = new Lamp(true);
	mylamp1.printState();
	// switch off and print state
	mylamp1.switchOff();
	mylamp1.printState();
	// switch on and print state again
	mylamp1.switchOn();
	mylamp1.printState();
	// Create an instance using the default constructor
	Lamp mylamp2 = new Lamp();
	mylamp2.printState();
	}
}
