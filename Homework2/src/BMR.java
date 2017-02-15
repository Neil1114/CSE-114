import java.util.*;
public class BMR {
	
	public static void main(String[] args){
		
		Scanner myScanner = new Scanner(System.in);
		boolean notQuit = true;
		
		while(notQuit){
			printInstructions();
			int choice = myScanner.nextInt();
			
			switch(choice){
				case (1):
					System.out.println("Enter the weight in pounds");
					double weight = myScanner.nextDouble();
					System.out.println("Enter the height in inches");
					double height = myScanner.nextDouble();
					System.out.println("Enter the age");
					int age = myScanner.nextInt();
					System.out.println("Enter 0 for male or 1 for female");
					int genderChoice = myScanner.nextInt();
					char gender;
					if(genderChoice == 0){
						gender = 'm';
					} else if(genderChoice == 1){
						gender = 'f';
					} else{
						System.out.println("Invalid gender");
						continue;
					}
					
					System.out.println("Basal metabolic rate: " + bmr(weight,height,age,gender));
					System.out.println("--------------------------------------------");
					break;
				case (0):
					notQuit = false;
					break;
				default:
					System.out.println("INVALID (Enter an integer)");
			}
		}
		System.out.println("Progrma successfully terminated");
		
	}
	
	public static void printInstructions(){
		System.out.println("Press 1 to run the program");
		System.out.println("Press 0 to terminate the program");
	}
	
	public static double bmr(double pounds, double inches, int age, char gender){
		double special;
		if((gender == 'M')|| (gender == 'm')){
			special = 5;
		}else if((gender == 'F') || (gender == 'f')){
			special = -161;
		} else{
			System.out.println("Invalid gender");
			return 0d;
		}
		double bmr = ((10 * pounds * 0.453592) + (6.25 * inches * 2.54) - (5 * age) + special);
		
		return bmr;
	}
}
