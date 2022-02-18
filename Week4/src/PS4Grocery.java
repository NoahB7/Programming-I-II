import java.util.Scanner;

public class PS4Grocery {

	public static void main(String[] args) {
		
		
		/* ********************************************************
		* Student Name: Noah Buchanan
		* Class: CS 1014 Foundations of Programming I
		* Assignment: Problem Set #4, Problem 3
		* Date: September 21, 2019
		* ********************************************************/
		
		
		

		double A123 = 100.50;
		double A55 = 20.30;
		double B750 = 40.20;
		double total1 = 0;
		double total2 = 0;
		

		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter an item: ");
		String itemNum = scan1.nextLine();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter a quantity: ");
		int itemQuant = scan2.nextInt();
		
		
		if (itemNum.equals("A123")) {

			total1 = A123 * itemQuant;
		} else if (itemNum.equals("A55")) {

			total1 = A55 * itemQuant;
		} else if (itemNum.equals("B750")) {

			total1 = B750 * itemQuant;
		} else {
			
			System.out.println("ERROR");
		}
	
		

		while (itemNum.equals("A123")||itemNum.equals("A55")||itemNum.equals("B750")) {

			System.out.println("Enter an item: ");
			itemNum = scan1.nextLine();
			
			
			if(itemNum.equals("A123")||itemNum.equals("A55")||itemNum.equals("B750")) {
				
				System.out.println("Enter a quantity: ");
				itemQuant = scan2.nextInt();
				
				
				if (itemNum.equals("A123")) {

					total2 = total2 + (A123 * itemQuant);
				} else if (itemNum.equals("A55")) {

					total2 = total2 + (A55 * itemQuant);
				} else if (itemNum.equals("B750")) {

					total2 = total2 + (B750 * itemQuant);
				} else {
					
					System.out.println("ERROR");
				}

				
			}
						
		}
		
		
		double totalEnd = total1 + total2;

		System.out.println("Total Price: " + totalEnd);

		scan1.close();
		scan2.close();
	}

}
