package rivisionCode;

class Details{
	String name ;
	int EmpId;
	int age;
	String mail;
	
}

class Doctor extends Details{
	String Department;
	
}
public class Initance {
	public static void main(String[] args) {
		Doctor d1 = new Doctor();
	  d1.name="vijay";
	  d1.age = 24;
	  d1.mail= "vijay1234@gmail.com";
	  d1.Department="physiotherephist";
	  System.out.println(d1.name);
	  System.out.println(d1.age);
	  System.out.println(d1.mail);
	  System.out.println(d1.Department);
	}
	
	

}
