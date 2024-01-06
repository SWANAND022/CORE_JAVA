package classAndObjects;

/*
 * POJO: is Plane Old Java Object.
 * 
 * It is a compilable class and contains only private variables constructors getter setters
 * and toString.
 * 
 * --> this keyword represents the current class object. Meaning we are representing the object
 * of the class in which we are writing this keyword.  
 * 
 * Since variables are private we will not be able to access them directly from other class.
 * We can set values in the variables by using:-
 *  1) Parameterized Constructors:-
 *  We used this keyword to declare the instance variables,and then we stored the data of local variables
 *  into the instance variable.
 *   
 * 2) Setters
 * Are public methods specifically used to set values to the private variables.
 * Syntax:-
 * public void setVariable(String variable) {
 * this.variable=variable;
 * }
 * 
 * If we do not have all details to be stored in the object, then we can call setters of only
 * those variables whose data we have.
 * 
 * The values of the private variables can be fetched in the other class by using getters or toString.
 * 1)Getters:
 * Are public methods specifically used to get the value that we stored in the instance variable.
 * 
 * Syntax:
 * public   variableDataType  getVariable()  {
 * 		return variable;
 * 	}
 * 
 */ 

class Customer{
	private String name;
	private String email;
	private long mobile;
	private boolean fresher;
	private String dob;
	private String education;
	private int noticePeriod;


public Customer() {
	System.out.println("This is an Anudip NGO");
}
/*
 * Below we are giving same variable identifier/name to instance variable and local variables.
 * 
 * So JVM could get confused between the two,hence we declare the instance variable names
 * by using this keyword.
 * 
 * Now JVM will understand that the data in local variables is to stored inside the instance variable.
 */

public Customer( String name, String email, long mobile, boolean fresher,String dob,String education,
	 int noticePeriod) {
	
	this.name=name;
	this.email=email;
	this.mobile=mobile;
	this.fresher=fresher;
	this.dob=dob;
	this.education=education;
	this.noticePeriod=noticePeriod;
	
}

public void display() {
	System.out.println("Name="+name);
	System.out.println("Email="+email);
	System.out.println("mobile="+mobile);
	System.out.println("fresher="+fresher);
	System.out.println("dob="+dob);
	System.out.println("education="+education);
	System.out.println("notocePeriod="+noticePeriod);
}
}

public class PojoClassDemo {
	
	public static void main(String[] args) {

		Customer c = new Customer("Swanand","swanand@gmail.com",12345L,true,"22 apr 2001","MCA",2);
		System.out.println("Printig details of Swanand");
		
		/*
		String n=c.getName();
		String e=c.getEmail();
		String d=c.getDob();
		String ed=c.getEducation();
		boolean f=c.getFresher();
		long mo=c.getMobile();
		int np=c.getNoticePeriod();
		*/
		c.display();
		
		Customer c1= new Customer();
		c1.display();
		
	}
}


