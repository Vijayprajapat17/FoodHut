package box4;

import java.util.Scanner;

public class Astor {
	public static void Reverse(int n) {
		if(n==0) {
			return;
			//System.out.println(n-1);
			
		}
		Reverse(n-1);
		System.out.println(n+" ");
	}
	public static int Facto(int n) {
		if(n<=1) {
			return 1;
			
		}
		return n*Facto(n-1);
	}
	public static int Fib(int n) {
	
		if(n==1) {
			return 0;
		}
		if(n==2) {
			return 1;
		}
		return (Fib( n-1)+Fib(n-2));
	}
	
	public static void main(String[] args) {
	
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		Reverse( n);
		System.out.println(Fib( 5) );
		
	}

}
