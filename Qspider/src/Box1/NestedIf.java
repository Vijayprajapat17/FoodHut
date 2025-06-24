package Box1;
import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		String emailId = "vijayprajapat@gmail.com";
//		int pass = 12345;
//		if(emailId=="vijayprajapat@gmail.com") {
//			if(pass==12345) {
//				System.out.println("login Successful");
//			} else {
//				System.out.println("Wrong password");
//			}
//		} else {
//			System.out.println("invalid emailid");
//		}
		System.out.println("Enter year :");
		int year = sc.nextInt();
		if(year%4==0 && year%100!=0 ) {
//			if(year%400==0 && year%4==0) {
//				System.out.println(year +": is leap year");
//			}else {
//				System.out.println("not leap year");
//			}
			System.out.println(year + ": leap year");
		} else {
			System.out.println("Not leap year");
		}
		
	}

}
