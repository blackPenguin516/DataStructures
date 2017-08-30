import java.util.Scanner;
import java.util.Random;

public class matrix {

	public static void main(String[] args) {
		
		int i, j, k;
		int sum = 0;
		String response;
		
		Scanner input = new Scanner(System.in);
		Random ran = new Random();
		
		
		System.out.println("This program will multiply and add two square matrices.");
		
		do {
			
		
		System.out.print("Enter dimension to build two square matrices (minimum of 25): ");
		int first = input.nextInt();
		
		while (first < 25) {
			System.out.print("Error: Please enter a dimension of 25 or greater: ");
			first = input.nextInt();
		}
		
		int sec = first;
		int third = sec;
		int four = third;
		
		
		int mat1[][] = new int[first][first];
		int mat2[][] = new int[sec][sec];
		int add[][] = new int[third][third];
		int mult[][] = new int[four][four];

		//Randomly generating first matrix
		for(i = 0; i < first; i++){
			for(j = 0; j < first; j++){
				mat1[i][j] = ran.nextInt(31);
			}
		}
		
		//Randomly generating second matrix
		for(i = 0; i < sec; i++){
			for(j = 0; j < sec; j++){
				mat2[i][j] = ran.nextInt(31);
			}
		}
		
		//Displays first matrix
		System.out.println("First Generated Matrix: ");
		for (i = 0; i < first; i++){
			for (j = 0; j < first; j++){
				System.out.print(mat1[i][j] + "\t");
			}
			System.out.println();
		}
		
		//Displays second matrix
		System.out.println("Second Generated Matrix: ");
		for (i = 0; i < sec; i++){
			for (j = 0; j < sec; j++){
				System.out.print(mat2[i][j] + "\t");
			}
			System.out.println();
		}
		
		//Multiplying two Matrices
		long start = System.currentTimeMillis();
		System.out.println("Multiplying the Two Matrices... ");
		for(i = 0; i < first; i++){
			for(j = 0; j < sec; j++){
				for(k = 0; k < sec; k++){
					sum = sum + mat1[i][k] * mat2[k][j];
				}
				mult[i][j] = sum;
				sum = 0;
			}
		}
		long end = System.currentTimeMillis();
		long multTime = end - start;
		
		//Displays Multiplied Matrix
		System.out.println("Multiplication Successfully Performed...");
		System.out.println("The Multiplied Matrix is: ");
		for(i = 0; i < four; i++){
			for(j = 0; j < four; j++){
				System.out.print(mult[i][j] + "\t");
			}
			System.out.println();
		}
		
		//Timer Display
		System.out.println("Execution Time: " + multTime + " milliseconds");
		
		
		//Adding two Matrices
		long start1 = System.currentTimeMillis();
		System.out.println("Adding both Matrices to form the Third Matrix... ");
		for(i = 0; i < third; i++){
			for(j = 0; j < third; j++){
				add[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
		long end1 = System.currentTimeMillis();
		long addTime = end1 - start1;
		
		//Displays the Sum of the Matrices  
		System.out.println("Addition Successfully Performed...");
		System.out.println("The Added Matrix is: ");
		for(i = 0; i < third; i++){
			for (j = 0; j < third; j++){
				System.out.print(add[i][j] + "\t");
			}
			System.out.println();
		}
		
		//Timer Display
		System.out.println("Execution Time: " + addTime + " milliseconds");
		
		System.out.print("Would you like to try again? (Y or N): ");
		response = input.next();
		
	} while (response.equalsIgnoreCase("y"));
		System.out.println("Goodbye!!");
	
}
	
}
