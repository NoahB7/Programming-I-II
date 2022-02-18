import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PS7ValidScores {

	public static void main(String[] args) throws IOException {
		
		/* ********************************************************
		* Student Name: Noah Buchanan
		* Class: CS 1014 Foundations of Programming I
		* Assignment: Problem Set 7, Problem 1
		* Date: November, 4, 2019
		* ********************************************************/

		BufferedReader br = new BufferedReader(new FileReader("scores.txt"));

		String line = "";
		String[] x = null;
		boolean invalid = false;
		int invalidCount = 0;
		int totalValid = 0;
		int min = 100;
		int max = 0;
		String invalidHolder = "";

		while ((line = br.readLine()) != null) {

			x = line.split(",");

			for (int i = 0; i < x.length; i++) {

				invalid = false;
				for(int j = 0; j < x[i].length(); j++) {
					
					if(x[i].charAt(j) >= 'a' && x[i].charAt(j) <= 'z') {
						
						invalid = true;
					}
				}
				if(invalid) {
					invalidHolder += x[i];
					invalidHolder += ",";
					invalidCount++;
				} else {
					if(min > Integer.parseInt(x[i])) {
						
						min = Integer.parseInt(x[i]);
					}
					if(max < Integer.parseInt(x[i])) {
						
						max = Integer.parseInt(x[i]);
					}
					totalValid += Double.parseDouble(x[i]);
				}
				
				
			}

		}
		
		System.out.println("Total number of input values: " + x.length);
		System.out.println("Number of Valid Scores:       " + (x.length-invalidCount));
		System.out.println("Number of Invalid Scores:     " + invalidCount);
		System.out.println("Average of Valid Scores:      " + (totalValid/(x.length-invalidCount)));
		System.out.println("Minimum Score:                " + min);
		System.out.println("Maximum Score:                " + max);
		System.out.println("Invalid Scores:               " + invalidHolder);
		

		br.close();
	}

}
