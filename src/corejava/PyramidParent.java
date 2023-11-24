package corejava;

public class PyramidParent {

	protected static void display(int rowCount) {
		/*
		 * Output: 
		 * 1
		 * 1 2 
		 * 1 2 3 
		 * 1 2 3 4
		 */

		for (int i = 1; i <= rowCount; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j + " ");

			}
			System.out.println("");

		}

	}
}
