package Box1;
import java.util.Scanner;

public class Statements {
public static void main(String[] args) {
	//Scanner sc = new Scanner(System.in);
	int income = 1000000;
	int tax;
	int a = 12;
	int b = 35;
	int c = 30;
//	if(age>=18) {
//		System.out.println("adult");
//	} if(age> 13 && age < 18 ){
//		System.out.println("Teen Ager");
//	}else {
//		System.out.println("Not Adult");
//	}
//	if(a>=b) { 
//		System.out.println(a + "is greater than 20");
//	} else {
//		System.out.println(b +"is greater than 10");
//	}
//	if(17%2==0) 
//		System.out.println("Even");
//	 else {
//		System.out.println("Odd");
//	}
//	if(age>=18) {
//		System.out.println("adult");
//	} else if(age>13 && age<18) {
//		System.out.println("teenager");
//	}else {
//		System.out.println("Not Adult");
//	}
//	if(income<=500000) {
//		tax = 0;
//		System.out.println(tax);
//	}else if(income>500000 && income<1000000) {
//		tax =(int) (income*0.2);
//		System.out.println(tax);
//	} else {
//		tax = (int)(income * 0.3);
//		System.out.println(tax);
//	}
	if(a>=b && a>=c) {
		System.out.println(a+": is largest");
	} else if(b>=c) {
		System.out.println(b+": is largest");
	} else {
		System.out.println(c+": is largest");
	}
}
}
 