import java.util.*;
public class Driver {
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter");
		System.out.println("1)To create a student:");
		System.out.print("2)To create an employee:");
		int first = stdin.nextInt();
		stdin.nextLine();
		//FIXME nextline works better
		switch(first){
		case 1:
			System.out.print("Enter name:");
			String name = stdin.nextLine();
			System.out.print("Enter address:");
			String address = stdin.nextLine();
			System.out.print("Enter phone number:");
			String phoneNum = stdin.nextLine();
			System.out.print("Enter email:");
			String email = stdin.nextLine();
			System.out.print("Enter student's status:");
			String status = stdin.nextLine();
			Student a = new Student(name,address,phoneNum,email,status);
			System.out.println(a.toString());
			break;
		case 2:
			System.out.print("Enter name:");
			name = stdin.nextLine();
			System.out.print("Enter address:");
			address = stdin.nextLine();
			System.out.print("Enter phone number:");
			phoneNum = stdin.nextLine();
			System.out.print("Enter email:");
			email = stdin.nextLine();
			System.out.println("Enter");
			System.out.println("1)To create a faculty member");
			System.out.print("2)To create a staff member:");
			int second = stdin.nextInt();
			stdin.nextLine();
			switch(second){
			case 1:
				System.out.print("Enter office number:");
				int officeNum = stdin.nextInt();
				stdin.nextLine();
				//System.out.println(officeNum + "HERE");

				System.out.print("Enter salary:");
				int salary = stdin.nextInt();
				stdin.nextLine();
				System.out.print("Enter date hired (mm/dd/yy): ");
				String dateTest = stdin.nextLine();
				MyDate date = new MyDate(dateTest);
				System.out.print("Enter office hours:");
				String officeHours = stdin.nextLine();
				System.out.print("Enter rank:");
				String rank = stdin.nextLine();
				Faculty b = new Faculty(name,address,phoneNum,email,officeNum,salary,date,officeHours,rank);
				System.out.println(b.toString());
				break;
			case 2:
				System.out.print("Enter office number:");
				officeNum = stdin.nextInt();
				stdin.nextLine();
				//System.out.println(officeNum + "HERE");
				System.out.print("Enter salary:");
				salary = stdin.nextInt();
				stdin.nextLine();
				System.out.print("Enter date hired (mm/dd/yy): ");
				dateTest = stdin.nextLine();
				date = new MyDate(dateTest);
				System.out.print("Enter title:");
				String title = stdin.nextLine();
				Staff c = new Staff(name,address,phoneNum,email,officeNum,salary,date,title);
				System.out.println(c.toString());
				break;
			}
			break;
		}
	}
	
}
