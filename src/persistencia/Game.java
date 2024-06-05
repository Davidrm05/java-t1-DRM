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
	
	/** The Scanner. */
	public static final Scanner in = new Scanner(System.in);

	/**
	 * Instantiates a new game.
	 *
	 * @param score  the score
	 * @param player the player
	 * @param ball   the ball
	 */
	private Game(Player player, Score score, Ball ball, Window window) {
		this.player = player;
		this.score = score;
		this.ball = ball;
		this.setWindow(window);
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
		
		String nombre = in.nextLine();
		
		Player p = new Player(nombre);
		
		Game g = new Game(p, new Score(), new Ball(), new Window());
		
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
