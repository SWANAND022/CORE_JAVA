package inheritance;

/*
 * extends keyword can make only one class as our parent class. We cannot make multiple classes
 * as parent.Therefore multiple inheritance is not allowed in java.
 * 
 * The reason for not allowing multiple inheritance in java is because of ambiguity error.
 * Ambiguity error is when a class has two methods of the same signature.If this happens, then
 * JVM will get confused as to which method has to be called.
 * 
 * If a class is allowed to have multiple parents then there is a possibility that the parents 
 * have the same exact methods and consequently these same methods will be inherited by the 
 * child.
 * This will again lead to ambiguity error.
 * Hence multiple inheritance is not allowed in java.
 *  
 */
class C{
	public void display() {
		System.out.println("***");
	}
	public void display(String img) {
		System.out.println("###");
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C c= new C();
			c.display();  //It will print *** 
			
	}

}
