package inheritance;
/*
 * MethodOverloading is the process of making methods of the same name in the same class.
 * 
 * Uses:-
 * It is used for increasing the readibility of the class.
 * 
 * How to do method Overloading:-
 * 1) Make Same name method in the same class.
 * 2) Parameters should be different.
 * 3) Parameters can be change on the following way:-
 *        a) Increase the number of parameters.
 *        b) Change the datatyape of parameter.
 *        c) Change the sequence of parameter's datatypes.
 */

class Calculator{
	public void add() {
		System.out.println("\nThis is the add method..");
	}
	public void add(char c,long d,double n) {
		System.out.println("a) Increase the number of parameters.");
	}
	public void add(int c,String d,float n) {
		System.out.println("b) Change the datatyape of parameter.");
	}
	public void add(float c,int d,String n) {
		System.out.println("c Change the sequence of parameter's datatypes.");
	}
	public void add(int i,int j) {
		System.out.println("The addition of int values:"+(i+j));
	}
	public void add(String s,String t) {
		System.out.println("The addition of two string:"+(s+t));
	}
	public void add(double d) {
		System.out.println("The addition of"
				+ " given double value:"+(d+d));
	}
}

public class MethodOverloading1 {

	public static void main(String[] args) {
		
		Calculator c= new Calculator();
		c.add('b', 128928, 12.22);
		c.add(10, "String", 88);
		c.add();
		c.add(10, 10);
		c.add("Swa","nand");
		c.add(10.00);

	}

}
