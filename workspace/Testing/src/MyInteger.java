import java.util.*;

public class MyInteger {

	private int value;

	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public boolean isEven() {
		if (value % 2 == 0)
			return true;
		return false;
	}

	public boolean isOdd() {
		if (value % 2 == 1)
			return true;
		return false;
	}

	public boolean isPrime() {
		boolean a = true;
		if (value == 2) {
			return true;
		} else if (value == 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(value); i++) {
			if (value % i == 0)
				a = false;
		}

		return a;
	}

	public static boolean isEven(int num) {
		if (num % 2 == 0)
			return true;
		return false;
	}

	public static boolean isOdd(int num) {
		if (num % 2 == 1)
			return true;
		return false;
	}

	public static boolean isPrime(int num) {
		boolean a = true;
		if (num == 2) {
			return true;
		} else if (num == 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				a = false;
		}

		return a;
	}

	public static boolean isEven(MyInteger num) {
		if (num.getValue() % 2 == 0)
			return true;
		return false;
	}

	public static boolean isOdd(MyInteger num) {
		if (num.getValue() % 2 == 1)
			return true;
		return false;
	}

	public static boolean isPrime(MyInteger num) {
		boolean a = true;
		if (num.getValue() == 2) {
			return true;
		} else if (num.getValue() == 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num.getValue()); i++) {
			if (num.getValue() % i == 0)
				a = false;
		}

		return a;
	}

	public boolean equals(int a) {
		if (value == a)
			return true;
		return false;
	}

	public boolean equals(MyInteger a) {
		if (value == a.getValue())
			return true;
		return false;
	}

	public static int parseInt(char[] a) {
		int val = 0;
		for (int i = 0, j = a.length - 1; i < a.length; i++, j--) {
			val += (a[i] - 48) * Math.pow(10, j);
		}

		return val;
	}

	public static int parseInt(String a) {
		int val = 0;
		for (int i = 0, j = a.length() - 1; i < a.length(); i++, j--) {
			val += (a.charAt(i) - 48) * Math.pow(10, j);
		}
		return val;
	}

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		while (true) {
			String test = stdin.nextLine();
			System.out.print(
					"Enter a positive integer to create a MyInteger object or <enter> to move on to next part of program:");
			if (test.equals("")) {
				break;
			} else {
				MyInteger obj0 = new MyInteger(Integer.parseInt(test));
				System.out.println("MyInteger obj0 = new MyInteger(" + obj0.getValue() + ");");
				System.out.println("obj0.getValue() = " + obj0.getValue());
				System.out.println("obj0.isEven() = " + obj0.isEven());
				System.out.println("obj0.isOdd() = " + obj0.isOdd());
				System.out.println("obj0.isPrime() = " + obj0.isPrime());
			}
		}

		while (true) {
			String test = stdin.nextLine();
			System.out.print(
					"Enter a positive integer to test static isXXX(int) methods or <enter> to move on to next part of program:");
			if (test.equals("")) {
				break;
			} else {
				int num = Integer.parseInt(test);
				System.out.println("MyInteger.isEven(" + num + ") = " + MyInteger.isEven(num));
				System.out.println("MyInteger.isOdd(" + num + ") = " + MyInteger.isOdd(num));
				System.out.println("MyInteger.isPrime(" + num + ") = " + MyInteger.isPrime(num));

			}
		}

		while (true) {
			String test = stdin.nextLine();
			System.out.print(
					"Enter a positive integer to test static isXXX(MyInteger) methods or <enter> to move on to next part of program:");
			if (test.equals("")) {
				break;
			} else {
				MyInteger obj1 = new MyInteger(Integer.parseInt(test));
				System.out.println("MyInteger obj1 = new MyInteger(" + obj1.getValue() + ");");
				System.out.println("obj1.getValue() = " + obj1.getValue());
				System.out.println("MyInteger.isEven(obj1) = " + MyInteger.isEven(obj1));
				System.out.println("MyInteger.isOdd(obj1) = " + MyInteger.isOdd(obj1));
				System.out.println("MyInteger.isPrime(obj1) = " + MyInteger.isPrime(obj1));
			}
		}

		while (true) {
			String test = stdin.nextLine();
			System.out.print(
					"Enter a the first of two positive integers to create obj2 and test obj2.equals(int) or <enter> to move on to next part of program:");
			if (test.equals("")) {
				break;
			} else {
				MyInteger obj2 = new MyInteger(Integer.parseInt(test));
				System.out.println("MyInteger obj2 = new MyInteger(" + obj2.getValue() + ");");
				System.out.println("obj2.getValue() = " + obj2.getValue());

				System.out.print("Enter a the second of two positive integers to test obj2.equals(int):");
				int num = stdin.nextInt();
				System.out.println("obj2.equals(" + num + ") = " + obj2.equals(num));
			}
		}

		while (true) {
			String test = stdin.nextLine();
			System.out.print(
					"Enter a the first of two positive integers to create obj2 and test obj2.equals(MyInteger obj3) or <enter> to move on to next part of program:");
			if (test.equals("")) {
				break;
			} else {
				MyInteger obj2 = new MyInteger(Integer.parseInt(test));
				System.out.println("MyInteger obj2 = new MyInteger(" + obj2.getValue() + ");");
				System.out.println("obj2.getValue() = " + obj2.getValue());

				System.out.print(
						"Enter a the second of two positive integers to test obj2.equals(int):");
				MyInteger obj3 = new MyInteger(stdin.nextInt());
				System.out.println("obj2.equals(obj3) = " + obj2.equals(obj3));
			}
		}

	}
}