package Box1;
import java.util.Scanner;

public class Hourglass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=i; k<=n; k++) {
				if(i==1 || (i==k) || k==n || k==(n/2)+1) {
				System.out.print("* ");
			}else {
				System.out.print("  ");
			}
			}
			System.out.println();
		}
		for(int i=n-1; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=i; k<=n; k++) {
				if(i==1 || i==k || k==n || k==(n/2)+k ){
				System.out.print("* ");
			}else {
				System.out.print("  ");
				}
			}
			System.out.println();
	}

}}
