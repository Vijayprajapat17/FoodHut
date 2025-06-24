package box4;


public class Shapes {
	public static void Area(double r) {
		System.out.println(3.14*r*r);
		
	} 
	public static void Area(double l,double b) {
		System.out.println((l*b)/2);
	}
	public static void Area(double l,int w) {
		System.out.println((l*w));
	}
	
	public static void main(String[] args) {
		Area(5,7);
	}
	

}
