/*
Neil Opena
110878452
CSE 114 - Homework #3
*/

import java.util.*;
public class Collatz {

	public static void main(String[] args){
		/*
		//main method created for testing
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Enter an integer to test:");
		int num = myScanner.nextInt();
		
		System.out.println("Number of iterations returned by the method is: " + howManyCollatzIterations(num));
		*/
	}
	
	public static int howManyCollatzIterations(int n){
		int iterations = 0;
		
		
		int i = n;
		while(i != 1){
			if(i % 2 == 0){
				i /= 2;	
				iterations++;
			}else{
				i = (3*i) + 1;
				iterations++;
			}
			
		}
		
		
		
		return iterations;
		
	}
	
	
}
