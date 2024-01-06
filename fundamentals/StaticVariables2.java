package fundamentals;

/*
 * If we want to access static variable of some other class then we can do it without creating object
 * of that class.
 * 
 *  We simply use that class name to access the static variable.
 *   */


public class StaticVariables2 {
	
	public static void main(String[] args) {
		
		StaticVariables sv = new StaticVariables();
		
		
		System.out.println("num1:"+sv.num1);
		
		//here we accessed static variable from other class
		System.out.println("num2:"+StaticVariables.num2);
		
	}

}
