package classAndObjects;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee();
		e1.setName("Swanand");
		e1.setDesignation("Graduate");
		
		String name=e1.getName();
		System.out.println("Name of e1 Employee is="+name);
		
		Employee e2=new Employee(500,"Sneha","Team leader",50000.0);
		String designation=e2.getDesignation();
		System.out.println("designation of the e2 employee="+designation);
		
		System.out.println("\nPrinting all details of the employee e2 together:");
		System.out.println(e2);
	}

}
