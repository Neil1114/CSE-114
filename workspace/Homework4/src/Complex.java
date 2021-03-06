/*
 * Neil Opena
 * 110878452
 * CSE 114 - Homework #4 Esmaili
 */

public class Complex {
	private double a;
	private double b;
	
	public Complex(double a, double b){
		this.a = a;
		this.b = b;
	}
	
	public Complex(double a){
		this(a,0);
	}
	
	public Complex(){
		this(0);
	}
	
	public double getRealPart(){
		return a;
	}
	
	public double getImaginaryPart(){
		return b;
	}
	
	
	public Complex add(double c, double d){
		Complex total = new Complex(a + c,b + d);
		return total;
	}
	
	public Complex add(Complex i){
		double c = i.getRealPart();
		double d = i.getImaginaryPart();
		Complex total = new Complex(a + c, b + d);
		return total;
	}
	
	public Complex subtract(double c, double d){
		Complex total = new Complex(a - c,b - d);
		return total;
	}
	
	public Complex subtract(Complex i){
		double c = i.getRealPart();
		double d = i.getImaginaryPart();
		Complex total = new Complex(a - c,b - d);
		return total;
	}
	
	public Complex multiply(double c, double d){
		Complex total = new Complex((a * c) - (b * d), (b * c) + (a * d));
		return total;
	}
	
	public Complex multiply(Complex i){
		double c = i.getRealPart();
		double d = i.getImaginaryPart();
		Complex total = new Complex((a * c) - (b * d), (b * c) + (a * d));
		return total;
	}
	
	public Complex divide(double c, double d){
		Complex total = new Complex((a * c + b * d)/(Math.pow(c,2) + Math.pow(d, 2)),(b * c - a * d)/(Math.pow(c,2) + Math.pow(d, 2)));
		return total;
	}
	
	public Complex divide(Complex i){
		double c = i.getRealPart();
		double d = i.getImaginaryPart();
		Complex total = new Complex((a * c + b * d)/(Math.pow(c,2) + Math.pow(d, 2)),(b * c - a * d)/(Math.pow(c,2) + Math.pow(d, 2)));
		return total;
	}
	
	public String toString(){
		
		return b!=0?(b<0?("" + a + " - " + Math.abs(b) + "i"):("" + a + " + " + b + "i")):("" + a);
	}
	
	
}
