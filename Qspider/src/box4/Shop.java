package box4;
 class ac {
	String brandname;
	int price;
	String color;
	char Class;
}

public class Shop {
	public static void main(String[] args) {
	 ac a1 = new ac();
	 a1.brandname = "Panasonic";
	 a1.price = 50000;
	 a1.color ="White";
	 a1.Class='A';
	 System.out.println(a1.brandname+" "+a1.price+" "+a1.color+" "+a1.Class);
		
	}

}
