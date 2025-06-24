package Box1;
import java.util.Scanner;

public class Practicequestion {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a :");
//		int a = sc.nextInt();                   
//		System.out.println("Enter b :");
//		int b = sc.nextInt();
//		System.out.println("Enter c :");
//		int c = sc.nextInt();
////		int max = (a>b)?((a>c)?a:c): ((b>c)?b:c);
////		System.out.println("greater is :"+max);
//		if((a>=b) && a>=c) {
//			System.out.println(a+ "is greater");
//		}else if((b>=a) && (b>=c)) {
//			System.out.println(b+ "is greater");
//		}else {
//			System.out.println(c+ "is greater");
//		}
		System.out.println("Enter marks :");
		int marks = sc.nextInt();
		String status = (marks>=33)?"pass":"fail";
		System.out.println(status);
		
		
	}

}
