package rivisionCode;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b = sc.nextInt();
		String name = sc.nextLine();
		System.out.println(name);
		
		int calcu = (a*b)/(a-b);
		System.out.println(calcu);

}
}
