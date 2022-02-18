import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*********************************************************
Student Name: Noah Buchanan
Class: CS 1024 Foundations of Programming II
Assignment: Problem Set 6, Problem 1
Date: April 22, 2020
*********************************************************/


public class UAGame {
	
	private String player1Character;
	private String player2Character;
	private int totalRounds;
	private int p1Wins;
	private int p2Wins;
	
	public UAGame() {
		
		System.out.println("The default constructor is running..");
	}
	
	public UAGame(String x) {
		
		String[] y = x.split(",");
		this.player1Character = y[0];
		this.player2Character = y[1];
		this.totalRounds = Integer.parseInt(y[2]);
		this.p1Wins = Integer.parseInt(y[3]);
		this.p2Wins = Integer.parseInt(y[4]);
	}
	
	public UAGame(String x, String y) {
		
		this.player1Character = x;
		this.player2Character = y;
		this.totalRounds = 3;
	}
	
	public String getWinner() {
		
		if(this.p1Wins > this.p2Wins) {
			return player1Character;
		} else if(this.p2Wins > this.p1Wins) {
			return player2Character;
		} else {
			return "Tie";
		}
	}
	
	public double getWinnerPerformance() {
		
		double x = 0;
		if(this.p1Wins > this.p2Wins) {
			x = (double)p1Wins/totalRounds;
			return x;
		} else if(this.p2Wins > this.p1Wins) {
			x = (double)p2Wins/totalRounds;
			return x;
		} else {
			x = (double)p2Wins/totalRounds;
			return x;
		}
	}
	
	public static ArrayList<UAGame> getListOfGames(String filename) throws IOException{
		
		BufferedReader br = new BufferedReader(new FileReader(filename));
		
		String line = "";
		
		ArrayList<UAGame> t = new ArrayList<>();
		
		
		while((line = br.readLine())!=null) {
			
			UAGame y = new UAGame();
			String[] x = line.split(",");
			
			y.setPlayer1Character(x[0]);
			y.setPlayer2Character(x[1]);
			y.setTotalRounds(Integer.parseInt(x[2]));
			y.setP1Wins(Integer.parseInt(x[3]));
			y.setP2Wins(Integer.parseInt(x[4]));
			t.add(y);
		}
		
		return t;
		
		
	}
	
	public String getPlayer1Character() {
		return player1Character;
	}
	public void setPlayer1Character(String player1Character) {
		this.player1Character = player1Character;
	}
	public String getPlayer2Character() {
		return player2Character;
	}
	public void setPlayer2Character(String player2Character) {
		this.player2Character = player2Character;
	}
	public int getTotalRounds() {
		return totalRounds;
	}
	public void setTotalRounds(int totalRounds) {
		this.totalRounds = totalRounds;
	}
	public int getP1Wins() {
		return p1Wins;
	}
	public void setP1Wins(int p1Wins) {
		this.p1Wins = p1Wins;
	}
	public int getP2Wins() {
		return p2Wins;
	}
	public void setP2Wins(int p2Wins) {
		this.p2Wins = p2Wins;
	}
	
	

}
