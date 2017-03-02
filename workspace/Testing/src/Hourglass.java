import java.util.*;
public class Hourglass {

	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter n: ");
		
		int n = stdin.nextInt();
		
		drawHourglass(n);
		
	}
	
	
	public static void drawHourglass(int n){
		
		for(int i = 0; i < n/2; i++){
			if(i == 0){
				for(int j = 0; j < n; j++){
					System.out.print("*");
				}
			}else{
				
				for(int j = 0; j < (i); j++){
					System.out.print(" ");
				}
				
				System.out.print("*");
				
				for(int j = 0; j < (n - 2 * i) - 2; j++){
					System.out.print(" ");
					
				}
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = n/2; i < n; i++){
			if(i == n - 1){
				for(int j = 0; j < n; j++){
					System.out.print("*");
				}
			}else{
				
				for(int j = i; j > 0; j--){
					System.out.print(" ");
				}
				
				System.out.print("*");
				
				for(int j = 0; j < (n - 2 * i) - 2; j++){
					System.out.print(" ");
					
				}
				
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
