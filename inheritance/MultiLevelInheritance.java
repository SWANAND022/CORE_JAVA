package inheritance;

class Employee{
	int empid;
	String company;
	
	public void markAttendance() {
		System.out.println("Your Attendance has been Marked...");
	}
}

class Programmer extends Employee{
	String category;
	
	public void Coding() {
		System.out.println("The programmer is coding as a "+category+"programmer");
	}
}

class JavaDeveloper extends Programmer{
	String designation;
	String project;
	
	public void usingHibernate() {
		System.out.println("JavaDeveloper is using hibernate to create applications...");
	}
	//alt+shift+s
	@Override
	public String toString() {
		return "JavaDeveloper [designation=" + designation + ", project=" + project + ", category=" + category
				+ ", empid=" + empid + ", company=" + company + "]";
	}
	
	
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaDeveloper jd = new JavaDeveloper();
		jd.empid=202;
		jd.company="Wipro";
		jd.category="Junior";
		jd.designation="Intern";
		jd.project="DataManagement";
		
		jd.markAttendance();
		jd.Coding();
		jd.usingHibernate();
		
		System.out.println("Printing the details of java developers");
		System.out.println(jd);
		
	}

}
