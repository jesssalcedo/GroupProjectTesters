package GroupProject;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array of integer values. Print the sum of all numbers.
		 */
		int[][] num = { { 2, 50, 35 }, { 360, 85, 400, 44 }, { 56, 12, 1005 } };
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				sum += num[i][j];
			}
		}
		System.out.println("The sum of all numbers are " + sum);
		
		

	}

}
