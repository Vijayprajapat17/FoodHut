package Box2;
import java.util.Scanner;

public class Practice {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter N :");
	int n = sc.nextInt();
	int evensum = 0;
	int oddsum =0;
	for(int i=1; i<=n; i++) {
		if(i%2==0) {
			evensum+=i;
		} else {
			oddsum+=i;
		}
	}
	System.out.println("sum of evennumber :" + evensum );
	System.out.println("sum of oddnumber :" + oddsum);
}
}



