public class L02_CodingChallenge1 {

	public static boolean isLowercaseChar(char aChar) {

		if ((int) aChar >= 97 && (int) aChar <= 122) {

			return true;
			
		} else {

			return false;
		}

	}


	public static long ceilingOfMultiplication(int num1, double num2) {

		double product = num1 * num2;

		if ((product - (int) product) < .5) { 

			return (int) product; 

		} else {

			return ((int) product) + 1;
		}


	}	
}
