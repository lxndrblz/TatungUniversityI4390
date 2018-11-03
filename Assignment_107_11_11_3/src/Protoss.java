/**
 * @author alexanderbilz
 *
 * This class represents the Protoss Alien race
 */
public class Protoss implements bloodLevel{

	private float bloodLevel;
	
	@Override
	public void setBloodLevel(float bloodLevel) {
		// TODO Auto-generated method stub
		this.bloodLevel = bloodLevel;
	}

	@Override
	public float getBloodLevel() {
		// TODO Auto-generated method stub
		return bloodLevel;
	}

	@Override
	public void title() {
		// TODO Auto-generated method stub
		String title =
		"  _____           _                \n" + 
		" |  __ \\         | |               \n" + 
		" | |__) | __ ___ | |_ ___  ___ ___ \n" + 
		" |  ___/ '__/ _ \\| __/ _ \\/ __/ __|\n" + 
		" | |   | | | (_) | || (_) \\__ \\__ \\\n" + 
		" |_|   |_|  \\___/ \\__\\___/|___/___/\n" + 
		"                                   \n" + 
		"                                   ";
		
		System.out.println(title);
	}

}
