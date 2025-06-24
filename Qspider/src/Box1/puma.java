package Box1;

public class puma {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		int [] array = new int[5];
		int fact = 1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==i) {
				continue;
			} else {
			fact*=i;
			array[i]=fact;
			
				
			}
			System.out.println(array[i]);
		}
	}

}
