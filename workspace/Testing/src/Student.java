
public class Student extends Person {

	private final String status;

	public Student(String name, String address, String phone_number, String email_address, String status) {
		super(name, address, phone_number, email_address);
		this.status = status;
	}
	
	public String getStatus(){
		return status;
	}

	public String toString(){
		return "Student: " + super.getName() + 
				"\nStatus: " + this.getStatus() + "\nAddress: " + super.getAddress() + "\nPhone Number: " + super.getPhoneNumber() + "\nEmail Address: " + super.getEmailAddress();
	}
}