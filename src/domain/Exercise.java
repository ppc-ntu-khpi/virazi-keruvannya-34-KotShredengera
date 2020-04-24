package domain;

/**
 * Calculation and nesting of results
 * 
 * @author Kot_Shredingera
 *
 */
public class Exercise {
	/**
	 * Determining whether a number is a Narcissistic
	 * 
	 * @param R - input number
	 * @return boolean values (is Narcissistic number - true; not - false)
	 */
	public static boolean Calculate(short R) {
		if (R < 0) {
			System.out.println("¬вед≥ть натуральне число!");
			System.exit(0);
		}
		short number = R, flag = 0;
		byte count = 0;

		while (number != 0) {
			number = (short) (number / 10);
			count++;
		}
		number = R;
		for (int i = 0; i < count; i++) {
			flag = (short) (flag + (int) (Math.pow(number % 10, count)));
			number = (short) (number / 10);
		}

		return flag == R;
	}
}
