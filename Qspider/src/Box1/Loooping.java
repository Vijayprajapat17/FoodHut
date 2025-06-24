package Box1;

public class Loooping {
public static void main(String[] args) {
	int n = 10899;
	int rev =0;
//	for(int i=1; i<=n; i++) {
//System.out.println("* * * *");
	//}
	while(n>0) {
	int lastdigit=n%10;
	rev= (rev*10)+ lastdigit;
	n/=10;
	}
	System.out.println(rev);
	}
	
	} 

