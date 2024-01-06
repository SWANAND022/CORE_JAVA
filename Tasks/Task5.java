package Tasks;

import java.util.Scanner;

public class Task5 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your marks:");
		float marks=sc.nextFloat();
		
		float percentage=(marks/500)*100;
		System.out.println("The percentage:"+percentage);
	}

}
