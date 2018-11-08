/**
 * 
 */

/**
 * @author alexanderbilz
 *
 */
public interface bloodLevel {

	// Setter for Bloodlevel
	void setBloodLevel(float bloodLevel);

	// Getter for Bloodlevel
	float getBloodLevel();

	// Method for printing out the starcraft message
	public default void title() {

		// The starcraft message
		String title = "          __                                     _____  __   \n"
				+ "  _______/  |______ _______   ________________ _/ ____\\/  |_ \n"
				+ " /  ___/\\   __\\__  \\\\_  __ \\_/ ___\\_  __ \\__  \\\\   __\\\\   __\\\n"
				+ " \\___ \\  |  |  / __ \\|  | \\/\\  \\___|  | \\// __ \\|  |   |  |  \n"
				+ "/____  > |__| (____  /__|    \\___  >__|  (____  /__|   |__|  \n"
				+ "     \\/            \\/            \\/           \\/             ";
		// Print the message to teh commandline
		System.out.println(title);
	}

}
