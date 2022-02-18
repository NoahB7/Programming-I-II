import java.util.Scanner;

public class PS6Sort {

	public static void main(String[] args) {

		
		/* ********************************************************
		* Student Name: Noah Buchanan
		* Class: CS 1014 Foundations of Programming I
		* Assignment: Problem Set 6, Problem 4
		* Date: October 4, 2019
		* ********************************************************/

		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many values would you like to enter? ");
		int userInput = keyboard.nextInt();
		
		int[] a = new int[userInput];
		
		for(int i = 0; i < userInput; i++) {
			
			System.out.print("Enter a value: ");
			a[i] = keyboard.nextInt();
		}

		boolean swapped = false;

		do {

			swapped = false;

			for (int i = 1; i < a.length; i++) {

				if (a[i - 1] < a[i]) {

					int holder = a[i - 1];

					a[i - 1] = a[i];
					a[i] = holder;

					swapped = true;
				}
			}
		}

		while (swapped);

		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");

		}
		
		keyboard.close();

	}

}
