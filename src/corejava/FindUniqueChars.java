package corejava;

import java.util.Scanner;

public class FindUniqueChars {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Provide any string to find unique characters in it \n");

		String city = scan.next();

		int cityLength = city.length();

		int counter = 0;
		for (int i = 0; i < cityLength; i++) {

			for (int j = 0; j < cityLength; j++) {

				if (Character.toLowerCase(city.charAt(i)) == Character.toLowerCase(city.charAt(j))) {
					counter++;
				}

				// System.out.println(Character.toLowerCase(city.charAt(j)) + "-" + counter);

			}

			if (counter == 1) {
				System.out.println("Unique character found: " + city.charAt(i));
			}

			counter = 0;

		}

	}

}
