package fundamentals;

import java.util.Scanner;

public class ParametersDemo1 {

	public int add(int num1, int num2) {
		
		return num1+num2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		ParametersDemo1 pd = new ParametersDemo1();
		
		System.out.println("Enter first numer:");
		int i = sc.nextInt();
		
		System.out.println("Enter Second numer:");
		int j = sc.nextInt();
		
		int total = pd.add(i, j);
		
		System.out.println("The total is :"+total);

	}

}
