package fundamentals;

/*
 * Diffrence between instance and local variable:
 * 
 * 1) Instance Variable are made directly in class
 *    local vatiable are made inside a method , constructor or block
 *    
 * 2) Instance variable can be accessed directly throught the object of the class
 *    Local variable can be accessed only within its scope, we cannot diretly call them from obj.
 *    
 * 3) Instance variable are given default values by the constructor
 *    local variable have to be given values by us, they are not automatically assigned with default values.
 *    
 */
 class Iv2{
	public Iv2(){
		System.out.println("non parameterized");
	}
	private Iv2(String s){
		System.out.println("parameterized");
	}
}

public class InstanceVariable2 {
	
	int rollno;//instance variable
	String name;
	double marks;
	
	public void display() {
		System.out.println("rollno"+rollno); //it will assign default value to instance var.
	}
	
	public void show() {
		int empId; //local variable
		
		System.out.println("empid="+empId); //need to give the value to local var.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceVariable2 i = new InstanceVariable2();
		i.display();
		
		Iv2 iv= new Iv2();
		//Iv2 iv2= new Iv2("Anudip")); //cannot call the constructor with private AccessSepcifier.
		

	}

}
