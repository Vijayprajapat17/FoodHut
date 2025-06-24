package Box;

public class MethodPractice {
	public static void Converter(double a) {
		double d = a/30.48;
		System.out.println(d);
	}
	public static void fahtocal(double a) {
		double d = (a-32)*5/9+273.15;
		System.out.println(d);
	}
//	public static void Count(int n) {
//		int count = 0;
//		int rev = 0 ;
//		 while(n!=0) {
//			int rem = n%10;
//			rev= (rev*10)+rem;
//			 n/=10;
//		 }            
//		 System.out.print(rev);
//	}
	public static int factorial(int n) {
		int fact = 1;
		for(int i=1; i<=n; i++) {
			fact*=i;
		}
		return fact;
	}
	public static void PerfectNum(int n){
		int sum = 1;
	 for(int i =2; i<=n/2; i++) {
		 if(n%i==0) {
			  sum +=i;
		 }} if(sum==n) {
			 System.out.println("it is  perfect num ");
		 }else {
			 System.out.println("it is not perfect num");
	 }
	}
	public static void fibonacci(int n1,int n2) {
//		int n1 = 0;
//		int n2 = 1;
		int limit =8;
		System.out.print(n1 +" "+n2+" ");
		for(int i=1; i<=limit-2; i++) {
			int n3 = n1+n2;
			System.out.print(n3 +" ");
			n1=n2;
			n2=n3;
		}
	}
	public static int count(int n) {
		int count =0;
		while(n>0) {
			n/=10;
			count++;
		}
		return count;
	}
	public static int power(int a,int b) {
		int pd =1;
		for(int i=1; i<=b;i++) {
			pd*=a;
		}
		return pd;
	}
	public static boolean armstrong(int n) {
		int count =count(n);
		int sum =0,n1=n;
		
	while(n>0) {
		int rem = n%10;
		n/=10;
		sum+= power(rem,count);
	}
	return sum==n1;
	}
	
	public static void main(String[] args) {
//		Converter( 60.96);
//		fahtocal(32.0);
//		Count(234);
//		PerfectNum(28);
//		int res = factorial(5);
//		System.out.println(res);
		//fibonacci(0,1 );
		 armstrong(153);
		
		
		
		
	}

}
