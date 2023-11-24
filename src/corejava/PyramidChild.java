package corejava;

import java.util.Scanner;

public class PyramidChild extends PyramidParent {

	public static void main(String[] args) {
		int rowsCount = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter rowscount for a pyramid: ");
		boolean numFlag = false;

		do {
			if (scanner.hasNextInt()) {
				rowsCount = scanner.nextInt();
				if (rowsCount > 0 && rowsCount <= 100) {
					System.out.println("Your number pyramid looks as below for given number: " + rowsCount);
					PyramidParent.display(rowsCount);
				} else {
					System.out.println("Please enter a valid integer ranging from 1-100");
					scanner.nextLine();
					numFlag = true;
				}
			} else {
				System.out.println("Please provide a valid number!\n");
				scanner.nextLine();
				numFlag = true;
			}

		} while (numFlag);

		scanner.close();
	}

}
