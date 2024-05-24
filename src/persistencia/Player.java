package persistencia;

/**
 * The Class Player.
 */
public class Player {

	/**  Name of the player. */
	private String name;

	/**  The lucky for the Game. */
	private int lucky;

	/**
	 * Instantiates a new player.
	 *
	 * @param name the name
	 * @param lucky the lucky
	 */
	public Player(String name) {
		this.setName(name);
		this.lucky = Utils.generateRandomNumber(2);
	}

	/**
	 * Gets the name from the player.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the player.
	 *
	 * @param name the new name
	 */
	private void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the lucky from the player.
	 *
	 * @return the lucky
	 */
	public int getLucky() {
		return lucky;
	}

	/**
	 * Sets the lucky of the player.
	 *
	 * @param lucky the new lucky
	 */
	public void setLucky(int lucky) {
		this.lucky = lucky;
	}

}
