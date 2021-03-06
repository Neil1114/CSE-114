/*
 * Neil Opena
 * 110878452
 * CSE 114 - Homework #4 Esmaili
 */
import java.util.*;
public class TestComplex {
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter values for a and b");
		double a = stdin.nextDouble();
		double b = stdin.nextDouble();
		Complex first;
		if( b == 0){
			first = new Complex(a);
		}else{
			first = new Complex(a,b);
		}
		
		System.out.println("first: " + first.toString());
		System.out.println("Enter values for c and d");
		double c = stdin.nextDouble();
		double d = stdin.nextDouble();
		Complex second;
		if(d == 0){
			second = new Complex(c);
		}else{
			second = new Complex(c,d);
		}
		
		System.out.println("second: " + second.toString());
		System.out.println("=================================");
		
		System.out.println("\nAdd:");
		System.out.println((first.add(second)).toString());
		
		System.out.println("\nSubtract:");
		System.out.println((first.subtract(second)).toString());
		
		System.out.println("\nMultiply:");
		System.out.println((first.multiply(second)).toString());
		
		System.out.println("\nDivide:");
		System.out.println((first.divide(second)).toString());
		
	}
}
