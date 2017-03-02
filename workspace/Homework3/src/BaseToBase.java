/*
Neil Opena
110878452
CSE 114 - Homework #3
*/

import java.util.*;
public class BaseToBase {

	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Enter a number to convert: ");
		String number = myScanner.nextLine();
		
		System.out.print("Enter original base: ");
		int originalBase = myScanner.nextInt();
		
		System.out.print("Enter target base: ");
		int targetBase = myScanner.nextInt();
		
		base2base(number,originalBase,targetBase);
		
	}
	
	public static String base2base(String n, int b1, int b2){
		
		String converted = "";
		int[] values = new int[n.length()];
		int[] lettersToValues = {10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35};
		for(int i = 0; i < n.length(); i++){
			if(n.charAt(i) > 9){
				int sub = n.charAt(i) - 'A';
				values[i] = lettersToValues[sub];
			}else{
				values[i] = n.charAt(i);
			}
		}
		
		for(int i = 0; i < values.length; i++){
			converted += values[i] % b2;
		}
		
		//test
		for(int i = 0; i < values.length; i++){
			System.out.print(values[i] + " ");
		}
		return converted;
		
	}
	
}
