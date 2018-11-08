/**
 * @author alexanderbilz
 *
 *         This class represents the Protoss Alien race
 */
public class Protoss implements bloodLevel {

	private float bloodLevel;

	@Override
	// Method for setting the bloodlevel
	public void setBloodLevel(float bloodLevel) {
		this.bloodLevel = bloodLevel;
	}

	@Override
	// Method for retrieving the bloodlevel
	public float getBloodLevel() {
		return bloodLevel;
	}

}
