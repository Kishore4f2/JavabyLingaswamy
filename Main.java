class Student {

		 String name;
		 int marks;
		 char gender;
		 String email;
		 String from;
		 String course;
		 
		 //this -> this is a keyword which is used to differentiate global variable and local variables
		 //whenever we are having global and local variables with same name, we use this keyword in front of global variables
		 
		 Student(String name, int marks, char gender, String email, String from, String course) {
			 
			 this.name = name;
			 this.course = course;
			 this.marks = marks;
			 this.gender = gender;
			 this.email = email;
			 this.from = from;
		 }
		 
		 //copy contructor
		 Student(Student obj) {
			 name = obj.name;
			 course = obj.course;
			 from = obj.from;
			 marks = obj.marks;
			 gender = obj.gender;
		 }
		 
		 public String toString() {
			 return "name : "+name+" | "+"marks : "+marks+" | "+"gender : "+gender+" | "+"course : "+course+" | "+"from : "+from;
		 }
		 
		}

	public class Main {

		 public static void main(String args[]){
		 
		 Student s1 = new Student("kishore",95,'M',"satyakishore273@gmail.com","Tadepalligudem","java full stack");
		 Student s2 = new Student(s1);
		 
		 System.out.println(s1);
		 System.out.println(s2);
		}
	}