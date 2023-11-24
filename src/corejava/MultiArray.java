package corejava;

public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Find min and max numbers from array matrix
		int[][] mArray = { { 3, 4, 5 }, { 12, 72, 5 } };
		int minNum = mArray[0][0];
		int maxNum = mArray[0][0];

		for (int[] ar : mArray) {
			for (int num : ar) {
				if (minNum > num) {
					minNum = num;
				}
				if (maxNum < num) {
					maxNum = num;
				}

			}

		}
		System.out.println("Minimum Number in mArray Array is: " + minNum);
		System.out.println("Maximum Number in mArray Array is: " + maxNum);

		// Find the minimum number in the rows and find max number from that min element
		// column
		int[][] ciscoArray = { { 3, 4, 5 }, { 11, 71, 2 }, { 9, 1, 5 } };
		int min = ciscoArray[0][0];
		int minNumRowPos = 0;
		int minNumColPos = 0;

		for (int row = 0; row < ciscoArray.length; row++) {
			for (int column = 0; column < row; column++) {
				if (min > ciscoArray[row][column]) {

					min = ciscoArray[row][column];
					minNumRowPos = row;
					minNumColPos = column;

				}

			}
		}

		System.out.println("Minimum Number in ciscoArray Array is: " + min + " with row and column index positions: "
				+ minNumRowPos + "," + minNumColPos);
		
		int maxColNum = min;
		for(int rowCounter = 0; rowCounter< ciscoArray.length; rowCounter++) {
			if(ciscoArray[rowCounter][minNumColPos]>maxColNum) {
				maxColNum = ciscoArray[rowCounter][minNumColPos];
			}
		}
		
		System.out.println("Maximum Number in minNumber column of ciscoArray Array is: " + maxColNum);

	}
}
