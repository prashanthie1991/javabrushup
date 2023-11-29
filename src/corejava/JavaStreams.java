package corejava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreams {

	public static void main(String[] args) {
		// Print Unique numbers and Sort the array
		
		List<Integer> numbers = Arrays.asList(1,2, 5, 6, 8, 8, 10, 4, 5, 11,1);
		
		//Find unique numbers
		System.out.println("Unique numbers in the array: ");
		numbers.stream().distinct().forEach(number -> System.out.print(number + " "));
		System.out.println();
		//Sort the array
		List<Integer> sortedList = numbers.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("Sorted array and 3rd index number is: "+sortedList.get(2));

	}

}
