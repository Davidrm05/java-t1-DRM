package persistencia;

import java.util.ArrayList;

public class PinballEvents {

	/**
	 * Instantiates a new pinball events.
	 */
	private PinballEvents() {
		super();
	}

	/**
	 * Generate crashes on the windows.
	 *
	 * @param g the g
	 */
	public static void generateCrashes(Game g) {
		if (g.getBall() instanceof Ball) {
			//Generate 10 new coordinates for the ball
			for (int i = 1; i < 10; i++) {
				// Genero unas nuevas coordenadas para la bola
				g.getBall().generateNewCoordinates(g.getWindow().getWidth(), g.getWindow().getHeight());

				// Use temporal variables avoiding for too many calls to the getter
				int coorWidth = g.getBall().getActualCoordinates().getWidth();
				int coorHeight = g.getBall().getActualCoordinates().getHeight();

				 // For each new coordinates of the ball, check if the coordinates are in the
				 // coordinates of a obstacle
				
				for (int y = 0; y < g.getWindow().getObstaculos().length; y++) {

					//Temporal variables for Width, Height, X and Y.
					
					int widthObs = g.getWindow().getObstaculos()[y].getWidth();
					int heightObs = g.getWindow().getObstaculos()[y].getHeight();

					int coorWidthObs = g.getWindow().getObstaculos()[y].getCoordinates().getWidth();
					int coorHeightObs = g.getWindow().getObstaculos()[y].getCoordinates().getHeight();

					//If the ball has crash with a obstacle increment the score in 20
					if (coorWidth > coorWidthObs && coorWidth < coorWidthObs + widthObs && coorHeight > coorHeightObs
							&& coorHeight < coorHeightObs + heightObs) {
						g.getScore().setScore(g.getScore().getScore() + 20);
					}

				}
			}
		}
	}

	/**
	 * Steal box.
	 *
	 * @param g the g
	 */
	public static void stealBox(Game g) {
		int num = Utils.generateRandomNumber(5);
		if (num == 3) {
			Utils.write("You have " + g.getScore().getScore() + " points.");

			Utils.write("You have fall into the steal box");
			Utils.write(
					"I will ask you for a number, if you guess it I will give you 100 points but if you fail I keep 100 of your puntos");
			int correctNumber = Utils.generateRandomNumber(3);
			Utils.write("The number is between 1 and 3, which do you think");
			int answer = Game.in.nextInt();
			if (correctNumber == answer) {
				Utils.write("Correct answer, 100 points for you!");
				g.getScore().setScore(g.getScore().getScore() + 100);
			} else {
				Utils.write("Nooo, the number is " + correctNumber + ", 100 points for me.");
				if (g.getScore().getScore() >= 100) {
					g.getScore().setScore(g.getScore().getScore() - 100);
				} else {
					g.getScore().setScore(0);
				}
			}
		}
	}

	/**
	 * Bonuses.
	 *
	 * @param g the g
	 */
	public static void bonuses(Game g) {
		//Generate a new number between 1 and 15
		int num = Utils.generateRandomNumber(15);

		//Put one number, the probabilities for get in are 7%
		if (num == 7) {
			Utils.write("You have " + g.getScore().getScore() + " points.");

			//Create the content of the menu
			ArrayList<String> options = new ArrayList<>();
			options.add("1. +500 points");
			options.add("2. Lucky x2");
			options.add("3. Multiply points x2");
			ArrayList<String> optionsval = new ArrayList<>();
			optionsval.add("1");
			optionsval.add("2");
			optionsval.add("3");

			Utils.write("You have fall into the bonus box");
			Utils.write("Tell me, want bonus do you want");

			//Show the menu and get a answer
			String answer = Utils.menu(options, optionsval, "Choose one option");

			//Give the bonus
			switch (answer) {
			case "1":
				g.getScore().setScore(g.getScore().getScore() + 500);
				break;
			case "2":
				g.getPlayer().setLucky(2);
				break;
			case "3":
				g.getScore().setScore(g.getScore().getScore() * 2);
				break;
			default:
				break;
			}

		}
	}

	/**
	 * Lucky box.
	 *
	 * @param g the g
	 */
	public static void luckyBox(Game g) {
		//Generate a random number between 1 and 6.
		int num = Utils.generateRandomNumber(6);
		
		//While the num is distinct of 2 get in.
		while (num != 2) {
			//Update the number for the next loop.
			num = Utils.generateRandomNumber(6);
			
			//Get a number of points between 1 and 100 and the action (1 = +, 2 = -)
			int points = Utils.generateRandomNumber(100);
			int action = Utils.generateRandomNumber(2);
			
			//Update the score
			if (action == 1) {
				g.getScore().setScore(g.getScore().getScore() + points);
			} else {
				g.getScore().setScore(g.getScore().getScore() - points);
			}
		}

	}

}
