package Box1;
import java.util.Scanner;

public class ButterflyPattern {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n :");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			} int space = 2*(n-i);
			for(int k=1; k<=space; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			} System.out.println();

}
		for(int i=n-1; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			} int space = 2*(n-i);
			for(int k=1; k<=space; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			} System.out.println();
}
}}