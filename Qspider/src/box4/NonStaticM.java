package box4;
class Box{
	double l;
	double b;
	public Box() {
		
	}
	public Box(double l,double b) {
		this.l=l;
		this.b=b;
	}
	public double area() {
		return l*b;
	}
	public double perimeter() {
		return 2*(l+b);
	}
}

public class NonStaticM {
	public static void main(String[] args) {
		Box b1 = new Box();
		b1.l=12;
		b1.b=10;
		b1.area();
		System.out.println(b1.area());
		
	}

}
