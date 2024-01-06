package classAndObjects;

public class Employee {
	
	private int empid;
	private String name;
	private String designation;
	private double salary;
	
	public Employee() {
		/*
		 * We have created non parameterized constructor which we will use to create empty employee.
		 *
		 */
	}
	
	/*
	 * Below we created parameterized constructor used to set all values of the employee
	 * in its object at one go.
	 */
	
	public Employee(int empid,String name,String designation,double salary) {
		this.empid=empid;
		this.name=name;
		this.designation=designation;
		this.salary=salary;
	}
	
	public void setEmpid(int empid) {
		this.empid=empid;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setDesignation(String designation) {
		this.designation=designation;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	public int getEmpid() {
		return empid;
	}
	
	public String getName() {
		return name;	
		}
	
	public String getDesignation() {
		return designation;
	}
	
	public double getSalary( ) {
		return salary;
	}
	
	/*
	 * ToString() method returns the string representation of the object.
	 * 
	 * syntax:
	 * public String toString() {
	 * return "";
	 * }
	 */
	
	public String toString() {
		return "id="+empid+"\nName="+name+"\ndesignation="+designation+"\nsalary="+salary ;
	}
	
	
	

}
