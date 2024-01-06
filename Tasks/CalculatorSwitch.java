package Tasks;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter  first number:");
		int num1=sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter  Second number:");
		int num2=sc2.nextInt();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter the method for calculation:");
		String method= sc3.nextLine();
		
		int result;
		
		switch(method) {
		case "add":
			result=num1+num2;
			System.out.println("The addition is "+result);
		break;
		
		case "sub":
			result=num1-num2;
			System.out.println("The Subtraction is "+result);
		break;
		
		case "mul":
			result=num1*num2;
			System.out.println("The multiplication is "+result);
		break;
		
		case "div":
			result=num1/num2;
			System.out.println("The division is "+result);
		break;
		
		}
		
	}

}
