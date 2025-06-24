package box4;

  class Suzuki {
	String color;
	int price;
	String model;
	int speed;
	
	public Suzuki(String color,int price,String model,int speed) {
		 this.color=color;
		 this.price=price;
		 this.model=model;
		 this.speed=speed;
	}
	void info() {
		System.out.println(color+" "+price+" "+model+" "+speed);
	}
	
}

public class Car {
	public static void main(String[] args) {
		Suzuki s1 = new Suzuki("white",50000,"M134E",170);
		s1.info();
		
	}

}
