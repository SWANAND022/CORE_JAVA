package inheritance;

/*
 * Method Overriding is the process of changing the behavior of the inherited method in the child object.
 * 
 * Method Overriding is a type of Polymorphism.
 * 
 * Polymorphism is same name different behaviour.
 * Poly means many and Morph means forms.
 * 
 * Types of Polymorphism:-
 * 1)Method Overriding
 * 2)Method Overloading
 * 
 * Steps for method Overriding:-
 * 1) Make exact same method in the child class at it was in parent class.
 * 2) Do not change the method name and the method parameter.
 * 3) Access specifier can be changed but you cannot reduce the visibility in the child class.
 * 4) Private methods are never inherited by child class.Hence, we cannot override private methods.
 *    We can make same method in child also but it will be considered as a new method belonging to
 *    child class. This method will not be connected to the parent class method.
 * 
 * AccessSpecifiers      Visibility
 * public                ----------------------------
 * protected             ----------------------
 * default               ---------------
 * private               ----------
 *  
 */

class Parent{
	
	public void sendResume() {
		
		System.out.println("Sending resume by post..");
	}
	
	protected void display() {
		System.out.println("Hello Everyone...");
	}
}

class Child extends Parent{
	
	public void sendResume() {
		
		System.out.println("Sending resume by email...");
	}
	public void display() {
		System.out.println("Welcome Everyone");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.sendResume();
		c.display();
	}

}
