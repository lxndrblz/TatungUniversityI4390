/**
 * 
 */

/**
 * @author alexanderbilz
 *
 */
public interface bloodLevel {
	void setBloodLevel(float bloodLevel);

	float getBloodLevel();

	public default void title() {
		String title = "          __                                     _____  __   \n"
				+ "  _______/  |______ _______   ________________ _/ ____\\/  |_ \n"
				+ " /  ___/\\   __\\__  \\\\_  __ \\_/ ___\\_  __ \\__  \\\\   __\\\\   __\\\n"
				+ " \\___ \\  |  |  / __ \\|  | \\/\\  \\___|  | \\// __ \\|  |   |  |  \n"
				+ "/____  > |__| (____  /__|    \\___  >__|  (____  /__|   |__|  \n"
				+ "     \\/            \\/            \\/           \\/             ";

		System.out.println(title);
	}

}
