import java.util.ArrayList;


class ArrayListCodingXP {

	public static int indexOf(ArrayList<Integer> nums, int numToFind) {

		if (nums.contains(numToFind)) {

			return nums.indexOf(numToFind);
			
		} else {

			return -1;
		}
	}


	public static void insert(ArrayList<Double> nums, double numToInsert, int insertAtIndex) {


		if (insertAtIndex < nums.size()) {

			nums.add(insertAtIndex, numToInsert);
			
		}
	}


	public static String lastInAlphabet(ArrayList<String> strs) {

		if (strs.isEmpty()) {

			return "";

		}
			
		String laststring = strs.get(0);

		for (String str: strs) {

			if (str.compareTo(laststring) > 0) laststring = str;
		}

		return laststring;

	}
}