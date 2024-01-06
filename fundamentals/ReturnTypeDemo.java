package fundamentals;

import java.util.Scanner;

/*
 * Return Type declare the type of value that the method is going to return.
 */

public class ReturnTypeDemo {

	public void diaplay() {
		System.out.println("This willl not return anything...");
	}
	
	public int add() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		
		System.out.println("Enter Second number");
		int num2=sc.nextInt();
		
		int total=num1+num2;
		return total;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnTypeDemo rt= new ReturnTypeDemo();
		rt.diaplay();

		int answer=rt.add();
		System.out.println("Answer is:"+answer);
	}

}
