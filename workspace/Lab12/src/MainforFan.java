
public class MainforFan {
	public static void main(String[] args){
		
		Fan myFan = new Fan();
		
		Fan hisFan = new Fan(Fan.MEDIUM,true,7d,"black");
		
		System.out.println(myFan.toString());
		System.out.println(hisFan.toString());
		
		myFan.turnOn(true);
		System.out.println(myFan.toString());
		
		
		System.out.println("=====================================");
		Stock google = new Stock("GOOG","Google Inc.");
		
		google.setPreviousClosingPrice(100);
		google.setCurrentPrice(90);
		
		System.out.println(google.changePercent());
	}
	
}