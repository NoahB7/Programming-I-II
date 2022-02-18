import java.util.Scanner;

public class PS5Combinations {

	public static void main(String[] args) {
		
		
		/* ********************************************************
		* Student Name: Noah Buchanan
		* Class: CS 1014 Foundations of Programming I
		* Assignment: Problem Set #5, Problem #3
		* Date: September 27, 2019
		* ********************************************************/

		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter a value for n: ");
		int n = scan1.nextInt();

		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter a value of k: ");
		int k = scan2.nextInt();

		int para = n - k;


//nfactorial
		if (n > 1) {

			for (int i = n - 1; i > 0; i--) {

				n *= i;
			}

		} else {

			n = 1;
		}
		
//kfactorial		
		if (k > 1) {

			for (int i = k - 1; i > 0; i--) {

				k *= i;

			}

		} else {

			k = 1;
		}
		
//parentheses		
		if (para > 1) {

			for (int i = para - 1; i > 0; i--) {

				para *= i;

			}

		} else {

			para = 1;
		}

		double combination = n / (k * para);

		System.out.printf("%s %.2f", "The result is: ", combination);

		
		scan1.close();
		scan2.close();
	}

}
