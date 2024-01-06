package classAndObjects;

public class ConstructorDemo1 {
	
	public ConstructorDemo1(){
		System.out.println("this is the non-parameterized construcor.");
	}
	
	public ConstructorDemo1(String s) {
		System.out.println("The string data given:"+s);
	}

	public ConstructorDemo1(String s, int i) {
		System.out.println("This constructor has two parameters");
		System.out.println("String data is :"+s+"\nThe Int data is :"+i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * We can make more than one object of the same class.
		 * It is our wish how we want to create the object, we can use any of the constructors available to us to make object.
		 * 
		 */

		ConstructorDemo1 cd= new ConstructorDemo1("Swanand",10);

		ConstructorDemo1 cd1= new ConstructorDemo1("Swanand");

		ConstructorDemo1 cd2= new ConstructorDemo1();
		
	}

}
