
public class Solution {

	public static void main(String[] args) {
		printSquare(6);
	}
	
	public static void spaceShip(int n){
		
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