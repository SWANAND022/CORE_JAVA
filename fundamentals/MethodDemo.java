package fundamentals;

/*
 * Methods are a block of code which will execute only if it is called.
 * 
 * syntax:  -->
 * accessSpecifier returnType methodName(parameters){}
 *      public       void      display      ()      {} 
 *      
 *      
 *      accessSpecifier: It gives the scope of visibility for the method.
 *      -->Types of accessSpecifier : 
 *      
 *      1)public : It has the highest visibility.This type of method can be called from everywhere
 *                 even from another package.
 *                 
 *      2)protected : It has less visibility than public. It can be accessed by all class in same
 *                   package, but if we want to access the method in other package then it has to 
 *                   called from  a child class only.
 *                   
 *      3)Default : It has lesser visibility than protected. It can be accessed only by those class
 *                  which are in the same package only.We will never be able to access it from 
 *                  other package.
 *                  
 *      4)private : It is giving least visibility. This type of method will be seen only inside the
 *      	        same class.
 */
public class MethodDemo {
	
	public void display() {
		System.out.println("This is the method of MethodDemo class");
	}
	
	protected void show(){
		System.out.println("Iam the show method which is protected");
	}
	
	void add() {
		System.out.println("We are adding......");
	}
	
	private void subtract() {
		System.out.println("We are subtracting.....");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo md= new MethodDemo();
		md.subtract();
		
		
	}

}
