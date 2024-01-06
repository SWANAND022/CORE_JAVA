package abstraction;

abstract class Employee {
	int empId;
	String empName;
	
	public Employee() {
		System.out.println("-");
	}
	
	public Employee(int emiId,String empName) {

		this.empId=empId;
		this.empName=empName;
	}
	
	public void attendance() {
		System.out.println("Attendance is marked..");
	}
	public abstract double salaryCalc(String employeeType);
}

class Developer extends Employee{

	public Developer (int empId,String empName) {
		super(empId,empName);
	}
	@Override
	public double salaryCalc(String employeeType) {
		if(employeeType.equals("permanent")) {
			return 50000;
		}
		else {
			return 25000;
		}
	}
	
}
public class Example2 {

	public static void main(String[] args) {
		
		Developer d= new Developer(22,"Swanand");
		
	}

}
