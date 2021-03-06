import java.util.*;
public class LoopPattern {
	
	public static void main(String[] args){
		
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Enter an integer to be a limit of the pattern:");
		int n = myScanner.nextInt();
		
		System.out.println("Pattern A:");
		patternA(n);
		System.out.println();
		System.out.println("Pattern B:");
		patternB(n);
		System.out.println();
		System.out.println("Pattern C:");
		patternC(n);
		System.out.println();
		System.out.println("Pattern D:");
		patternD(n);
		System.out.println();
		
	}
	
	public static void patternA(int number){
		for(int i = 1; i <= number; i++){
			System.out.print(1 + " ");
			for(int j = 1; j < i; j++){
				System.out.print((j+1) + " ");
			} System.out.println();
			
		}
		
		
		
	}
	
	public static void patternB(int number){
		for(int i = 0; i< number; i++){
			for(int j = 1; j <= number - i; j++){
				System.out.print(j + " ");
			} System.out.println();
		}
		
		
	}
	
	public static void patternC(int number){
		
		for(int i = 1;i<=number;i++){
			for(int j = number-i; j > 0; j--){
				System.out.print(" " + " ");
				
			}
			for(int k = i; k > 0; k--){
				System.out.print(k + " ");
				
			} System.out.println();
			
		}
		
	}
	
	public static void patternD(int number){
		for(int i = 1;i<=number;i++){
			for(int j = 1; j < i; j++){
				System.out.print(" "+ " ");
			}
			int temp = 1;
			for(int k = 0; k <= number - i; k++){
				System.out.print((temp + k) + " ");
			} System.out.println();
			
		}
		
	}
}