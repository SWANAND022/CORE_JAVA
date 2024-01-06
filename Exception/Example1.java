package Exception;

/*
 * Exception is something that occurs out of the ordinary.
 * In java programs exceptions occur when jvm doest not execute all the line of code in the
 * program, it terminates the program in between due to some error code. This is known as 
 * exception.
 * 
 * Definition:- Exception is the abrupt termination of the program without the end point.
 *  
 * When an exception occurs, i.e. jvm terminates the program abruptly one of the exception
 * class object is created at the error code.
 * As developers we need to know how to handle such abruprt interuptions and get the program 
 * to be executed to the last line of code.
 * This is done by exception handline. 
 * 
 * Types Of Exception:-
 * 
 * 1)RunTimeException:  All sub classes of the RunTimeException class is also known as of type 
 *                      RunTimeException.
 *                      These Exceptions are not checked by the compiler while compiling your code.
 *                      We as developers come to know that such exception are occuring only after 
 *                      we run the program. 
 *                    
 * 2) CompileTimeException: These types  of exceptions are checked by compiler and it forces 
 *                          us to handle the exception there itself. Program will not run 
 *                          ntil we handle the exception.
 * 
 */


public class Example1 {

	public static void main(String[] args) {
		
		
		System.out.println("Hello everyone");
		System.out.println("Todays is the first day of the week");
		
		try {
		int div = 10/0;
		}
		catch(Exception e) {
			System.err.println("An exception has occured!");
			System.out.println("Reason For exception");
			System.err.println(e.getMessage());
		}
		for(int i=1; i<=10 ;i++) {
			System.out.print((i+" "));
			
		}
		System.out.println("\nBye everyone");
	}

}
