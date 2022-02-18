import java.util.Scanner;

public class PS6Stats {

	public static void main(String[] args) {
		
		
		/* ********************************************************
		* Student Name: Noah Buchanan
		* Class: CS 1014 Foundations of Programming I
		* Assignment: Problem Set 6, Problem 1
		* Date: October 4, 2019
		* ********************************************************/

		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many values would you like to enter? ");
		int length = keyboard.nextInt();

		int[] array = new int[length];

		for (int i = 0; i < length; i++) {

			System.out.println("Enter a value: ");
			array[i] = keyboard.nextInt();

		}

		int sum = 0;
		int min = array[0];
		int max = array[0];
		double varianceNumer = 0;

//total
		for (int i = 0; i < length; i++) {

			sum += array[i];
		}

//average
		int average = sum / length;

//min
		for (int i = 0; i < length; i++) {

			if (min > array[i]) {

				min = array[i];
			}
		}

//max
		for (int i = 0; i < length; i++) {

			if (max < array[i]) {

				max = array[i];
			}
		}

//variance
		for (int i = 0; i < length; i++) {

			varianceNumer += Math.pow(array[i] - average, 2);
		}
		
//results	
			System.out.println("*** Results ***");
			System.out.println("Minimum Value:       " + min);
			System.out.println("Maximum Value:       " + max);
			System.out.println("Average:             " + average);
			System.out.printf("%s %.2f\n", "Variance:           ", (varianceNumer/length));
			System.out.printf("%s %.2f\n", "Standard Deviation: ", (Math.sqrt(varianceNumer/length)));
			System.out.print("Values Entered:      ");
			for(int i = 0; i < length; i++) {
				
				System.out.print(array[i]);
				if(i < (length)-1) {
					System.out.print(", ");
				}
			}
			
			keyboard.close();

	}

}
