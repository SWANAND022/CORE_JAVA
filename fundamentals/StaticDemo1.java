package fundamentals;
/*
 * Static member belong to the class and not the object.
 * 
 * Static members are same for all objects.
 * 
 */

class Student{
	static String college="Bhavan's College";
	String student1 ="Mohini";
	String student2 ="Pramod";
	
	static public void  display() {
		System.out.println("This is Static display method");
	}
}

public class StaticDemo1 {
	
	
	public static void main(String[] args) {
		
		System.out.println("college name="+Student.college); //directly called because static variable.
		
		Student s = new Student();//have to make object for calling instance variable.
		Student t = new Student();
		
		System.out.println("\n*******Before*******");
		System.out.println("Values in the student object s");
		System.out.println("college name="+Student.college);
		System.out.println("Student1 ="+s.student1);
		
		System.out.println("\nValues in the  student object t");
		System.out.println("college name="+Student.college);
		System.out.println("Student1 ="+t.student1);
		
		
		
		Student.college="JRD tata college";
		t.student1="anjali";
		
		
		System.out.println("\n*******After*******");
		System.out.println("Values in the student object s");
		System.out.println("college name="+Student.college);
		System.out.println("Student1 ="+s.student1);
		
		System.out.println("\nValues in the  student object t");
		System.out.println("college name="+Student.college);
		System.out.println("Student1 ="+t.student1);
		
		System.out.println("");
		s.display();

	}

}
