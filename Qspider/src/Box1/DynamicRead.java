package Box1;
import java.util.Scanner;

public class DynamicRead {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value A :");
		int a = sc.nextInt();
		System.out.println("Enter the value B :");
		int b = sc.nextInt();
		System.out.println(a*b);
		System.out.println("Enter your name :");
		String name = sc.next();
		System.out.println("Enter your age :");
		int age = sc.nextInt();
		System.out.println("Enter your gender :");
		String gender = sc.next();
		System.out.println("Enter mstatus :");
		boolean mstatus = sc.nextBoolean();
		System.out.println("Enter your adress");
		sc.nextLine();
		String Adress = sc.nextLine();
		sc.nextLine();
//		sc.nextLine();
		System.out.println("your name is ="+ name);
		System.out.println("your age is ="+ age);
		System.out.println("your gender is ="+ gender);
		System.out.println("your mstatus is ="+ mstatus);
		System.out.println("your adress is ="+ Adress);
		
		
		
	}

}
