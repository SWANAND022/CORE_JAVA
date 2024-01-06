package statementsAndLoops;

/*
 * for loop is used to execute repetitive task.
 * In the below given code the inner for loop is print 1 to 5 in a line.
 * The blank println is used to get the cursor to the next line.
 *  
 * 
 * Now this same task we want to do for 5 more time.
 * Hence we put the for loop which prints 1 to 5 inside another for loop so that the inner for loop runs for 5 more times.
 * 
 */

public class NestedforLoop {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
		for(int x=1;x<=5;x++) {
			
			System.out.print(x+" ");
		}
		System.out.println();
		}
	}

}
