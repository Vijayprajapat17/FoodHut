package Box1;
class Laptop{
	String colour;
	int ram;
	double price;
	
	Laptop(String c,int r, double p){
		colour = c;
		ram = r;
		price = p;
	}
	void details() {
		System.out.println("laptop colour is :"+colour +" ram is :"+ram +" price is"+price);
	}
	
}


public class AutomobilesPlant {
	public static void main(String[] args) {
		Laptop l1 = new Laptop("blue",128,55.4);
		Laptop l2 = new Laptop("Silver",14,44);
		l1.details();
		l2.details();
		
		
	}

}
