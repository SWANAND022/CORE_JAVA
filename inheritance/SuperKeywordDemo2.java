package inheritance;

/*Question:=
 * Write a program  where oppo is a parent class and realme is child class of oppo.
 * both oppo and realme should have same instance method sales.
 * try calling both method from realme object.
 */

/*
 * Super Keyword can also be used to call the method of the parent class.
 * 
 */

class Oppo {
	String name="SmartPhone";
	public void sales() {
		System.out.println("Oppo Products");
	}
}

class Realme extends Oppo{
	public void sales() {
		System.out.println("______");
		System.out.println("Realme Products");
		System.out.println("Calling Parent Oppo here,"+super.name);
		super.sales();
	}
}

public class SuperKeywordDemo2 {

	public static void main(String[] args) {
		
		//Oppo o=new Oppo();
		//o.sales();
		
		Realme r=new Realme();
		r.sales();

	}

}
