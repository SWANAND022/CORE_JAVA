package abstraction.interfaces;
/*
 * Functional Interface is any interface having only one abstract method.
 */

interface Printable{
	public void print();
}


public class FunctionalInteface {
	/*
	 * Lambda expression is a vey quick way of givng implementation to an abstract method
	 * of a functional interface.
	 * 
	 * Syntax:-
	 *        functionalInetraceName variable =(parameter) -> {};
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Printable p = ()->{
			System.out.println("This is the implementation given in lambda expression..");
		};
		
		p.print();
		
	}

}
