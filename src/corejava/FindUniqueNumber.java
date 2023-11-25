package corejava;

import java.util.ArrayList;

public class FindUniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 1, 4, 5, 3, 4, 1, 6, 2, 2, 5, 3, 3 };

		ArrayList<Integer> uniqueNumList = new ArrayList<Integer>();

		for (int i = 0; i < numbers.length; i++) {
			int counter = 0;
			if (!uniqueNumList.contains(numbers[i])) {
				uniqueNumList.add(numbers[i]);
				for (int j = i + 1; j < numbers.length; j++) {
					if (numbers[i] == numbers[j]) {
						counter++;
					}

				}
				if (counter == 0) {
					System.out.println("Unique number found: " + numbers[i]);
				}

			}
		}

		System.out.println("Uniquely identified numbers from array are: " + uniqueNumList);

	}

}
