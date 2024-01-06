package encapsulation;
/*
 * Encapsulation is one of the pillar of OOPS concepts.
 * We achieve encapsulation using access specifiers such a private.
 * 
 * Private members cannot be directly accessed from outside the class.
 * setters are used to set values to the private variables.
 * getters are used to get values that was stored in the private variables.
 */

class Employee{
	private int empId;
	private String empName;
	private double empSalary;
	
	public void setEmpID(int empId) {
		this.empId=empId;
	}
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary=empSalary;
	}
	public Employee() {
		
	}
	public Employee(int empId,String empName,double empSalary) {
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	@Override
	public String toString() {
		return "\nEmployee: \nempId=" + empId + "\nempName=" + empName + " \nempSalary=" + empSalary + "";
	}
	
	
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e= new Employee();
		e.setEmpID(500);
		e.setEmpName("Sahil");
		e.setEmpSalary(50000.0);
		
		double sal=e.getEmpSalary();
		System.out.println("The salary of e "+sal);
		
		Employee e2= new Employee(600,"Swanand",70000.0);
		
		System.out.println(e);
		System.out.println("\n......\n");
		System.out.println(e2);
	}

}
