
public class Student extends Person{
	private final String STATUS;
	
	public Student(String a, String b, String c, String d, int e, String f){
		super(b,c,d,e,f);
		STATUS = a;
	}
	
	public String toString(){
		return super.toString() + " STATUS: " + STATUS;
	}
	
}
