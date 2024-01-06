package abstraction;

final class Demo3{
	String name="Swanand";
	int id =22;
	
	public void display() {
		System.out.println();
	}
}

// class SubDemo3 extends Demo3{} //you cannot inherit/extend the final class.

public class FinalDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo3 d=new Demo3(); //we can make an object class of final class. and cann call the mthods.		
		d.display();

	}

}
