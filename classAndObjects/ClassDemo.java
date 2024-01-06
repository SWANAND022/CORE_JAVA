package classAndObjects;

import java.util.Scanner;

/*
 * Class : class is the template to write our code .
 *         class is the blueprint of the object.
 *         class is the group of member variables, methods and objects.
 *         
 * Object is the real life entity of a class.It has proper memory allocated for different variables and methods etc.
 * 
 * object is created with new keyword and then calling the constructor.
 * 
 * Constructor is a special method used to create object.
 * Syntax OF Constructor:-
 * 
 * AccessSpecifier    ClassName  (Parameters) {}
 *    public          ClassDemo       ()      {}   
 *    
 *    A class can have more than one constructor.This is known as constructor Overloading meaning 
 *    many constructor in one class with same name and diffrent parameters.
 *    
 *    
 */


public class ClassDemo {
	int a=10;
	
	public String display(String name) {
		System.out.println("This is te last day of our working week"+a);
		
		System.out.println("I am :"+name);
		
		return "Raksha Bandhan Is coming";
	}
	
	public ClassDemo() {
		System.out.println("I am The constructor of this class");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		Scanner sc= new Scanner(System.in);
		ClassDemo cd= new ClassDemo();
		
		String name="Swanand";
		
		String s= cd.display(name);
		
		System.out.println(s);
		

	}

}
