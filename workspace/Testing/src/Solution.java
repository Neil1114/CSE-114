
public class Solution {

	public static void main(String[] args) {
		printSquare(6);
		System.out.println(changeCase("Stony"));
		int[] mine = {12,13,31,47,34,19,35};
		System.out.print(secondLargest(mine));
	}
	
	public static int secondLargest(int[] arr){
		int largest = 0, secondLargest = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > largest)
				largest = arr[i];
		}
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == largest)
				continue;
			else if(arr[i] > secondLargest)
				secondLargest = arr[i];
		}
		
		return secondLargest;
	}
	
	public static void printMatrix(int[][] matrix){
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix.length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static int[][] flip(int[][] matrix){
		int[][] ans = new int[matrix.length][matrix.length];
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix.length; j++){
				ans[i][j] = matrix[matrix.length - 1- j][matrix.length - 1- i];
			}
		}
		
		
		return ans;
	}
	
	public static void rotateRight(int[] nums, int n){
		for(int i = 0; i < (nums.length - 1); i++){
			int temp =  nums[nums.length - 1];
			for(int j = 0; j < (nums.length - 1); j++){
				
			}
		}
		
		
		
		
		
	}
	
	public static String changeCase(String str){
		String myString = "";
		for(int i = 0; i < str.length(); i++){
			if(Character.isLowerCase(str.charAt(i))){
				myString+=Character.toUpperCase(str.charAt(i));
			}else if(Character.isUpperCase(str.charAt(i))){
				myString+=Character.toLowerCase(str.charAt(i));
			}
		}
		
		return myString;
	}
	
	public static void spaceShip(int n){
		int rows = n * 2 + 1;
		for(int i = 0; i < rows; i ++){
			if(i == n){
				for(int j = 0; j < rows; j++){
					System.out.print(">");
				}
			}else if(i < n){
				int temp = i;
				for(int j = 0; j < i; j++){
					if(temp == 0){
						System.out.print("\\");
					}
				}
				
			}else{
				
			}
			
			System.out.println();
		}
	}
	
	public static void printSquare(int n){
		for(int i = 0; i < n; i++){
			if(i == 0 || i == (n-1)){
				for(int j = 0; j < n; j++){
					System.out.print("*");
				}
				
			}else{
				System.out.print("*");
				for(int j = 0; j < (n - 2); j++){
					System.out.print(" ");
				}
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public static String stripDigits(String word){
		String newString = "";
		
		if(word.equals(null)){
			return null;
		}
		for(int i = 0; i < word.length(); i++){
			if(Character.isDigit(word.charAt(i))){
				continue;
			} newString += word.charAt(i);
		}
		
		return newString;
	}

	public static int[] buildHistogram(int[] array) {
		int[] histogram = new int[10];
		for (int i = 0; i < array.length; i++) {
			if (array[i] <= 9) {
				histogram[0]++;
			} else if (array[i] <= 19) {
				histogram[1]++;
			} else if (array[i] <= 29) {
				histogram[2]++;
			} else if (array[i] <= 39) {
				histogram[3]++;
			} else if (array[i] <= 49) {
				histogram[4]++;
			} else if (array[i] <= 59) {
				histogram[5]++;
			} else if (array[i] <= 69) {
				histogram[6]++;
			} else if (array[i] <= 79) {
				histogram[7]++;
			} else if (array[i] <= 89) {
				histogram[8]++;
			} else {
				histogram[9]++;
			}
		}

		return histogram;
	}

	public static void printNumPattern() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			for (int j = i; j <= 9; j++) {
				System.out.print(j);
			}

			for (int j = 8; j >= i; j--) {
				System.out.print(j);
			}

			System.out.println();
		}
	}

}