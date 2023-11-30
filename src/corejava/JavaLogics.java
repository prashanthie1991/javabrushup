package corejava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaLogics {

	public static void main(String[] args) {
		// Logic1: sort an integer array
		int[] arr = { 3, 7, 4, 8, 2, 4, 1 };
		int temp = arr[0];

		for (int i = 0; i < (arr.length) - 1; i++) {

			for (int j = i; j < (arr.length) - 1; j++) {

				if (!(arr[i] < arr[j + 1])) {

					temp = arr[j + 1];
					arr[j + 1] = arr[i];
					arr[i] = temp;

				}

			}

		}

		for (int a : arr) {
			System.out.print(a + " ");
		}

		System.out.println();
		
		//Or
		int[] ar = { 3, 7, 4, 8, 2, 4, 1 };
		Arrays.stream(ar).boxed().sorted().collect(Collectors.toList()).forEach(s -> System.out.print(s + " "));
		
		

		// Logic2: Reverse the string
		String name = "Prashanthi";

		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}

	}

}
