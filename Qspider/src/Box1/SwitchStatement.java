package Box1;
 import java.util.Scanner;
public class SwitchStatement {
	public class SWitchStatement {

	}

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
//		System.out.println("Enter b");
//		int b = sc.nextInt();
//		System.out.println("Enter operator");
		//char operator = sc.next().charAt(0);
		//int number = sc.nextInt();
//		switch(number) {
//		case 1 : System.out.println("vijay");
//		break;
//		case 2 : System.out.println("sagar");
//		break;
//		case 3 : System.out.println("janak");
//		break;
//		case 4 : System.out.println("sunil");
//		break;
//		}
//		switch(operator) {
//		case '+' : System.out.println(a+b);
//		break;
//		case '-' : System.out.println(a-b);
//		break;
//		case '*' : System.out.println(a*b);
//		break;
//		case '/': System.out.println(a/b);
//		break;
//		case '%' : System.out.println(a%b);
//		break;
//		default : System.out.println("wrong operator");
//		}
        if(n%4==0 ||n%100==0||n%400==0) {
        	System.out.println("this is a leap year");
//        }if(n%100==0) {
//        	System.out.println("this is a leap year");
//        }if(n%400==0) {
//        	System.out.println("this is a leap year");
        }else {
        	System.out.println("this is not leap year");
        }
	}

}
