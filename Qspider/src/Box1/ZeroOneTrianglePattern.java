package Box1;
import java.util.Scanner;

public class ZeroOneTrianglePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for( int j=1; j<=i; j++) {
				if((i+j)%2==0) {
					System.out.print(1);
				}else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
	}

}
