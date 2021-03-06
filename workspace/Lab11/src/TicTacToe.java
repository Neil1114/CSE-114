import java.util.*;
public class TicTacToe {

	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		char[][] board = new char[3][3];
		boolean gameOver = false;
		newBoard(board);
		while(!gameOver){
			printInstructions();
			System.out.print("Player 1 Move (X): ");
			int row1 = stdin.nextInt();
			int col1 = stdin.nextInt();
			if(board[row1][col1] == '_')
				board[row1][col1] = 'X';
			printBoard(board);
			if(checkWinner(board,'X')){
				System.out.print("Player 1 wins!!!!");
				gameOver = true;
				break;
			}
			
			if(checkFull(board)){
				System.out.print("Game over. No winner");
				gameOver = true;
				break;
			}
			System.out.print("Player 2 Move (O): ");
			int row2 = stdin.nextInt();
			int col2 = stdin.nextInt();
			if(board[row2][col2] == '_')
				board[row2][col2] = 'O';
			printBoard(board);
			if(checkWinner(board,'O')){
				System.out.print("Player 2 wins!!!!");
				gameOver = true;
				break;
			}
			
			if(checkFull(board)){
				System.out.print("Game over. No winner");
				gameOver = true;
				break;
			}
			
		}
		
	}
	
	public static void printInstructions(){
		System.out.println("Enter the row followed by the column");
	}
	
	
	
	public static boolean checkWinner(char[][] matrix, char test){
		boolean row = false, col = false, diag = false;
		if(matrix[0][0] == test && matrix[0][1] == test && matrix[0][2] == test)
			row = true;
		else if(matrix[1][0] == test && matrix[1][1] == test && matrix[1][2] == test)
			row = true;
		else if(matrix[2][0] == test && matrix[2][1] == test && matrix[2][2] == test)
			row = true;
		
		if(matrix[0][0] == test && matrix[1][0] == test && matrix[2][0] == test)
			col = true;
		else if(matrix[0][1] == test && matrix[1][1] == test && matrix[2][1] == test)
			col = true;
		else if(matrix[0][2] == test && matrix[1][2] == test && matrix[2][2] == test)
			col = true;
		
		if(matrix[0][0] == test && matrix[1][1] == test && matrix[2][2] == test)
			diag = true;
		else if(matrix[0][2] == test && matrix[1][1] == test && matrix[2][0] == test)
			diag = true;
			
		boolean win = false;
		if(row || col || diag){
			win = true;
		}
		
		return win;
	}
	
	public static boolean checkFull(char[][] matrix){
		boolean full = true;
		for(int i = 0;i< matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				if(matrix[i][j] == '_')
					full = false;
			}
		}
		
		return full;
	}
	
	public static void newBoard(char[][] matrix){
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				matrix[i][j] = '_';
			}
		}
	}
	
	public static void printBoard(char[][] matrix){
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				System.out.print(matrix[i][j] + " ");
			}System.out.println();
		}
	}
	
}
