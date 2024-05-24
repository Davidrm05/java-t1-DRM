package persistencia;

/**
 * The Class Window.
 */
public class Window {

	/** The width. */
	private int width;
	
	/** The height. */
	private int height;
	
	/** The obstaculos. */
	Obstacle[] obstaculos = new Obstacle[10];

	/**
	 * Instantiates a new window.
	 */
	public Window() {
		this.width = 500;
		this.height = 500;
		
		//Instance manually the obstacles because it must be at a specific places.
		obstaculos[0] = new Obstacle(Utils.OBS_SIDE, Utils.OBS_SIDE, new Coordinates(100, 100));
		obstaculos[1] = new Obstacle(Utils.OBS_SIDE, Utils.OBS_SIDE, new Coordinates(200, 200));
		obstaculos[2] = new Obstacle(Utils.OBS_SIDE, Utils.OBS_SIDE, new Coordinates(300, 300));
		obstaculos[3] = new Obstacle(Utils.OBS_SIDE, Utils.OBS_SIDE, new Coordinates(400, 400));
		obstaculos[4] = new Obstacle(Utils.OBS_SIDE, Utils.OBS_SIDE, new Coordinates(400, 200));
		obstaculos[5] = new Obstacle(Utils.OBS_SIDE, Utils.OBS_SIDE, new Coordinates(300, 200));
		obstaculos[6] = new Obstacle(Utils.OBS_SIDE, Utils.OBS_SIDE, new Coordinates(400, 300));
		obstaculos[7] = new Obstacle(Utils.OBS_SIDE, Utils.OBS_SIDE, new Coordinates(100, 400));
		obstaculos[8] = new Obstacle(Utils.OBS_SIDE, Utils.OBS_SIDE, new Coordinates(200, 100));
		obstaculos[9] = new Obstacle(Utils.OBS_SIDE, Utils.OBS_SIDE, new Coordinates(300, 100));
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
	 * Gets the obstaculos.
	 *
	 * @return the obstaculos
	 */
	public Obstacle[] getObstaculos() {
		return obstaculos;
	}

	/**
	 * Sets the obstaculos.
	 *
	 * @param obstaculos the new obstaculos
	 */
	public void setObstaculos(Obstacle[] obstaculos) {
		this.obstaculos = obstaculos;
	}
}
