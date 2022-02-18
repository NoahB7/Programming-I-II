import java.util.Scanner;

public class tictactoe {

	public static void main(String[] args) {

		char[][] board = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };

		Scanner ask = new Scanner(System.in);
		System.out.println("1 for single player 2 for two players");
		int answer = ask.nextInt();

		if (answer == 1) {

			singlePlayer(board);
		} else if (answer == 2) {

			twoPlayer(board);
		} else {

			System.out.println("Invald input");
		}

		ask.close();

	}

	public static void printBoard(char[][] x) {

		for (int i = 0; i < x.length; i++) {

			for (int k = 0; k < x.length; k++) {

				if (k == 2) {
					System.out.print(x[i][k]);
				} else {
					System.out.print(x[i][k] + " | ");
				}
			}
			if (i == 2) {

				System.out.println();
			} else {
				System.out.println();
				System.out.print("_________");
				System.out.println();
			}
		}
	}

	public static void twoPlayer(char[][] board) {

		Scanner scan = new Scanner(System.in);

		int player = 1;
		printBoard(board);
		int count = 0;
		while (count < 9) {
			count++;
// player 1 --->
			System.out.println();
			System.out.println("Player 1 enter coordinates");
			String coordinates = scan.nextLine();
			System.out.println();

			player = 1;
			int x = Integer.parseInt(coordinates.charAt(0) + "");
			int y = Integer.parseInt(coordinates.charAt(1) + "");
			addBoard(board, y, x, player);
			printBoard(board);
			if (checkWin(board, player)) {
				System.out.println();
				System.out.println("Player 1 Wins!");
				break;
			} else if(checkDraw(board)) {
				System.out.println();
				System.out.println("Draw!");
				break;
			}
// player 2 --->
			System.out.println();
			System.out.println("Player 2 enter coordinates");
			coordinates = scan.nextLine();
			System.out.println();

			player = 2;
			x = Integer.parseInt(coordinates.charAt(0) + "");
			y = Integer.parseInt(coordinates.charAt(1) + "");
			addBoard(board, y, x, player);
			printBoard(board);
			if (checkWin(board, player)) {
				System.out.println();
				System.out.println("Player 2 Wins!");
				break;
			} else if(checkDraw(board)) {
				System.out.println();
				System.out.println("Draw!");
				break;
			}
		}

		scan.close();
	}

	public static void singlePlayer(char[][] board) {

		Scanner scan = new Scanner(System.in);

		int count = 0;
		while (count < 9) {
			count++;
			// AI portion
			robot(board);
			System.out.println("AI move: ");
			System.out.println();
			printBoard(board);
			System.out.println();
			if (checkWin(board, 1)) {
				System.out.println();
				System.out.println("AI wins!");
				break;
			} else if (checkDraw(board)) {
				System.out.println();
				System.out.println("Draw!");
				break;
			}
			// Player Portion
			System.out.println();
			System.out.println("Make your move(RowColoumn respectively): ");
			String answer = scan.nextLine();
			System.out.println();
			int y = Integer.parseInt(answer.charAt(0) + "");
			int x = Integer.parseInt(answer.charAt(1) + "");
			addBoard(board, x-1, y-1, 2);
			System.out.println();
			printBoard(board);
			if (checkWin(board, 2)) {
				System.out.println();
				System.out.println("You win!");
				break;
			} else if (checkDraw(board)) {
				System.out.println();
				System.out.println("Draw!");
				break;
			}

		}

		scan.close();
	}

	public static int[] findCoord(char[][] board) {

		int xcount = 0;
		int ycount = 0;
		int xcoord = 0;
		int ycoord = 0;
		boolean x = false;
		boolean y = false;
		int[] coordinates = new int[2];

		for (int i = 0; i < board.length; i++) {

			for (int j = 0; j < board.length; j++) {

				ycount = 0;
				xcount = 0;
				if (board[i][j] == 'o') {

					for (int k = 0; k < board.length; k++) {

						if (board[i][k] == 'o') {

							xcount++;
						}
						if (board[k][j] == 'o') {

							ycount++;
						}

						if (xcount == 2) {

							xcoord = i;
							x = true;
						} else if (ycount == 2) {

							ycoord = j;
							y = true;
						}
					}
				}
			}
		}

		if (x) {

			for (int i = 0; i < board.length; i++) {
				if (board[xcoord][i] != 'o') {
					ycoord = i;
				}
			}
		} else if (y) {

			for (int i = 0; i < board.length; i++) {
				if (board[i][ycoord] != 'o') {
					xcoord = i;
				}
			}
		}

		coordinates[0] = ycoord;
		coordinates[1] = xcoord;

		return coordinates;
	}

	public static char[][] addBoard(char[][] board, int x, int y, int player) {

		if (board[x][y] == ' ' && player == 1) {

			board[x][y] = 'x';
		}
		if (board[x][y] == ' ' && player == 2) {

			board[x][y] = 'o';
		}

		return board;
	}

	public static boolean checkWin(char[][] board, int player) {

		boolean win = false;
		if (board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][0] != ' ') {

			win = true;
		} else if (board[1][0] == board[1][1] && board[1][2] == board[1][1] && board[1][0] != ' ') {

			win = true;
		} else if (board[2][0] == board[2][1] && board[2][2] == board[2][1] && board[2][0] != ' ') {

			win = true;
		} else if (board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[0][0] != ' ') {

			win = true;
		} else if (board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[0][1] != ' ') {

			win = true;
		} else if (board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[0][2] != ' ') {

			win = true;
		} else if (board[0][0] == board[1][1] && board[2][2] == board[1][1] && board[0][0] != ' ') {

			win = true;
		} else if (board[2][0] == board[1][1] && board[0][2] == board[1][1] && board[2][0] != ' ') {

			win = true;
		}
		return win;

	}

	public static char[][] robot(char[][] board) {

		boolean middle = true;

		if (board[1][1] != ' ') {
			middle = false;
		}

		int[] coordinates = new int[2];
		if (checkAhead(board, 1)) {// AI win

			coordinates = findCoord(board, 1);
			System.out.println(coordinates[0] + " " + coordinates[1]);
			addBoard(board, coordinates[0], coordinates[1], 1);

		} else if (checkAhead(board, 2)) {// Player win(block)

			coordinates = findCoord(board, 2);
			addBoard(board, coordinates[0], coordinates[1], 1);

		} else if (board[1][0] == 'o' && board[0][1] == 'o' && middle
				|| board[1][0] == 'o' && board[2][1] == 'o' && middle
				|| board[2][1] == 'o' && board[1][2] == 'o' && middle
				|| board[1][2] == 'o' && board[0][1] == 'o' && middle) {

			addBoard(board, 1, 1, 1);

		} else if (board[0][0] == ' ' || board[2][0] == ' ' || board[0][2] == ' ' || board[2][2] == ' ') {// corners not
																											// all
																											// filled

			if (board[0][0] == ' ') {
				addBoard(board, 0, 0, 1);
			} else if (board[0][2] == ' ') {
				addBoard(board, 0, 2, 1);
			} else if (board[2][0] == ' ') {
				addBoard(board, 2, 0, 1);
			} else if (board[2][2] == ' ') {
				addBoard(board, 2, 2, 1);
			}

		} else {
			System.out.println("unkown what to do next?");
		}

		return board;

	}

	public static boolean checkAhead(char[][] board, int player) {

		int xcount = 0;
		int ycount = 0;
		char var = ' ';
		char var2 = ' ';
		boolean winCondition = false;

		if (player == 1) {
			var = 'x';
			var2 = 'o';
		} else if (player == 2) {
			var = 'o';
			var2 = 'x';
		}

		for (int i = 0; i < board.length; i++) {

			for (int j = 0; j < board.length; j++) {

				ycount = 0;
				xcount = 0;

				if (board[i][j] == var) {

					for (int k = board.length - 1; k >= 0; k--) {

						if (board[i][k] == var) {

							xcount++;
						} else if (board[i][k] == var2) {

							xcount = -2;
						}
						if (board[k][j] == var) {

							ycount++;
						} else if (board[k][j] == var2) {
							ycount = -2;

						}

					}

				}
				if (xcount == 2) {

					winCondition = true;

				} else if (ycount == 2) {
					winCondition = true;

				}
			}
		}

		return winCondition;
	}
	
	public static boolean checkAheadBot(char[][] board) {

		int xcount = 0;
		int ycount = 0;
		boolean winCondition = false;

		for (int i = 0; i < board.length; i++) {

			for (int j = 0; j < board.length; j++) {

				ycount = 0;
				xcount = 0;
				if (board[i][j] == 'x') {

					for (int k = 0; k < board.length; k++) {

						if (board[i][k] == 'x') {

							xcount++;
						}
						if (board[k][j] == 'x') {

							ycount++;
						}

						if (xcount == 2) {

							winCondition = true;
						} else if (ycount == 2) {
							winCondition = true;
						}
					}
				}
			}
		}

		return winCondition;
	}
	
	
	public static int[] findCoord(char[][] board, int player) {

		int xCount = 0;
		int yCount = 0;
		int xCoord = 0;
		int yCoord = 0;
		boolean xFound = false;
		boolean yFound = false;
		int[] coordinates = new int[2];
		char var = ' ';
		char var2 = ' ';
		if (player == 1) {
			var = 'x';
			var2 = 'o';
		} else if (player == 2) {
			var = 'o';
			var2 = 'x';
		}

		for (int i = 0; i < board.length; i++) {

			for (int j = 0; j < board.length; j++) {

				yCount = 0;
				xCount = 0;
				if (board[i][j] == var) {

					for (int k = 0; k < board.length; k++) {

						if (board[i][k] == var) {

							xCount++;
						} else if (board[i][k] == var2) {

							xCount = -2;
						}
						if (board[k][j] == var) {

							yCount++;
						} else if (board[k][j] == var2) {

							yCount = -2;
						}

					}
					if (xCount == 2) {

						xCoord = i;
						xFound = true;
					} else if (yCount == 2) {

						yCoord = j;
						yFound = true;
					}
				}
			}
		}

		if (xFound) {

			for (int i = 0; i < board.length; i++) {
				if (board[xCoord][i] != var) {
					yCoord = i;
				}
			}
		} else if (yFound) {

			for (int i = 0; i < board.length; i++) {
				if (board[i][yCoord] != var) {
					xCoord = i;
				}
			}
		}

		coordinates[0] = xCoord;
		coordinates[1] = yCoord;

		return coordinates;
	}

	public static char[][] robotMoves(char[][] board) {

		if (board[0][0] == board[0][2] && board[0][1] != 'o') {

			board[0][1] = 'x';
		} else if (board[0][0] == board[2][0] && board[1][0] != 'o') {

			board[1][0] = 'x';
		} else if (board[2][2] == board[2][0] && board[2][1] != 'o') {

			board[2][1] = 'x';
		} else if (board[0][2] == board[2][2] && board[1][2] != 'o') {

			board[1][2] = 'x';
		} else if ((board[0][0] == board[2][2] && board[1][1] != 'o')
				|| (board[0][2] == board[2][0] && board[1][1] != 'o')) {

			board[1][1] = 'x';
		}

		return board;
	}

	public static boolean checkDraw(char[][] board) {

		int count = 0;
		boolean draw = false;

		for (int i = 0; i < board.length; i++) {

			for (int j = 0; j < board.length; j++) {

				if (board[i][j] == ' ') {

				} else {

					count++;
				}
			}
		}
		if (count == 9) {
			draw = true;
		}

		return draw;
	}

}