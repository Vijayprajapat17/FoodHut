package rivisionCode;

public class arrayq {
	public static void main(String[] args) {
		char[] ar = {'A','B','C','G','A','G'};
		int gcount=0;
		int count =0;
		for(int i=ar.length-1; i>=0; i--) {
				
			if(ar[i]=='G') {
				gcount++;
					}else if(ar[i]=='A') {
						count+=gcount;
					}
		}
				System.out.print(count);
				
			}
		}
	


