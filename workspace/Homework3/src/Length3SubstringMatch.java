/*
Neil Opena
110878452
CSE 114 - Homework #3
*/

import java.util.*;

public class Length3SubstringMatch {

	public static void main(String[] args){
		/*
		Scanner myScanner = new Scanner(System.in);
		
		System.out.print("Enter a string s1:");
		String s1 = myScanner.next();
		
		System.out.print("Enter a string s2:");
		String s2 = myScanner.next();
		
		System.out.println("Number of matches returned is: " + stringMatch3(s1,s2));
		*/
	}
	
	public static int stringMatch3(String a, String b){
		int counter = 0;
		
		int lengthA = a.length() - 2; //this is to prevent going out of index range
		
		for(int i = 0;i < lengthA; i++){
			if(a.substring(i, i + 3).equals(b.substring(i,i + 3)))
				counter++;
			
			
		}
		
		
		return counter;
	}
	
	
}
