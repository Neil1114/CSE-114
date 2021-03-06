import java.util.*;
public class Part2 {
	
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		boolean notQuit = true;
		
		System.out.println("A: pounds to kilos");
		System.out.println("B: kilos to pounds");
		System.out.println("C: kilometers to miles");
		System.out.println("D: miles to kilometers");
		System.out.println("E: exit");
		
		while(notQuit){
			System.out.println("Enter your option: ");
			String option = myScanner.nextLine();
			switch(option){
				case("A"):
					System.out.println("Enter quantity in pounds:");
					double pounds = myScanner.nextDouble();
					myScanner.nextLine();
					System.out.println(pounds + " pounds are " + poundsToKilos(pounds) + " kgs");
					break;
				case("B"):
					System.out.println("Enter quantity in kilos:");
					double kilos = myScanner.nextDouble();
					myScanner.nextLine();
					System.out.println(kilos + " kgs are " + kilosToPounds(kilos) + " pounds");
					break;
				case("C"):
					System.out.println("Enter quantity in kilometers:");
					double kilometers = myScanner.nextDouble();
					myScanner.nextLine();
					System.out.println(kilometers + " kilomets are " + kmToM(kilometers) + " miles");
					break;
				case("D"):
					System.out.println("Enter quantity in miles:");
					double miles = myScanner.nextDouble();
					myScanner.nextLine();
					System.out.println(miles + " miles are " + mToKm(miles) + " kilometers");
					break;
				case("E"):
					notQuit = false;
					break;
				default:
					System.out.println("Invalid option");
			}
		}
		System.out.println("Program successfully exited...");
	
	}
	
	public static double poundsToKilos(double pounds){
		return pounds * 0.453592;
	}
	
	public static double kilosToPounds(double kilos){
		return kilos * 2.20462;
	}
	
	public static double kmToM(double km){
		return km * 1000;
	}
	
	public static double mToKm(double m){
		return m * .001;
	}
	
}
