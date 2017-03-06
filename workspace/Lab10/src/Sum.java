import java.util.*;
public class Sum {

	public static void main(String[] args){
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("Enter the dimension of the rows:");
		int row = stdin.nextInt();
		System.out.println("Enter the dimension of the columns:");
		int col = stdin.nextInt();
		
		int[][] matrix = new int[row][col];
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				System.out.println("Enter value for [" + i + "][" + j + "] :");
				matrix[i][j] = stdin.nextInt();
			}
			
		}
		
		for(int i = 0; i < matrix.length; i++){
			System.out.println();
			for(int j = 0; j < matrix[i].length; j++){
				System.out.print(matrix[i][j] + "\t");
			}
		}
		
		System.out.println();
		
		for(int i = 0; i < matrix[0].length; i++){
			int sum = 0;
			for(int j = 0; j < matrix.length; j++){
				sum += matrix[j][i];
			}
			
			System.out.println("The sum for col [" + i + "] :" + sum);
		}
		
		
	}
}