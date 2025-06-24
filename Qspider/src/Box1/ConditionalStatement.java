package Box1;
import java.util.Scanner;

public class ConditionalStatement {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
	System.out.println("Enter a :");
//		int n = sc.nextInt();
//		if(n%2==0) {
//			System.out.println(n +" is even");
//		} else {
//			System.out.println(n + "is odd");
//		}
//			int a = sc.nextInt();
//			System.out.println("Enter b");
//			int b = sc.nextInt();
//			if(a>b) {
//				System.out.println(a+ " is greater than b ");
//			} else if (a==b) {
//				System.out.println(a+ "equal to" +b);
//			} else {
//				System.out.println(b +"is greater than a");
//			}
//	int income = sc.nextInt();
//	int tax ;
//	if(income<500000) {
//		tax = 0;
//		System.out.println("tax is :" + tax );
//		}else if(income>=500000 && income<1000000) {
//		tax =(int)( income * 0.2);
//		System.out.println("tax is :" + tax);
//		} else {
//			tax= (int)(income * 0.3);
//			System.out.println("tax is :" + tax);
//		}
	int a = sc.nextInt();
	System.out.println("Enter b :");
	int b = sc.nextInt();
	System.out.println("Enter c :");
	int c = sc.nextInt();
	if((a>=b) && (a>=c)) {
		System.out.println(a);
	}else if((b>=a) && (b>=c)) {
		System.out.println(b);
	}else {
		System.out.println("c is greater");
	}
	
		}
	}

	


