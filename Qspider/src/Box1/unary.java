package Box1;

public class unary {
	public static void main(String[]args) {
		int a = 10;
		int b =++a;
        int c = a++ - b--;
        int d = c++ + --b - --a;
        System.out.println(a+" "+b+" "+c+" "+d);
        System.out.println(a++ - d++ + --b + c-- + d--);
       System.out.println(++b + --a - d-- + c++ - 2);
	 
		
	}

}
