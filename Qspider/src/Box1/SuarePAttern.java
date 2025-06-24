package Box1;

public class SuarePAttern {
	public static void Square(int n,int m) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				if(j==1 || j==m ||i==1 || i==n) {
				System.out.print("* ");
			}else {
			System.out.print("  ");
		}
			}
			System.out.println();
		}
	}
	
	public static void pattern(int rn,int cn) {
		for(int i=1; i<=rn; i++) {
			for(int j=1; j<=cn; j++) {
				//if(i==1 && j<=(cn/2)+1 || j==1 || i==rn/2+1 || j==cn/2+1 || j==cn && i>=(rn/2)+1 || i==rn) {
				if( i==rn/2+1 || j==cn/2+1 || (j==cn) && (i>=rn/2+1) || (i==1) && (j>=cn/2+1) || (i==rn) && (j<=cn/2+1) ||(j==1) &&(i<=rn/2+1)){	
				System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}	
	public static void main(String[] args) {
		pattern(11,11);
	}

}
