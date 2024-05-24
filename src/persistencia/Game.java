package persistencia;

import java.util.Scanner;

public class Game {

	/** The score. */
	private Score score;

	/** The player. */
	private Player player;

	/** The ball. */
	private Ball ball;
	
	/** The window. */
	private Window window;
	
	/** The Constant IN. */
	public static final Scanner IN = new Scanner(System.in);

	/**
	 * Instantiates a new game.
	 *
	 * @param score  the score
	 * @param player the player
	 * @param ball   the ball
	 */
	private Game(Player player) {
		this.player = player;
		this.score = new Score();
		this.ball = new Ball();
		this.setWindow(new Window());
	}

	/**
	 * Gets the score.
	 *
	 * @return the score
	 */
	public Score getScore() {
		return score;
	}

	/**
	 * Sets the score.
	 *
	 * @param score the new score
	 */
	public void setScore(Score score) {
		this.score = score;
	}

	/**
	 * Gets the player.
	 *
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * Sets the player.
	 *
	 * @param player the new player
	 */
	public void setPlayer(Player player) {
		this.player = player;
	}

	/**
	 * Gets the ball.
	 *
	 * @return the ball
	 */
	public Ball getBall() {
		return ball;
	}

	/**
	 * Sets the ball.
	 *
	 * @param ball the new ball
	 */
	public void setBall(Ball ball) {
		this.ball = ball;
	}

	public Window getWindow() {
		return window;
	}

	public void setWindow(Window window) {
		this.window = window;
	}

	/**
	 * Launch and start.
	 *
	 * @throws NumberFormatException the number format exception
	 */
	public static void launchAndStart() throws NumberFormatException {

		//Ask for the user's name
		Utils.write("Introduce el nombre del jugador");
		
		String nombre = IN.nextLine();
		
		Player p = new Player(nombre);
		
		Game g = new Game(p);
		
		//Inside the Do-While call every PinballEvents but the actions don't will be executed (random numbers in the methods)
		do {
			PinballEvents.generateCrashes(g);
			
			PinballEvents.stealBox(g);
			
			PinballEvents.bonuses(g);
			
			PinballEvents.luckyBox(g);
			
			//Do-While finish when both coordinates of the ball are divider of 5.
		}while(g.getBall().getActualCoordinates().getWidth() % 5 != 0 || g.getBall().getActualCoordinates().getHeight() % 5 != 0);
		
		//Show the user's name and the points
		Utils.write("The player " + g.getPlayer().getName() + " has get " + g.getScore().getScore()*g.getPlayer().getLucky() + " points");
		
	}

	
}
