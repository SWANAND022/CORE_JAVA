package accessSpecifierDemo;

import fundamentals.MethodDemo;

public class Practice2 extends MethodDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodDemo md = new MethodDemo();
		md.display();
		
		
		// Below we are trying to call the protected show method of MthodDemo
		//Since it is protected , We will not be able to call it here directly.
		
		//First we have to make Practice2 class as child class by using extends keyword.
		//Because of this the show method will be inherited into Practice 2 class.
		//Now we can make the object of Practice2 and call the show method from this object.
		
		Practice2 p = new Practice2();
		p.show();
	}

}
