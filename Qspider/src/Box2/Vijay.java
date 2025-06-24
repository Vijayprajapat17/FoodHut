package Box2;
import java.util.Scanner;

public class Vijay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter i :");
		//int i = sc.nextInt();
//		System.out.println("Enter N :");
//		int n = sc.nextInt();
//		int i =0;
//		int sum = 0;
//		for(int i=1; i<=n; i++) {
//			sum+=i;
//			System.out.println(sum);
//		}
//		System.out.println(sum);
//		while(i<=n) {
//			sum+=i;
//			i++;
//		}
//		System.out.println(sum);
//		do {
//			sum+=i;
//			i++;
//		}while(i<=n);
//		System.out.println(sum);
//		while(i<=n) {
//			System.out.println("****");
//			i++;
//		}
//		do {
//			System.out.println("****");
//			i++;
//		}while(i<=n);
//		for(int i=0; n>i; ) {
//			int lastdigit = n%10;
//			System.out.print(lastdigit);
//			n/=10;
//			
//		}
//		System.out.println();
//		while(n>0) {
//			int lastdigit= n%10;
//			System.out.print(lastdigit);
//			n/=10;
//		}
//		do {
//			int lastdigit=n%10;
//			System.out.print(lastdigit);
//			n/=10;
//		}while(n>i);
//       int n = 15;
//       for(int i =1; i<=n; i++) {
//    	   if(i==5 || i==7) {
//    		   continue;
//    		
//    	   }
//    	   System.out.println(i);
 //      }
		System.out.println("Enter n :");
		int n = sc.nextInt();
		boolean isprime = true;
		for(int i=2; i<=n-1; i++) {
			if(n%i==0) {
				isprime = false;
			} 
		} if(isprime==true) {
			System.out.println("n is prime");
		}else {
			System.out.println("n is not prime");
		}
		
	}

}
