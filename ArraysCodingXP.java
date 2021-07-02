class ArraysCodingXP {



	public static int indexOf(int[] nums, int numToFind) {

		int index = 0;

		while (index < nums.length) {
			
			if (nums[index]  == numToFind) {

				return index;
			}

			index++;
		}

		return -1;

	}


	public static String[] doubleSize(String[] strs) {

		String[] returnArray = new String[strs.length * 2];

		for (int i = 0; i < strs.length ; i++ ) {

			returnArray[i] = strs[i];
			
		}
		
		return returnArray;
	}


	public static void insert(double[] nums, double numToInsert, int insertAtIndex) {

		if (insertAtIndex < nums.length) {

			
			//push the list right first to avoid error at end of list

			for (int i = insertAtIndex; i < nums.length - 1 ; i++ ) {  
				
				nums[i + 1] = nums[i];
	
			}

			nums[insertAtIndex] = numToInsert;
			
		}
	}

}
