package Box1;

import java.util.Scanner;

public class HollowTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");		
		} 
			for(int k=1; k<=n; k++) {
				if(k==1 || i==k|| i==n) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
				System.out.println();
			}
			
	}
	}


