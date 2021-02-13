package connectfour;
import java.util.*;

public class ConnectFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] col1 = new int[6];
		int[] col2 = new int[6];
		int[] col3 = new int[6];
		int[] col4 = new int[6];
		int[] col5 = new int[6];
		int[] col6 = new int[6];
		int[] col7 = new int[6];
		int[] colindex = {0,0,0,0,0,0,0};
		int[][] board = {col1, col2, col3, col4, col5, col6, col7};
		boolean trigger = false;
		int turns = 0;
		System.out.println("- - - - - - -\n- - - - - - -\n- - - - - - -\n- - - - - - -\n- - - - - - -\n- - - - - - -\n");
		while (!trigger) {
			
			//placing the value
			if (turns % 2 == 0) {
				System.out.print("P1: Which column are you playing? (from 1 to 7) ");
				int input = scan.nextInt();
				if (colindex[input-1] >= 6) {
					System.out.println("Error: Column full");
					turns--;
				}
				else {
					board[input-1][colindex[input-1]] = 1;
					colindex[input-1]++;
				}
			}
			else {
				System.out.print("P2: Which column are you playing? (from 1 to 7) ");
				int input = scan.nextInt();
				if (colindex[input-1] >= 6) {
					System.out.println("Error: Column full");
					turns--;
				}
				
				else {
					board[input-1][colindex[input-1]] = 2;
					colindex[input-1]++;
				}
			}
			
			//printing the board
			for (int i = 5; i >= 0; i--) {
				for (int j = 0; j < 7; j++) {
					if (board[j][i] == 0) {
						System.out.print("- ");
					}
					else if (board[j][i] == 1){
						System.out.print("X ");
					}
					else {
						System.out.print("O ");
					}
				}
				System.out.println();
			}
			
			//testing for vertical four-in-a-rows
			int match = 0;
			int prev = 0;
			for (int i = 0; i < 7; i++) {
				for (int j = 0; j < 6; j++) {
						if (board[i][j] == prev && board[i][j] != 0) {
							match++;
							prev = board[i][j];
							
						}
						else {
							match = 0;
							prev = board[i][j];
						}
						if (match >= 3) {
							System.out.println("Victory!");
							trigger = true;
						}
					}
				match = 0;
				}
			
			//testing for horizontal four-in-a-rows
			match = 0;
			prev = 0;
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 7; j++) {
						if (board[j][i] == prev && board[j][i] != 0) {
							match++;
							prev = board[j][i];
							
						}
						else {
							match = 0;
							prev = board[j][i];
						}
						if (match >= 3) {
							System.out.println("Victory!");
							trigger = true;
						}
					}
				match = 0;
			}
			//testing for SE diagonal four-in-a-rows
			match = 0;
			prev = 0;
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 7; j++) {
						int k = i;
						if (board[j][k] == prev && board[j][k] != 0) {
							match++;
							prev = board[j][k];
						}
						else {
							match = 0;
							prev = board[j][k];
						}
						if (match >= 3 && trigger == false) {
							System.out.println("Victory!");
							trigger = true;
						}
						k++;
					}
				match = 0;
			}
			//testing for SW diagonal four-in-a-rows
			match = 0;
			prev = 0;
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 7; j++) {
					int j1 = j;
					int i1 = i;
					while (j1 >= 0 && j1 < 7 && i1 >= 0 && i1 < 6) {
						if (board[j1][i1] == prev && board[j1][i1] != 0) {
							match++;
							prev = board[j1][i1];
						}
						else {
							match = 0;
							prev = board[j1][i1];
						}
						if (match >= 3 && trigger == false) {
							System.out.println("Victory!");
							trigger = true;
						}
						i1--;
						j1++;
					}
					match = 0;
					
				}
				match = 0;
			}
			//testing for SE diagonal four-in-a-rows
			match = 0;
			prev = 0;
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 7; j++) {
					int j1 = j;
					int i1 = i;
					while (j1 >= 0 && j1 < 7 && i1 >= 0 && i1 < 6) {
						if (board[j1][i1] == prev && board[j1][i1] != 0) {
							match++;
							prev = board[j1][i1];
						}
						else {
							match = 0;
							prev = board[j1][i1];
						}
						if (match >= 3 && trigger == false) {
							System.out.println("Victory!");
							trigger = true;
						}
						i1++;
						j1++;
					}
					match = 0;
					
				}
				match = 0;
			}
			
			//ending with a draw
			if (match < 3 && turns >= 41) {
				System.out.println("Draw!");
				trigger = true;
			}
			
			turns++;

			System.out.println();
		}
		scan.close();
	}

}
