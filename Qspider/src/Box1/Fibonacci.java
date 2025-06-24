package Box1;

import java.util.Scanner;

public class Fibonacci {
	public static void fab(int n) {
		
		int a=0;
		int b=1;
		System.out.print(a + " "+ b + " ");
		for(int i=1; i<=n-2; i++) {
			int c = a+b;
			System.out.print(c +" ");
			a=b;
			b=c;
		}	
	}
	public static void floydTriangle(int n) {
		int count=1;
		for(int i=1; i<=n; i++) {
		for(int j=1; j<=n-i; j++) {
			System.out.print("  ");
		}
		for(int k=1; k<=i; k++) {
			System.out.print(count+"  ");
			count++;
		}
		
		System.out.println( " ");
	}}
	public static void factorial(int n) {
		int fact = 1;
		for(int i=1; i<=n; i++) {
			fact*=i;
		
		}
		System.out.print(fact+" ");
	}
	public static void string() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string :");
		String str = sc.nextLine();
		System.out.println(str.length());
		System.out.println(str.charAt(2));
	}
	public static void reverseString() {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter Name :");
		String str = sc.nextLine();
		String rev ="";
		for(int i=0; i<str.length(); i++) {
			rev=str.charAt(i) +rev;
		}
		System.out.print("reverse of name = "+rev);
		
	}
	public static void countLetter() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String :");
		String str = sc.nextLine();
		int lcount = 0;
		int ucount =0;
		for(int i=0; i<str.length(); i++) {
			char ch= str.charAt(i);
			if(ch>=65 && ch<=90) {
				ucount++;
			} if(ch>=97 && ch<=122) {
				lcount++;
			}
		}
		System.out.println("lower case letter is = "+lcount);
		System.out.println("upper case letter is = "+ucount);
	}
	public static void reverseArray() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter  number");
		int num = sc.nextInt();
		int rev=0;
		while(num!=0) {
			int rem = num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		

			//fab(10);
		//floydTriangle(5);
		//factorial(7);
		//string();
		//reverseString();
		//countLetter();
		reverseArray();
	}

}
