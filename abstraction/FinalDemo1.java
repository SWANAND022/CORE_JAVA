package abstraction;
/*
 * Final keyword is used to make any memeber final meaning its value or behaviour cannot be
 * changed once it is declared final.
 * 
 * 
 */

class Demo1 {
	
	final int i=12;
	int j=20;
	
	public void display() {
		//i=20; //Cannot change the value of final variable.
	}
}

public class FinalDemo1 {

	public static void main(String[] args) {
		
		Demo1 d= new Demo1();
		//d.i=140; //Cannot change the value of final variable.
		d.j=12;
		
		
		

	}

}
