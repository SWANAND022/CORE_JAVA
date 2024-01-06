package Exception;

import java.util.Scanner;

class Demo2{
	public void display() throws ArithmeticException {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter First number:");
		int num1=sc.nextInt();
		
		System.out.print("Enter Second number:");
		int num2=sc.nextInt();
		
		
		int div=num1/num2;
		
		System.out.println("Answer="+div);
		System.out.println("Thnak you");
	}
}

public class ThrowsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			new Demo2().display();
			
		}
		catch(Exception e) {
			System.out.println("Could not calculate the division of given numbers...");
		}		
		System.out.println("visit again...");

	}

}
