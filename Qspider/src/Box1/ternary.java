package Box1;

public class ternary {
	public static void main (String[]args) {
    int a = 40;
    int b = 50;
    int c = 45;
      int max = (a>b)? a: b;
      System.out.println(max);
      int high = (a>b)? ((a>c)?a:c) : ((b>c)?b:c);
      System.out.println(high);
      int min = (a<b)?((a>c)?a:c) : ((b<c)?b:c);
      System.out.println(min);
	}

}
