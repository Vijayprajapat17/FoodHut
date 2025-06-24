package Box2;

import java.util.Scanner;

public class sumo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		//int i=ch;
		if(ch>=97 && ch<=119) {
	    	ch+=3;
			System.out.println(ch);
			
		
		} else if(ch>=68 && ch<=90) {
			ch-=3;
			System.out.println(ch);
		}else {
			System.out.println("can not jump");
		}
	}

}

