package inheritance;

/*
 * Java follows OOPS concepts.
 * 
 * main pillars of OOPS:-
 * 
 * 1)Inheritance - reusing the code of one class into another.
 * 2)Abstraction
 * 3)Polymorphism - Same name different behaviour.
 * 4)Encapsulation - protecting the class or class members by using Access Specifier.
 * 
 * 
 * Inheritance is the process of inheriting the members of another class into our own class.
 * this is done by making our class the child/sub class of another.
 * 
 * Parent class is also known as base or super class.
 * Child class is also known as derived or sub class of some other class.
 * 
 * Note:=
 * extends is a keyword used to make our class a child class of some other class.
 * extends keyword can make only one class as our parent class. We cannot make multiple classes
 * as parent.Therefore multiple inheritance is not allowed in java.
 * 
 * Types of Inheritance:=
 * 1) Single inheritance :-     One parent and one child class.
 * 2) Multi-level inheritance:- One parent has one child class and this child class is parent to 
 *                              another child.
 * 3) Multiple Inheritance                           
 *                              
 */

class  MobileApp {
	public void textMessage() {
		System.out.println("Sending text message....");
	}
	public void  voiceCall() {
		System.out.println("Voice call connecting....");
	}
}

class MyApp extends MobileApp{
	public void videoCall() {
		System.out.println("Video Call starting...");
	}
}

class SwanandApp{
	public void TempText() {
		System.out.println("Text will be deleted after 24 hours...");
	}
}


public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyApp ma= new MyApp();
		ma.textMessage();

	}

}
