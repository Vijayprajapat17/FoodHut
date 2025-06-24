package box4;
class vijay{
	String name;
	int age ;
	long mobnu;
	String gender;
	
	vijay(String name,int age,long mobnu){
		this.name=name;
		this.age=age;
		this.mobnu=mobnu;
		System.out.println("Name is:"+name+" "+"age is :"+age+" "+"mobile num is :"+mobnu);
	}
	vijay(String name, String gender){
		this.name=name;
		this.gender =gender;
		System.out.println("name iS :"+name+" "+"gender is :"+gender);
	}
	vijay(int age, long mobnu){
		this.age=age;
		this.mobnu=mobnu;
		System.out.println("age iS :"+age+"mobnu is :"+mobnu);
	}
}
class Bottel{
	String brandname;
	String color;
	int price;
	double size;
	Bottel(){	
	}
	Bottel(String brandname,String color,int price,double size){
		this.brandname=brandname;
		this.color=color;
		this.price=price;
		this.size=size;
		System.out.println("Brandname is :"+brandname+" "+"bottel color is:"+color+" "+"price is :"+price+" "+"bottel size is:"+size);
	}
	Bottel(String color,int price,double size){
		this.color=color;
		this.price=price;
		this.size=size;
		System.out.println("bottel color is:"+color+" "+"price is :"+price+" "+"bottel size is:"+size);
	}
	Bottel(int price,double size,String brandname){
		this.price=price;
		this.size=size;
		this.brandname=brandname;
		System.out.println("price is :"+price+" "+"bottel size is:"+size+" "+"Brandname is :"+brandname);
		
	}
}

public class ConOverloading {
	public static void main(String[] args) {
//		vijay v1 = new vijay("Sagar",25,78770940);
//		vijay v2 = new vijay("vijay","male");
//		vijay v3 = new vijay(24,78770939);
//		v1.name ="vijay";
//		System.out.println(v1.name);
		Bottel b1 = new Bottel("Cello","black",230,3.5);
		
	}

}
