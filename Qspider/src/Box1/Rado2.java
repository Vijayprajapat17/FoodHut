package Box1;

import java.util.Scanner;

public class Rado2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array ");
		int [] arr = new int[sc.nextInt()];
		for(int i=0; i<arr.length; i++) {
			System.out.println("enter value in index "+i);
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(" in index "+i+" is ="+arr[i]);
		
	}
	}

}
