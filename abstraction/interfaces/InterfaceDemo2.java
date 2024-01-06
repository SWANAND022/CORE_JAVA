package abstraction.interfaces;

interface Demo2{
	
	int i=100;
	String name="Swanand";
	
}

public class InterfaceDemo2 {

	public static void main(String[] args) {

		System.out.println("i ="+Demo2.i); //proven that it is static.
		
		/*
		 * As seen below we will never be able to create the object of an interface.
		 * Demo2 d= new Demo2();
		 */
		

	}

}
