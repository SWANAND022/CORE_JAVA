package Tasks;

import java.util.Scanner;

public class CalculateDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		
		
		int count=0;
		
		for(int num=sc.nextInt();num>0;num=num/10)
		{
			count++;
		}
		System.out.println("the number of digits present in num is:"+count);

	}

}
