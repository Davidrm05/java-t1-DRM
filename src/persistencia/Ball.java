package persistencia;

/**
 * The Class Ball.
 */
public class Ball {

	/** The actual coordinates. */
	private Coordinates actualCoordinates;
	
	public Ball() {
		super();
		this.actualCoordinates = new Coordinates(0,0);
	}
	
	/**
	 * Gets the actual coordinates.
	 *
	 * @return the actual coordinates
	 */
	public Coordinates getActualCoordinates() {
		return actualCoordinates;
	}
	
	

	/**
	 * Sets the actual coordinates.
	 *
	 * @param actualCoordinates the new actual coordinates
	 */
	public void setActualCoordinates(Coordinates actualCoordinates) {
		this.actualCoordinates = actualCoordinates;
	}
	
	public void generateNewCoordinates(int windowWidth, int windowHeight){
		this.getActualCoordinates().setWidth(Utils.generateRandomNumber(windowWidth)).setHeight(Utils.generateRandomNumber(windowHeight));
	}


}
