package Box1;
import java.util.Scanner;

public class NumberPyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N :");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}for(int k=1; k<=i; k++) {
				System.out.print(i+" ");
		}
			System.out.println();
	}

}
}