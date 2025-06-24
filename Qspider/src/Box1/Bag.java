package Box1;
import java.util.Scanner;

public class Bag {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a :");
		int a = sc.nextInt();
		System.out.println("Enter b :");
		int b = sc.nextInt();
		System.out.println("Enter operator :");
		char Operator = sc.next().charAt(0);
       
		switch(Operator) {
		case '+'-> System.out.println(a+b);
		case '-' -> System.out.println(a-b);
		case '*' -> System.out.println(a*b);
		case '/' -> System.out.println(a/b);
		case '%' -> System.out.println(a%b);
		default -> System.out.println("Invalid operator");
		}
		
	}

}
