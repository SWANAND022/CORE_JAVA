package Tasks;

class Employee{
	void attendance() {
		System.out.println("Employee is coding");
	}
}

class JavaDeveloper extends Employee{
	void attendance() {
		System.out.println("Java Developer is coding in JAVA Proramming language.");
	}
}

public class ClassPlan5Behaviour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		e.attendance();
		
		JavaDeveloper jd= new JavaDeveloper();
		jd.attendance();

	}

}
