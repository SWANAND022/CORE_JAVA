package arrayExample;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 5 numbers..");
		
		for(int i=0; i<=a.length; i++) {
			System.out.println("Enter number:");
			a[i]=sc.nextInt();
					
		}
		System.out.println("\nPrinting all even numbers..");
		for(int i=0; i<a.length; i++) {
			
			if(a[i]%2==0) 
				System.out.println(a[i]);
			
		}

	}
	
}
