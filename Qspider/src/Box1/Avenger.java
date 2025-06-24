package Box1;

public class Avenger {
	public static void zeroonetriangle(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				if((i+j)%2==0) {
					System.out.print(1+" ");
				}else {
					System.out.print(0+" ");
				}
				
			}
			System.out.println();
		}
	}
	public static void palindromeTriangular(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print("  ");
			}
			for(int k=i; k>=1; k--) {
				System.out.print(k+" ");
			}
			for(int l=2; l<=i; l++) {
				System.out.print(l+" ");
			}
			System.out.println();
		}
	}
	public static void pascaltriangle(int n) {
		int m= 1;
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++) {
				
				if(k==1 ||k==i ) {
				System.out.print(1+" ");
				}else {
					System.out.print(" ");
				}
			}
				
		
		
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		//zeroonetriangle(5);
		//palindromeTriangular(5);
		pascaltriangle(5);
		
		
	}

}
