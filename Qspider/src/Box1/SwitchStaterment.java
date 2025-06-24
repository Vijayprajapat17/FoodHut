package Box1;

public class SwitchStaterment {
	public static void main(String[] args) {
//		int number = 3;
//		switch(number) {
//		case 1 : System.out.println("vijay");
//		break;
//		case 2 : System.out.println("Sagar");
//		break;
//		case 3 : System.out.println("janak");
//		break;
//		case 4 : System.out.println("Sunil");
//		break;
//		default : System.out.println("invalid number");
//		}
		int a = 2;
		int b = 5;
		char operator = '%';
		switch(operator) {
		case '+' : System.out.println(a+b);
		break;
		case '-' : System.out.println(a-b);
		break;
		case '*' : System.out.println(a*b);
		break;
		case '/' : System.out.println(a/b);
		break;
		default : System.out.println("invalid operator");
		
		}
	}

}
