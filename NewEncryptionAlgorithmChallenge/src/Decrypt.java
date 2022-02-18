import java.util.Scanner;

public class Decrypt {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter encrypted message: ");
		String input1 = scan.nextLine();
		String input = input1.toLowerCase();
		
		boolean switch1 = true;
		boolean switch2 = true;
		int countSwitch2 = 0;
		int hold = 0;
		
		char[] x = new char[input.length()];
		
		for(int i = 0; i < x.length; i++) {
			
			x[i] = input.charAt(i);
		}
		
		for(int i = 0; i < x.length; i++) {
			
			if(i%5==0) {
				
				if(x[i] == ' ') {
				
				} else if(switch1 && switch2) {
					x[i] -= 2;
					if(x[i] < 97) {
						hold = x[i];
						x[i] = (char) (123 - (97-hold));
					}
				} else if(!switch1 && !switch2) {
					x[i] += 2;
					if(x[i] > 122) {
						hold = x[i];
						x[i] = (char) (96 + (hold-122));
					}
					
				} else if(!switch2) {
					x[i] -= 6;
					if(x[i] < 97) {
						hold = x[i];
						x[i] = (char) (123 - (97-hold));
					}
				} else if(!switch1) {
					x[i] -= 7;
					if(x[i] < 97) {
						hold = x[i];
						x[i] = (char) (123 - (97-hold));
					}
				}
				System.out.print(x[i]);
				
			} else if(i%5==1) {
				
				if(x[i] == ' ') {
					
				} else if(switch1 && switch2) {
					x[i] += 3;
					if(x[i] > 122) {
						hold = x[i];
						x[i] = (char) (96 + (hold-122));
					}
					
				} else if(!switch1 && !switch2) {
					x[i] += 3;
					if(x[i] > 122) {
						hold = x[i];
						x[i] = (char) (96 + (hold-122));
					}
					
				} else if(!switch2) {
					x[i] -= 3;
					if(x[i] < 97) {
						hold = x[i];
						x[i] = (char) (123 - (97-hold));
					}
				} else if(!switch1) {
					x[i] -= 5;
					if(x[i] < 97) {
						hold = x[i];
						x[i] = (char) (123 - (97-hold));
					}
				}
				System.out.print(x[i]);
				
			} else if(i%5==2) {
				
				if(x[i] == ' ') {
					
				} else if(switch1 && switch2) {
					x[i] -= 1;
					if(x[i] < 97) {
						hold = x[i];
						x[i] = (char) (123 - (97-hold));
					}
				} else if(!switch1 && !switch2) {
					x[i] -= 7;
					if(x[i] < 97) {
						hold = x[i];
						x[i] = (char) (123 - (97-hold));
					}
				} else if(!switch2) {
					x[i] -= 1;
					if(x[i] < 97) {
						hold = x[i];
						x[i] = (char) (123 - (97-hold));
					}
				} else if(!switch1) {
					x[i] += 1;
					if(x[i] > 122) {
						hold = x[i];
						x[i] = (char) (96 + (hold-122));
					}
					
				}
				System.out.print(x[i]);
				
			} else if(i%5==3) {
				
				if(x[i] == ' ') {
					
				} else if(switch1 && switch2) {
					x[i] -= 4;
					if(x[i] < 97) {
						hold = x[i];
						x[i] = (char) (123 - (97-hold));
					}
				} else if(!switch1 && !switch2) {
					x[i] -= 2;
					if(x[i] < 97) {
						hold = x[i];
						x[i] = (char) (123 - (97-hold));
					}
				} else if(!switch2) {
					x[i] += 3;
					if(x[i] > 122) {
						hold = x[i];
						x[i] = (char) (96 + (hold-122));
					}	
				} else if(!switch1) {
					x[i] -= 4;
					if(x[i] < 97) {
						hold = x[i];
						x[i] = (char) (123 - (97-hold));
					}
				}
				System.out.print(x[i]);
				
			} else if(i%5==4) {
				
				if(x[i] == ' ') {
					
				} else if(switch1 && switch2) {
					x[i] += 1;
					if(x[i] > 122) {
						hold = x[i];
						x[i] = (char) (96 + (hold-122));
					}
					
				} else if(!switch1 && !switch2) {
					x[i] -= 9;
					if(x[i] < 97) {
						hold = x[i];
						x[i] = (char) (123 - (97-hold));
					}
				} else if(!switch2) {
					x[i] += 1;
					if(x[i] > 122) {
						hold = x[i];
						x[i] = (char) (96 + (hold-122));
					}
					
				} else if(!switch1) {
					x[i] -= 2;
					if(x[i] < 97) {
						hold = x[i];
						x[i] = (char) (123 - (97-hold));
					}
				}
				System.out.print(x[i]);
				

				switch2 = true;
				countSwitch2++;
				
				
				if(switch1 == true) {
					switch1 = false;
				} else {
					switch1 = true;
				}
				
			}
			

			if(countSwitch2 >= 2) {
				switch2 = false;
				countSwitch2 = -1;
			}
		}
		
		scan.close();
	}

}
