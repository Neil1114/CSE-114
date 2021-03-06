/*
Neil Opena
110878452
CSE 114 - Homework #3
*/

import java.util.*;
public class MissingLetters {
	
	public static void main(String[] args){
		/*
		Scanner myScanner = new Scanner(System.in);
		
		System.out.print("Enter a string:");
		String test = myScanner.nextLine();
		
		System.out.println(GetMissingLetters(test));
		*/
	}
	
	public static String GetMissingLetters(String testString){
		
		char largest = 'a', smallest = 'z';
		String missingLetters = "";
		testString = testString.toLowerCase();
		for(int i = 0; i < testString.length(); i++){
			if(testString.charAt(i) > largest){
				largest = testString.charAt(i);
			}
			
			if(testString.charAt(i) < smallest){
				smallest = testString.charAt(i);
			}
			
		}
		//System.out.println("smallest: " + smallest);
		//System.out.println("largest: " + largest);
		
		for(int i = smallest + 1; i < largest; i++){
			missingLetters += (char) i;
		}
		
		String answer = "";
		for(int i = 0; i < missingLetters.length(); i++){
			if(testString.indexOf(missingLetters.charAt(i)) < 0){
				answer+=missingLetters.charAt(i);
			}
		}
		
		
		return answer;
	}
}
