package box4;

import java.util.Scanner;

public class QuickSort {
	public static int getPivot(int[]arr,int l,int h) {
	int pi=arr[h];
	int i =l;
	while(l<h) {
		if(arr[i]<pi) {
			int temp =arr[i];
			arr[i]=arr[l];
			arr[l]=temp;
			i++;
		}
		l++;
	}
	int temp = arr[h];
	arr[h]=arr[i];
	arr[i]=temp;
	return i;
		
	}
	public static void QuickS(int[]arr,int l,int h) {
		if(l<h) {
			int pivot = getPivot(arr,l,h);
			QuickS(arr,l,pivot-1);
			QuickS(arr,pivot+1,h);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		for(int i=0; i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		QuickS(arr,0,n-1);
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
