package Tasks;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=  new Scanner(System.in);
		
		System.out.println("Enter the width:");
		double b=sc.nextDouble();
		
		System.out.println("Enter the Height");
		double h=sc.nextDouble();
		double area=(b*h)/2;
		System.out.println("The Are Of Triangle is :"+area);

	}

}
