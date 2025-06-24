package Box1;

public class LogicalOperator {
	public static void main(String[] args) {
		int a =20;
		int b = 40;
		int c = 60;
		System.out.println(a>b && b>c );
		System.out.println(b>a && c>a);
		System.out.println("vijay"=="vijay"&& 20>=20);
		System.out.println(((40*20)>(30*20)) && ((50*60)>(30*30)));
		System.out.println(70*2+20>120 && 30*5+4>150);
		System.out.println(70*3>=210 ||(40*2)>220);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println(true || true);
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(true);
		System.out.println();
		
	}

}
