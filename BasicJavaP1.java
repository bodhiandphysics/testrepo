class BasicJavaP1 {

	public static long floor(double num) {

		return (long) num;
	}

	public static double conversion(double fahr) {

		return ((fahr - 32) / 1.8);
	}

	public static boolean willRoundUp(double num) {

		return (num - ((long) num)) >= .5;
	}

	public static int sumRange(int start, int end) {

		int sum = 0;
		int startnum = start ;
		int endnum = end;

		
		if(start > end) {  //check to make sure counting up
			
			startnum = end + 1;

			endnum = start + 1; //to avoid off by one error when going backwards

		}

		for (int number = startnum; number < endnum; number++ ) {

			sum += number;
			
		}

		return sum;
	}

	public static int countChar(String str, char c) {

		int count = 0;

		for (int i = 0; i < str.length() ; i++ ) {

			if (str.charAt(i) == c) { 

				count++;  

			}
			
		}

		return count;
	}


	public static int addDigits(int num) {

		int sum = 0;
		int quotient = num;

		while (quotient != 0) {

			sum += quotient % 10;
			
			quotient /= 10;
		}

		return sum;
	}
}