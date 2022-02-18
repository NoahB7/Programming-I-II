import java.util.Scanner;

public class PS5Stats {

	public static void main(String[] args) {
		
		
		/* ********************************************************
		* Student Name: Noah Buchanan
		* Class: CS 1014 Foundations of Programming I
		* Assignment: Problem Set #5, Problem #1
		* Date: September 27, 2019
		* ********************************************************/

		
		/*
		 * Wasnt sure if you wanted us to use a String or Array for this since it says explicitly in the problem use a string
		 * but weve been covering arrays so I just used a String for it
		 */
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Pleaser enter a string of length 0-9: ");
		String input = keyboard.nextLine();

		int sum = 0;
		double count = 0;
		int min = input.charAt(0);;
		int max = input.charAt(0);
		double varianceNumer = 0;

//total for loop
		
		for (int i = 0; i < input.length(); i++) {

			sum += (input.charAt(i) - 48);
			count++;
		}
	
//average
		
		double mean = sum / count;
		
//max for loop
		
		for (int i = 0; i < input.length(); i++) {

			if (max < input.charAt(i)) {

				max = input.charAt(i);
			}
		}

//min for loop
		
		for (int i = 0; i < input.length(); i++) {

			if (min > input.charAt(i)) {

				min = input.charAt(i);
			}
		}

//variance for loop
		
		for (int i = 0; i < input.length(); i++) {

			varianceNumer += Math.pow(((input.charAt(i)-48) - mean), 2);
		}

		System.out.println("Total Value:           " + sum );
		System.out.println("Minimum Value:         " + (min - 48) );
		System.out.println("Maximum Value:         " + (max - 48) );
		System.out.printf("%s %.2f", "Average (Mean) Value: ", mean);
		System.out.printf("\n%s %.2f","Variance:             ", (varianceNumer/input.length()) );
		System.out.printf("\n%s %.2f", "Standard Deviation:   ", (Math.sqrt (varianceNumer/input.length())) );

		keyboard.close();
	}

}
