package Box2;

import java.util.Scanner;

public class swistrack {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	char ch = sc.next().charAt(0);
	//int i=ch;
	if(ch>='0' && ch<='9') {
		int sum =ch+100-48;
		System.out.println(sum);
	}else {
		System.out.println("not a digit");
	}
}
}
