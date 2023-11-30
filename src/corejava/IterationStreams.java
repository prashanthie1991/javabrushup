package corejava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class IterationStreams {

	public static void main(String[] args) {
		// Unsolved!
		// Problem Statement: Take number of person details from terminal and traverse
		// through the ages and provide age range smallest 10 - 85 largest

		// Create map to take person name and age as key value pairs
		Map<String, Integer> persons = new HashMap<String, Integer>();

		// Take inputs of person details
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of people you want to log: ");
		int peopleCount = scan.nextInt();

		for (int i = 1; i <= peopleCount; i++) {
			System.out.println("Enter the name of person" + i + ": ");
			String personName = scan.next();

			System.out.println("Enter the age of person" + i + ": ");
			int personAge = scan.nextInt();

			persons.put(personName, personAge);

		}

		int[] ages = new int[peopleCount];
		// Map Traversing with Set & Iterator
		Set set = persons.entrySet();
		Iterator it = set.iterator();

		while (it.hasNext()) {
			Map.Entry personDetails = (Map.Entry) it.next();
			System.out.println(personDetails.getKey() + " - " + personDetails.getValue());
			int age = (int) personDetails.getValue();
			for (int i = 0; i < peopleCount; i++) {
				ages[i] = age;
			}
		}

		// Average aged people
		double avg = persons.entrySet().stream().mapToDouble(e -> e.getValue()).average().getAsDouble();
		System.out.println("Average age would be: " + avg);
	}

}
