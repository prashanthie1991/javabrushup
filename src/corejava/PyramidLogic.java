package corejava;

public class PyramidLogic {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		/*
		 * Output:
		 * 1 2 3 4
		 * 5 6 7
		 * 8 9
		 * 10
		 */
		
		int counter = 1;
		for(int i=5;i>1;i--) {
			
			for(int j=1;j<i;j++) {
				
				System.out.print(counter + " ");
				counter++;
				
			}
			System.out.println("");
		}
		
		System.out.println("\n**********\n");
		
		/*
		 * Output:
		 * 1
		 * 2 3
		 * 4 5 6
		 * 7 8 9 10
		 */
		
		int k=1;
		for(int i=1;i<5;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(k + " ");
				k++;
				
			}
			System.out.println("");
		}
		
		System.out.println("\n**********\n");
		
		/*
		 * Output:
		 * 1
		 * 1 2
		 * 1 2 3
		 * 1 2 3 4
		 */
		
		for(int i=1;i<5;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(j + " ");
				
			}
			System.out.println("");
		}
		
		System.out.println("\n**********\n");
		
		/*
		 * Output:
		 * 3
		 * 6 9
		 * 12 15 18
		 */
		
		int tempNum = 1;
		for(int i=1;i<4;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(tempNum*3 + " ");
				tempNum++;
				
			}
			System.out.println("");
		}

	}

}
