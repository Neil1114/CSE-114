import java.util.*;
public class Triangle extends GeometricObject{
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle(){
		side1 = 1;
		side2 = 1;
		side3 = 1;
	}
	
	public Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
	}
	
	public double getSide1(){
		return side1;
	}
	
	public double getSide2(){ 
		return side2;
	}
	
	public double getSide3(){
		return side3;
	}
	
	public double getPerimeter(){
		return side1 + side2 + side3;
	}
	
	public double getArea(){
		double p = this.getPerimeter() / 2;
		return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
	}
	
	public String toString(){
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
	
	//Drive
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter side 1 of triangle:");
		double side1 = stdin.nextDouble();
		System.out.print("Enter side 2 of triangle:");
		double side2 = stdin.nextDouble();
		System.out.print("Enter side 3 of triangle:");
		double side3 = stdin.nextDouble();
		Triangle one = new Triangle(side1, side2, side3);
		System.out.print("Enter color of triangle");
		String color = stdin.next();
		one.setColor(color);
		System.out.println("Enter whether triangle is filled (yes/no):");
		String response = stdin.next();
		one.setFilled((response.equals("yes"))?true:false);
		System.out.println("Area: " + one.getArea());
		System.out.println("Perimeter: " + one.getPerimeter());
		System.out.println("Color: " + one.getColor());
		System.out.println("Filled?: " + one.isFilled());
	}
}
