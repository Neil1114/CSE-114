
public class TicTacToe {

	public static void main(String[] args){
		
		int[][] board = new int[3][3];
		
		for(int i = 0; i < board.length; i ++){
			for(int j = 0; j < board[i].length; j++){
				board[i][j] = (int) (Math.random() * 2);
			}
		}
		
		for(int i = 0; i < board.length; i++){
			System.out.println();
			for(int j = 0; j < board[i].length; j++){
				System.out.print(board[i][j] + " ");
			}
		}
		System.out.println();
		checkRows(board);
		
		checkCols(board);
		
		checkDiagonals(board);
	}
	
	public static void checkRows(int[][] matrix){
		boolean three;
		for(int i = 0; i < matrix.length; i++){
			three = true;
			for(int j = 0; j < matrix[i].length - 1; j++){
				if(matrix[i][j] != matrix[i][j + 1])
					three = false;
			}
			
			if(three){
				System.out.println("All " + matrix[i][0] + "'s on row " + i);
				
			}
		}
	}
	
	public static void checkCols(int[][] matrix){
		boolean three;
		for(int i = 0; i < matrix[0].length; i++){
			three = true;
			for(int j = 0; j < matrix.length - 1; j++){
				if(matrix[j][i] != matrix[j + 1][i]){
					three = false;
				}
			}
			
			if(three){
				System.out.println("All " + matrix[0][i] + "'s on column " +  i);
			}
		}
		
		
		
	}
	
	public static void checkDiagonals(int[][] matrix){

		if(matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2]){
			System.out.println("All " + matrix[1][1] + "'s on the diagonal from left");
		}
		if(matrix[0][2] == matrix[1][1] && matrix[1][1] == matrix[2][0]){
			System.out.println("All " + matrix[1][1] + "'s on the diagonal from right");
		}
	}
	
}
