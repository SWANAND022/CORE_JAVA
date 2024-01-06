package Tasks;

/*
 * Create a class student which has instance variable rollno. and name
 * Student class has a mehod attendSession which prints "Student is attending the session".
 * create a child class Swanand, When we call attentSession from Swanand class it should specify that
 * the student is attending online.
 * 
 */

class Student1{
	String name= "Swanand";
	int rollno=22;
	
	public void attendSession() {
		System.out.println("Student is attending the session");
	}
}

class Swanand extends Student1{
	public void attendSession() {
		System.out.println("The student is attending online.");
	}
}

public class MethodOverridingPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swanand s=new Swanand();
		s.attendSession();

	}

}
