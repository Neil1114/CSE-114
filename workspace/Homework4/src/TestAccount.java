/*
 * Neil Opena
 * 110878452
 * CSE 114 - Homework #4 Esmaili
 */

public class TestAccount {

	public static void main(String[] args){
		Account test = new Account();
		System.out.println("Balance:" + test.getBalance());
		System.out.println("Interest Rate: " + test.getAnnualInterestRate() + " Monthly Interest Rate: " + test.getMonthlyInterestRate());
		test.withDraw(51);
		System.out.println("Balance: " + test.getBalance());
		test.deposit(201);;
		System.out.println("Balance: " + test.getBalance());
		test.withDraw(1100000000);
		System.out.println("Balance: " + test.getBalance());

	}
}
