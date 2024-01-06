package inheritance;
/*
 * Points to remember:-
 * 
 * 1) Constructors are never inherited from the parent to child.
 * 
 * 2) When the object of child class is created, then always the non-parameterized constructor 
 *    of the parent is called.
 * 
 * 3) In parent class if we do not make any constructor then compiler creates a non 
 *    parameterized constructor in it. But if we as coders are going to create constructor
 *    in parent then always remember to make non parameterized constructor also. 
 *    
 * 4) We can call any constructor of parent from the constructor child by using super keyword.
 * 
 * 5) We can call parent constructor only once inside the constructor of child.
 * 
 * 6) Parent constructor call should be the first line of code in the constructor.
 */

class Garden{
	public Garden() {
		System.out.println("This is the zero parameter constrctor of garden");
	}
	public Garden(String city) {
		System.out.println("This is the garden in the city "+city);
	}
}


class Plant extends Garden{
	
	public Plant() {
		super("Pune");
		System.out.println("This is the zero parameter constructor of plant...");
	}
	public Plant(String name) {
		System.out.println("This is the "+name+ "plant");
	}
}


public class SuperKeywordDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plant p= new Plant();
	}

}
