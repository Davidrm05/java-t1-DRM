package persistencia;

/**
 * The Class Obstacle.
 */
public class Obstacle {
	
	/** The width. */
	private int width;
	
	/** The height. */
	private int height;
	
	/** The coordinates. */
	private Coordinates coordinates;
	
	/**
	 * Instantiates a new obstacle.
	 *
	 * @param width the width
	 * @param height the height
	 * @param coordinates the coordinates
	 */
	public Obstacle(int width, int height, Coordinates coordinates) {
		super();
		this.width = width;
		this.height = height;
		this.coordinates = coordinates;
	}
	
	/**
	 * Gets the width.
	 *
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}
	
	/**
	 * Sets the width.
	 *
	 * @param width the new width
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	
	/**
	 * Gets the height.
	 *
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	
	/**
	 * Sets the height.
	 *
	 * @param height the new height
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
	/**
	 * Gets the coordinates.
	 *
	 * @return the coordinates
	 */
	public Coordinates getCoordinates() {
		return coordinates;
	}
	
	/**
	 * Sets the coordinates.
	 *
	 * @param coordinates the new coordinates
	 */
	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}
	

}
