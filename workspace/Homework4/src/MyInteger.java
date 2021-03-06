/*
 * Neil Opena
 * 110878452
 * CSE 114 - Homework #4 Esmaili
 */

public class MyInteger {

	private int value;
	
	public MyInteger(int value){
		this.value = value;
	}
	
	public int getValue(){
		return value;
	}
	
	public boolean isEven(){
		return (value % 2 == 0)? true:false;		
	}
	
	public boolean isOdd(){
		return (value % 2 == 1)? true:false;
	}
	
	public boolean isPrime(){
		if(value == 1){
			return false;
		}else if(value == 2){
			return true;
		}else{
			for(int i = 2; i <= Math.sqrt(value);i++){
				if(value % i == 0)
					return false;
			}return true;
		}
	}
	
	public static boolean isEven(int num){
		return (num % 2 == 0)? true:false;
	}
	
	public static boolean isOdd(int num){
		return (num % 2 == 1)? true: false;
	}
	
	public static boolean isPrime(int num){
		if(num == 1){
			return false;
		}else if(num == 2){
			return true;
		}else{
			for(int i = 2; i <= Math.sqrt(num); i++){
				if(num % i == 0)
					return false;
			}return true;
		}
	}
	
	public static boolean isEven(MyInteger num){
		return (num.getValue() % 2 == 0)? true:false;
	}
	
	public static boolean isOdd(MyInteger num){
		return (num.getValue() % 2 == 1)? true: false;
	}
	
	public static boolean isPrime(MyInteger num){
		if(num.getValue() == 1){
			return false;
		}else if(num.getValue() == 2){
			return true;
		}else{
			for(int i = 2; i <= Math.sqrt(num.getValue()); i++){
				if(num.getValue() % i == 0)
					return false;
			}return true;
		}
	}
	
	public boolean equals(int num){
		return (value == num)? true:false;
	}
	
	public boolean equals(MyInteger num){
		return (value == num.getValue())? true:false;
	}
	
	public static int parseInt(String s){
		int val = 0;
		for(int i = 0, j = s.length() - 1; i < s.length(); i++, j--){
			val += (Math.pow(10, j) * ((int) s.charAt(i) - 48));
		}
		return val;
	}
	
	
}


