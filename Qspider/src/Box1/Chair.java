package Box1;

public class Chair {
	public static void main(String[] args) {
		int a = -5;
		int b = a++ - --a;
		int c = b-- + --a + b++;
		int d = a+b+c;
		int e = ++d - --b + c++ + a--;
		System.out.println(a+" "+b+" "+c+" "+" "+d+" "+e);
	}

}
