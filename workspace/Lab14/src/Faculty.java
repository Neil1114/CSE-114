
	public class Faculty extends Employee{
		
	private int rank;
	private String officeHours;
	
	public Faculty(int a, String b, String bruh, double nah, MyDate c, String d, String e, String f, int z, String g){
		super(bruh, nah, c,d,e,f,z,g);
		rank = a;
		officeHours = b;
	}
	
	public int salaryRange(){
		if(rank * super.getDateHired().getYear() < 10)
			return 1;
		else if(rank * super.getDateHired().getYear() < 20)
			return 2;
		else
			return 3;
	}
	
	public String toString(){
		return super.toString() + " rank: " + rank + " officeHours: " + officeHours;
	}
}
