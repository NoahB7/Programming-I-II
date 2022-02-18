
public class PS8Perimeter {
	
	public static void main(String[] args) {
		
		/* ********************************************************
		* Student Name: Noah Buchanan
		* Class: CS 1014 Foundations of Programming I
		* Assignment: Problem Set 8, Problem 2
		* Date: November 24, 2019
		* ********************************************************/
		
		int[][] array = {{1,2,3,4}, 
						 {2,3,4,5}, 
						 {3,4,5,6}, 
						 {4,5,6,7}};
		
		System.out.println(getSum(array));
		
	}
	
	public static int getSum(int[][] x) {
		
		int sum = 0;
		
		for(int i = 0; i < x[0].length; i++) {
			
			for(int j = 0; j < x.length; j++) {
				
				if(i % 3 == 0) {
					
					sum += x[i][j];
				} else if(j % 3 == 0){
					
					sum += x[i][j];
				}
			}
		}
		
		
		return sum;
	}

}
