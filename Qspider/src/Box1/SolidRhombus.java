package Box1;
import java.util.Scanner;

public class SolidRhombus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=(n-i); j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=n; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
