package Exception;

public class CompileTimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * below we are seeing an example pf compileTime Exception/checked exception.
		 * These types  of exceptions are checked by compiler and it forces us to handle the
		 * exception there itself. Program will not run until we handle the exception.
		 *  
		 */
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		System.out.println("We have reached the end of the program....");
	}

}
