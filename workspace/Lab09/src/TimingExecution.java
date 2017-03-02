import java.util.*;
public class TimingExecution {
	
	public static void main(String[] args){
		
		int[] myArray = new int[100_000];
		int key = (int) ((Math.random() * 100_000) + 1);
		for(int i = 0; i < myArray.length; i++){
			
			myArray[i] = (int) ((Math.random() * 100_000) + 1);
		}
		
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		linearSearch(myArray, key);
		long endTime = System.currentTimeMillis();
		System.out.println(endTime);
		System.out.println(endTime - startTime);
		System.out.println("============================");
		
		
		
	}
	
	public static void linearSearch(int[] arr, int key){
		
		for(int i = 0; i < arr.length; i ++){
			if(arr[i] == key){
				//System.out.println("found at index " + i);
				break;
			}
		}
		
		
		
		System.out.println("Found " + key);
		
	}
	
	
}	
