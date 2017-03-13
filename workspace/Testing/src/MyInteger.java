
public class MyInteger {

	private int value;
	
	public MyInteger(int value){
		this.value = value;
	}
	
	public int getValue(){
		return value;
	}
	
	public boolean isEven(){
		if(value % 2 == 0)
			return true;
		return false;
	}
	
	public boolean isOdd(){
		if(value % 2 == 1)
			return true;
		return false;
	}
	
	public boolean isPrime(){
		boolean a = true;
		for(int i = 2; i <= Math.sqrt(value); i++){
			if(value % i == 0)
				a = false;
		}
		
		return a;
	}
	
	public static boolean isEven(int num){
		if(num % 2 == 0)
			return true;
		return false;
	}
	
	public static boolean isOdd(int num){
		if(num % 2 == 1)
			return true;
		return false;
	}
	
}
