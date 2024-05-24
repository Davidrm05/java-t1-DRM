package persistencia;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * The Class Utils.
 */
public class Utils {
	
	/**
	 * Instantiates a new utils.
	 */
	private Utils() {
		super();
	}

	/** The Constant rand. */
	private static final Random rand = new Random();
	
	public static final int OBS_SIDE = 100;

	/**
	 * Checks if is int.
	 *
	 * @param text the text
	 * @return true, if is double
	 */
	public static boolean isInt(String text) {
		try {
			int i = Integer.parseInt(text);
			// Check if the number is between 0 and 10
			return i > 0 && i < 11;
		} catch (NumberFormatException ex) {
			return false;
		}
	}
	
	/**
	 * Generate random number.
	 *
	 * @param end the end
	 * @return the int
	 */
	public static int generateRandomNumber(int end) {
		return rand.nextInt(end);
	}
	
	/**
	 * Sysout without SonarLint errors at the calls.
	 *
	 * @param text the text
	 */
	public static void write(String text) {
		System.out.println(text);
	}
	
	/**
	 * Menu.
	 *
	 * @param options the options
	 * @param optionsval the optionsval
	 * @param codopc the codopc
	 * @return the string
	 */
	public static String menu(List<String> options, List<String> optionsval, String codopc) {
		
		writeOptions(options, codopc);
		return askOptionVal(optionsval);
		
	}
	
	/**
	 * Write options.
	 *
	 * @param options the options
	 * @param codopc the codopc
	 */
	public static void writeOptions(List<String> options, String codopc) {
		
		System.out.println(codopc);
		for (int i=0;i<options.size();i++) {
			System.out.println(options.get(i));	
		}
		
	}
	
	/**
	 * Ask option val.
	 *
	 * @param opcionesval the opcionesval
	 * @return the string
	 */
	public static String askOptionVal(List<String> opcionesval) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		String dato = null;
		boolean correcto = false;
		while (!correcto) {
			System.out.println("Choose one option");
			dato = teclado.nextLine();
			for (int j=0;j<opcionesval.size();j++ ) {
				if (opcionesval.get(j).equals(dato)) {
					correcto = true;
				}
			}
		}
		return dato;
	}
	
}
