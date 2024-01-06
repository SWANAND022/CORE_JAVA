package Exception;
/*
 * Object class is the parent of all java classes. 
 * 
 * In java, whenever an exception occurs jvm create one of the exception class object.
 * 
 * Lets see the exception hierarchy:-
 * Object 
 * Throwable class: This is the parent of all error and exception class.
 * 
 * Error Class: This class has many child classes whose objects are created at serious
 *               error code. As developer we need to solve those errors. 
 *               We should not handle them using try catch.
 * Eg :- StachOverFlowError,OutOfMemoryError. 
 *               
 *               
 * Exception: This is the parent of many exception type classes. These exceptions occur at
 *            error code which are not that serious.Hence we can handle them with try catch.
 * Eg:- ArithmeticException,ArrayIndexOutOFBoundException,NullPointException, ClassNotFoundException,FileNotFoundException.
 *             
 * 
 */

public class ExceptionTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Below we are trying to call a null mvalue hence at the line where we call
		 * chatAt method jvm will create the object of NullPointException class and
		 * terminate our program.
		 * 
		 *  We can handle this exception by writting try catch block.
		 */
		
		System.out.println("Welcome to this program...");
		String s=null;
		
		try {
	
		System.out.println(s.charAt(2));
		}
		catch(Exception e){
			System.err.println(e.getMessage());
		}
		System.out.println("Thank You for using our application..");
	}

}
