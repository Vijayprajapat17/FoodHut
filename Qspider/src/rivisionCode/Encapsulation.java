package rivisionCode;

class Student{
	private String name;
	private int Id;
	
	Student(String name,int Id){
		this.name=name;
		this.Id=Id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id=Id;
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		Student s1 = new Student("Vijay",101);
		System.out.println(s1.getname());
		System.out.println(s1.getId());
		s1.setname("Sagar");
		System.out.println(s1.getname());
		s1.setId(202);
		System.out.println(s1.getId());
	}

}
