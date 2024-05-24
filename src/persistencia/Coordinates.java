package persistencia;

/**
 * The Class Coordinates.
 */
public class Coordinates {

	/** The width. */
	private int width;
	
	/** The height. */
	private int height;
	
	/**
	 * Instantiates a new coordinates.
	 *
	 * @param width the width
	 * @param height the height
	 */
	public Coordinates(int width, int height) {
		super();
		this.width = width;
		this.height = height;
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
	public Coordinates setWidth(int width) {
		this.width = width;
		return this;
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
	public Coordinates setHeight(int height) {
		this.height = height;
		return this;
	}
	
}
