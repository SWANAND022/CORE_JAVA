package Tasks;

import java.util.Scanner;

public class GretestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number:");
		int num1=sc.nextInt();
		
		System.out.print("Enter Second number:");
		int num2=sc.nextInt();
		
		System.out.print("Enter Third number:");
		int num3=sc.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("num1 is greater");
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println("num2 is greater");
		}
		else
		{
			System.out.println("num3 is greate");
		}
	}

}
