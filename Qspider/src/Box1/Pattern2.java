package Box1;

import java.util.Iterator;

public class Pattern2 {
	public static void main(String[] args) {
		int n = 4;

		for(int r=1; r<=n; r++) {
			for (int c=1; c<=n-r; c++) {
				System.out.print("  ");
			}
			
			for(int c=1; c<=2*r-1; c++) {
			
			if(c==1 || c==2*r-1 || r==n  ) {
			System.out.print("* ");
			}else {
				System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
