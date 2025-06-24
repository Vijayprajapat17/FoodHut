package box4;


	class Student{
	
		static String collagename;
		       String sid;
		       String sname;
		       int age;
		       int Class;
		       String course;
		       
		       public void details() {
		    	   collagename="parul university";
		    	   System.out.println("collagename is ="+collagename);
		    	   
		       }
		       
		       Student( String sid,String sname,int age,String course){
		    //	  this.collagename=collagename;
		    	   this.sid=sid;
		    	   this.sname=sname;
		    	   this.age= age;
		    	   this.course = course;
		    	   System.out.println("Student id id ="+sid+" "+"studentname is ="+sname+" "+"Student age is ="+age+" "+"Student courese is ="+course);
		    	   
		       }
	}
	public class Motu {
		       public static void main(String[] args) {
				Student s1 = new Student("SN123","vijay",24,"B.tech cse");
				s1.details();
				s1.collagename="Bn university";
				Student s2 = new Student("SN345","Sandeep",35,"B.tech civil");
				s2.details();
					
				
			}
	}


