/*
Neil Opena
110878452
CSE 114 - Homework #3
*/

import java.util.*;
public class BaseToBase {

	public static void main(String[] args){
		/*
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Enter a number to convert: ");
		String number = myScanner.nextLine();
		
		System.out.print("Enter original base: ");
		int originalBase = myScanner.nextInt();
		
		System.out.print("Enter target base: ");
		int targetBase = myScanner.nextInt();
		
		System.out.println(base2base(number,originalBase,targetBase));
		*/
	}
	
	public static String base2base(String n, int b1, int b2){
		
		String converted = "", decimalValue = "";
		int decimal = 0;
		int[] values = new int[n.length()];
		for(int i = 0; i < n.length(); i++){
			if(n.charAt(i) >= 65 && n.charAt(i) <= 90){
				values[i] = (n.charAt(i) - 55); //subtract 55 so A == 10
			}else{
				values[i] = (Integer.parseInt("" + n.charAt(i)));
			}
		}
				
		//convert to decimal
		for(int i = 0, j = (values.length - 1); i < values.length; i++, j--){
			decimal += (Math.pow(b1,j) * values[i]);
		}
		
		if(b2 == 10){
			decimalValue += decimal; 
			 //turn decimal into a string
			return decimalValue;
		}else{
			int number = decimal;
			while(number > 0){
				//FIXMe
				int rem = number % b2;
				number = number / b2;
				
				
				if(rem > 9){
					switch(rem){
					case 10:
						converted = "A" + converted;
						break;
					case 11:
						converted = "B" + converted;
						break;
					case 12:
						converted = "C" + converted;
						break;
					case 13:
						converted = "D" + converted;
						break;
					case 14:
						converted = "E" + converted;
						break;
					case 15:
						converted = "F" + converted;
						break;
					case 16:
						converted = "G" + converted;
						break;
					case 17:
						converted = "H" + converted;
						break;
					case 18:
						converted = "I" + converted;
						break;
					case 19:
						converted = "J" + converted;
						break;
					case 20:
						converted = "K" + converted;
						break;
					case 21:
						converted = "L" + converted;
						break;
					case 22:
						converted = "M" + converted;
						break;
					case 23:
						converted = "N" + converted;
						break;
					case 24:
						converted = "O" + converted;
						break;
					case 25:
						converted = "P" + converted;
						break;
					case 26:
						converted = "Q" + converted;
						break;
					case 27:
						converted = "R" + converted;
						break;
					case 28:
						converted = "S" + converted;
						break;
					case 29:
						converted = "T" + converted;
						break;
					case 30:
						converted = "U" + converted;
						break;
					case 31:
						converted = "V" + converted;
						break;
					case 32:
						converted = "W" + converted;
						break;
					case 33:
						converted = "X" + converted;
						break;
					case 34:
						converted = "Y" + converted;
						break;
					case 35:
						converted = "Z" + converted;
						break;
					}
				}else{
					converted = rem + converted;
				}
				
			}

			return converted;
			
		}
		
	}
	
	
	
}
