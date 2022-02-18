import java.util.Scanner;

/* ********************************************************
* Student Name: Noah Buchanan
* Class: CS 1024 Foundations of Programming II
* Assignment: Problem Set 3, Problem 2
* Date: February 7, 2020
* ********************************************************/

public class PS3Compressor {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string :");
		String y = scan.nextLine();
		String x = y + " ";
		
		String line = "";
		
		int count = 1;
		
		for(int i = 0; i < x.length(); i++) {
			
			count = 1;

			
			for(int k = i+1; k < x.length(); k++) {
				
				if(x.charAt(k) == x.charAt(i)) {
					count++;
				} else {
					line += count;
					line += x.charAt(i);
					k = x.length()-1;
					i--;
				}
				i++;
			}
		}
		
		System.out.println(line);

		scan.close();
		
	}

}
