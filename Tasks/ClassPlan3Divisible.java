package Tasks;

import java.util.Scanner;

public class ClassPlan3Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number=");
		int num = sc.nextInt();
		
		if(num%5==0 && num%7==0) {
			System.out.println(num+" is divisable by both 5 and 7");
		}
		else {
			System.out.println(num+" is not divisable by both 5 and 7");
		}

	}

}
