package abstraction;

class Demo2{
	final public void show() {
		System.out.println("Hi I am show method..");
	}
}

class SubDemo2 extends Demo2{
	/*
	 * We are not able to override this method because show method is final and this 
	 * child class has to use it as it has been inherited.
	 * Meaning final method behaviour cannot be changed by overriding.
	 
	   public void show() {
		for(int i;i<=10;i++)
		{
			System.out.println(i);
		}
	}
	
	*/
}
public class FinalDemo2 {

	public static void main(String[] args) {
		
		

	}

}
