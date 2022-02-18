import java.io.IOException;
import java.util.ArrayList;

/*********************************************************
Student Name: Noah Buchanan
Class: CS 1024 Foundations of Programming II
Assignment: Problem Set 6, Problem 1
Date: April 22, 2020
*********************************************************/

public class UAGameRuntime extends UAGame {
	
	public static void main(String[] args) throws IOException {
		
		
		ArrayList<UAGame> x = UAGame.getListOfGames("GameStuff");
		
		for(int i = 0 ; i < x.size(); i++) {
			System.out.printf("%s \t %2.2f", x.get(i).getWinner(), x.get(i).getWinnerPerformance());
			System.out.println();
		}
		
		
	}

}
