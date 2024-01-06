package abstraction;
/* 
 * Abstraction is another pillar of OOPS concept.
 * 
 * In java we achieve abstraction by making abstract method.
 * Abstract methods do not have their own method body.They only have method signature.
 * These abstract method are given implementation/method_body by child classes according to their requiremnts.
 * 
 * Points to remember:=
 * 
 * 1) Abstract method can only be declared by using abstract keyword.
 * 2) An abstract method can only be made inside an abstract class,meaning if your class
 *    has an abstract method, then it is compulsory to declare the class also abstract.
 * 3) We cannot make the object of abstract calss because our class is incomplete since it
 *    has abstract class.
 * 4) Any child class of an abstract parent class has to be give implementation to the 
 *    abstract method.
 * 5) If a child class does not want to give implementation to the abstract method
 *    inherited from parent class, then it will have too declare itself as abstract.
 * 6) Abstract class can have constructrs.We cannot call this constructor directly after new
 *    keyword We have to call it with super keyword from child class constructor.
 * 7) Abstract keyword and final keyword can never be used together.
 */

abstract class Robot1{
	
	public void talking() {
		System.out.println("The robot is talking...");
	}
	public void cleaning() {
		System.out.println("The robot is cleaning...");
	}
	/*
	 * Below we are seeing an abstract method.
	 * This type of method does not contain method body.
	 */

	public abstract void dancing();
}

class SanketRobot extends Robot1{
	
	public void dancing() {
		
		System.out.println("My robot is doing break dance");
	}
}

class PratimaRobot extends Robot1{
	
	public void dancing() {
		System.out.println("My robot is doing bharatnatyam");
	}
}

abstract class DhananjayRobot extends Robot1{
	public void protectIndia() {
		System.out.println("Protect");
	}
	public void buildingMachines() {
		System.out.println("Building machines");
	}
}

class RutujaRobot extends DhananjayRobot{
	public void dancing() {
		System.out.println("Robots is doing kathak..");
	}
}

public class Example1 {

	public static void main(String[] args) {
		System.out.println("Sanket Robot-");
		SanketRobot sr= new SanketRobot();
		sr.dancing();
		sr.talking();
		sr.cleaning();
		System.out.println("\nPratima Robot-");
		PratimaRobot pr=new PratimaRobot();
		pr.cleaning();
		pr.dancing();
		pr.talking();
			
		
	}

}
