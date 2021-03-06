
/*
Neil Opena
110878452
CSE 114 - Homework #3
*/

import java.util.*;

public class RunLengthEncoding {

	public static void main(String[] args) {
		/*
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Enter a string to endode:");
		String message = myScanner.next();

		System.out.print("Enter the delimeter");
		char delimeter = myScanner.next().charAt(0);

		System.out.print(encode(message, delimeter));*/
	}

	public static String encode(String message, char delimeter) {
		String encoded = "";

		char[] letters = new char[message.length()];
		char[] distinctLetters = new char[message.length()];

		for (int i = 0; i < message.length(); i++) {
			letters[i] = message.charAt(i);
			distinctLetters[i] = message.charAt(i);
		}
		for (int i = 0; i < distinctLetters.length - 1; i++) {
			if (distinctLetters[i] == distinctLetters[i + 1])
				distinctLetters[i] = ' ';
		}
		if (distinctLetters[distinctLetters.length - 2] == distinctLetters[distinctLetters.length - 1])
			distinctLetters[distinctLetters.length - 2] = ' ';


		int amount = 0;
		for (int i = 0; i < distinctLetters.length; i++) {
			if (distinctLetters[i] != ' ')
				amount++;
		}
		int[] amounts = new int[amount];
		int number = 1;
		int i = 0;
		for (int j = 0; j < distinctLetters.length; j++) {
			if (distinctLetters[j] != ' ') {
				amounts[i] = number;
				number = 1;
				i++;
			} else
				number++;
		}
		
		int k = 0;
		char[] specific = new char[amounts.length];
		for(int j = 0; j < distinctLetters.length; j++){
			if (distinctLetters[j] != ' '){
				specific[k] = distinctLetters[j];
				k++;
			}
		}
		
		for(int j = 0; j < specific.length; j++){
			if(amounts[j] > 3){
				encoded = encoded + delimeter + specific[j] + amounts[j];
			}else{
				for(int z = 0; z < amounts[j];z++){
					encoded = encoded + specific[j];
				}
				
			}
		}
		
		
		return encoded;

	}

}
