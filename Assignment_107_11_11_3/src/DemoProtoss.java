
public class DemoProtoss {

	public static void main(String[] args) {
		// Instantiate a new Protoss
		Protoss protoss = new Protoss();
		// Test the title Method
		protoss.title();
		
		//Loop through the bloodlevel it's 0
		for(int i = 100; i >= 0; i--) {

			// Set an updated blood level
			protoss.setBloodLevel((i/100f));
			// Fetch the current blood level
			System.out.format("Blood Level is: %.2f \n", protoss.getBloodLevel());
		}
	}

}
