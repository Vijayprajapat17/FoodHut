package Box1;

public class vadapav {
	public static double simple(double p,double r, double t) {
//	 p = 10000;
//	 r =  2.5;
//	 t = 2;
	 double si = (p*r*t)/100;
	 return si;
			 
	}
	public static void cube (int n) {
		double cubic = n*n*n;
		System.out.println(cubic);
	}
	public static int  add(int a, int b, int c) {
		return (a+b+c);
	}
	public static double area(int r){
		double formula = 2*3.14*r;
		return formula;
	}
	public static double areaOt(double h,double b) {
	 double formula = 0.5*b*h;
		return formula;
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
//		cube(5);
//		cube(3);
//		
//		int res=add(10,20,30);
//		System.out.println(res);
//		
//		double result = area(4);
//		System.out.println(result);
//		
		double result =areaOt(4.5,6.3);
		System.out.println(result);
	}

}
