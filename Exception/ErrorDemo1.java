package Exception;

/*
 * Error is also a child class of throwable.
 * Errors occurs on code that are dangerous or very serious and these codes should not be 
 * handeled by try catch.They have to rectified and solved immediately.
 */

class EDemo1{
	
	/*
	 * This will create StackOverFlowError because the methods are called infinitely 
	 */
	
	public void display() {
		
		display(); //error
	}
}

public class ErrorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new EDemo1().display();
		
		//this will create OutOfMemoryError because the array size is too big
		int[] arr= new int[1000000000];
		
		

	}

}
