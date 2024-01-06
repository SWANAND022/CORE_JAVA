package inheritance;

/*
 * Hierarchical Inheritance is another type of inheritance where one class has many child 
 * class.
 * As seen below Honda class has two child Activa and city.
 * 
 * Both the child classes will inherit the logo from Honda, but there is not connection or
 * relation between Activa and city.
 */

class Honda{
	String logo="Honda";
	
}

class Activa extends Honda {
	public void kickstart() {
		System.out.println("Bike starting after kickstart");
	}
}

class City extends Honda{
	public void reverse() {
		System.out.println("Car is reversing...");
	}
}

public class HierarchialInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		City obj = new City();
		System.out.println(obj.logo);
	
		
		

	}

}
