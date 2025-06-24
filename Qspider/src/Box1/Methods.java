package Box1;
import java.util.Scanner;

public class Methods {
	
	public static void printHello(int a ,int b) {
	int temp = a;
	a=b;
    b=temp;
    System.out.println(a);
    System.out.println(b);
	}
	public static int Product(int a,int b) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a :");
//		int a =sc.nextInt();
//		System.out.println("Enter b :");
//	   int  b = sc.nextInt();
		int prod = a*b;
		return prod;
	}
	public static int Factorial(int n) {
		int fact=1;
		for(int i=1; i<=n; i++) {
			fact*=i;
			//System.out.println(fact);
		}return fact;

	}
	public static int BinomialCoefficient(int n,int r) {
		int n_fact = Factorial(n);
		int r_fact = Factorial(r);
		int nmr_fact = Factorial(n-r);
		int bincoeff = n_fact/(r_fact * nmr_fact);
		return bincoeff;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int n =sc.nextInt();
        System.out.println("Enter r :");
		int r = sc.nextInt();
		//printHello(a,b);
		//int multy = Product(a,b);
	//	System.out.println(multy);
	System.out.println(BinomialCoefficient(n,r));	
		//System.out.println(fact);
		
		
	}

}
