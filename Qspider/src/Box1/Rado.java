package Box1;

public class Rado {
	public static void main(String[] args) {
		int [] arr= {12,34,56,64,78,45};
		System.out.println("length of an array= "+arr.length);
		arr[0]=23;
		arr[1]=34;
		arr[2]=45;
		arr[3]=56;
		arr[4]=67;
		for(int i=0; i<arr.length; i++) {
		
		System.out.println("in index  "+ i +" is = "+ arr[i]);
		}
	}

}
