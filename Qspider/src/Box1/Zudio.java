package Box1;

import java.util.Scanner;

public class Zudio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int n = sc.nextInt();
		boolean isPrime = true;
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				isPrime= false;
			}
		}
			if(isPrime==true) {
				System.out.println(n + " is Prime number");
			}else {
				System.out.println(n+" is not prime number");
			}
		}
	}


