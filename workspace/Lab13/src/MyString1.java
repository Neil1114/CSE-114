
public class MyString1 {

	private char[] myString;
	private int length;

	public MyString1(char[] chars) {
		myString = new char[chars.length];
		for (int i = 0; i < chars.length; i++) {
			myString[i] = chars[i];
		}
		this.length = chars.length;
	}

	public char charAt(int index) {
		return myString[index];
	}

	public int length() {
		return this.length;
	}

	public MyString1 substring(int begin, int end) {
		char[] temp = new char[end - begin];
		for (int i = 0, j = begin; i < temp.length; i++, j++) {
			temp[i] = myString[j];
		}
		MyString1 sub = new MyString1(temp);
		return sub;

	}

	public MyString1 toLowerCase() {
		char[] temp = new char[myString.length];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = Character.toLowerCase(myString[i]);
		}
		MyString1 lower = new MyString1(temp);
		return lower;
	}

	public boolean equals(MyString1 s) {
		for (int i = 0; i < s.length(); i++) {
			if (myString[i] != s.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	public static MyString1 valueOf(int i) {
		char[] a = new char[10];
		for (int j = 0, k = a.length - 1; j < a.length; j++, k--) {
			a[j] = (char) (i / (Math.pow(10, k)) + 48);
			i = (int) (i % Math.pow(10, k));
		}
		int numLeadZeros = 0;
		for (int j = 0; j < a.length; j++) {
			if (a[j] != '0')
				break;
			else
				numLeadZeros++;
		}
		char[] b = new char[a.length - numLeadZeros];
		for (int j = 0; j < b.length; j++) {
			b[j] = a[j + numLeadZeros];
		}
		MyString1 temp = new MyString1(b);
		return temp;

	}
	
	public MyString1[] split(String s){
		int len = s.length(), counter = 0;
		for(int i = 0; i < myString.length; i++){
			if(myString[i] == s.charAt(0)){
				i += len - 1;
				counter++;
			}
		}
		
		//System.out.println(counter);
		MyString1[] temp = new MyString1[1 +  counter];
		if(temp.length == 1){
			temp[0] = new MyString1(myString);
			return temp;
		}
		
		int[] indices = new int[counter];
		for(int i = 0; i < indices.length; i++){
			for(int j = 0; j < myString.length; j++){
				if(myString[j] ==  s.charAt(0)){
					boolean alreadyIn = false;
					for(int k = 0; k < indices.length; k++){
						if(indices[k] == j){
							alreadyIn = true;
						}
					}
					if(!alreadyIn){
						indices[i] = j;
						break;
					}
				}
			}
			//System.out.print(indices[i] + " ");
		}
		//System.out.println();
		
		//make one  for indices[0];
		char[] first = new char[indices[0]];
		for(int i = 0; i < first.length; i++){
			first[i] = myString[i];
		}
		
		temp[0] = new MyString1(first);
		//test.length =  3
		//k = 4
		
		for(int i = 1; i < temp.length - 1; i++){
			char[] test = new char[indices[i] - indices[i - 1] - 1];
			for(int j = 0, k = indices[i - 1] + 1; j < test.length; j++, k++){
				test[j] = myString[k];
			}
			temp[i] = new MyString1(test);
		}
		
		char[] last = new char[myString.length - indices[indices.length - 1] - 1];
		for(int i = 0, j = indices[indices.length - 1] + 1; i < last.length; i++, j++){
			last[i] = myString[j];
		}
		
		
		temp[temp.length - 1] = new MyString1(last);
		return temp;
	}

	public static void main(String[] args) {
		char[] a = { 'B', 'E', 'L', 'L', 'h', 'o', 'p' };
		MyString1 hello = new MyString1(a);
		for (int i = 0; i < hello.length(); i++) {
			System.out.print(hello.charAt(i));
		}
		System.out.println();
		MyString1 bell = hello.substring(0, 4);
		for (int i = 0; i < bell.length(); i++) {
			System.out.print(bell.charAt(i));
		}
		System.out.println();
		MyString1 hop = hello.substring(4, 7);
		for (int i = 0; i < hop.length(); i++) {
			System.out.print(hop.charAt(i));
		}
		System.out.println();
		MyString1 lower = hello.toLowerCase();
		for (int i = 0; i < lower.length(); i++) {
			System.out.print(lower.charAt(i));
		}
		System.out.println();
		System.out.println("BELLhop.equals(bellhop) = " + hello.equals(lower));
		System.out.println("bellhop.equals(bellhop) = " + lower.equals(lower));

		MyString1 b = MyString1.valueOf(19);
		System.out.print("MyString1.valueOf(19) = ");
		for(int i = 0; i < b.length; i++){
			System.out.print(b.charAt(i));
		}
		System.out.println();
		char[] c = {'d','o','g','.','d','o','g','.','d','o','g','.','d','o','g'};
		MyString1 d = new MyString1(c);
		for(int i = 0; i < d.length(); i++){
			System.out.print(d.charAt(i));
		}
		System.out.println();
		MyString1[] test = d.split(".");
		for(int i = 0; i < test.length; i++){
			for(int j = 0; j < test[i].length(); j++){
				System.out.print(test[i].charAt(j));
			}System.out.print(" ");
		}
		
		
		
	}

}
