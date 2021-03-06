
public class FindMatch {

	public static void main(String[] args) {
		int[][] board = new int[8][8];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = (int) (Math.random() * 2);
			}
		}

		printMatrix(board);
		checkRows(board);
		checkCols(board);
		checkDiag(board);
	}

	public static void printMatrix(int[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void checkRows(int[][] board) {
		boolean three = true;
		for (int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length - 1;j++){
				if(board[i][j] == board[i][j + 1])
					three = false;
				
			}
			
			if(three){
				System.out.println("All " + board[i][0] + "'s on row " + i);
			}
		}
	}

	public static void checkCols(int[][] board) {
		boolean three = true;
		for (int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length - 1;j++){
				if(board[j][i] != board[j + 1][i])
					three = false;
				
			}
			
			if(three){
				System.out.println("All " + board[0][i] + "'s on column " + i);
			}
		}
	}

	public static void checkDiag(int[][] board) {
		boolean three = false;
		if(board[0][0] == board[1][1] && board[1][1] == board[2][2] &&  board[2][2] == board[3][3] && board[3][3] == board[4][4] && board[4][4] == board[5][5] && board[5][5] == board[6][6] && board[6][6] == board[7][7]){
			three = true;
		}
		if(three){
			System.out.println("All " + board[0][0] + "'s on major diagonal");
		}
		
		three = false;
		
		if(board[0][7] == board[1][6] && board[1][6] == board[2][5] &&  board[2][5] == board[3][4] && board[3][4] == board[4][3] && board[4][3] == board[5][2] && board[5][2] == board[6][1] && board[6][1] == board[7][0]){
			three = true;
		}
		
		if(three){
			System.out.println("All " + board[0][7] + "'s on minor diagonal");
		}
		
		
	}
}
