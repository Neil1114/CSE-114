
public class Person {
	private String name;
	private String address;
	private String phone_number;
	private String email_address;
	
	public Person(String name, String address, String phone_number, String email_address){
		this.name = name;
		this.address = address;
		this.phone_number = phone_number;
		this.email_address = email_address;
	}
	
	public String getName(){
		return name;
	}
	
	public String getAddress(){
		return address;
	}
	
	public String getPhoneNumber(){
		return phone_number;
	}
	
	public String getEmailAddress(){
		return email_address;
	}

	public String toString(){
		return "Address: " + this.getAddress() + "\nPhone Number: " + this.getPhoneNumber() + "\nEmail: " + this.getEmailAddress();
	}
}

