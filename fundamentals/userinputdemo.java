package fundamentals;

import java.util.Scanner;

public class userinputdemo {
	
	public static void main(String[] args) {
		
	      Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Your UserName:");
		String username = sc.nextLine();
		System.out.println("Enter Your SurName:");
		String SurName = sc.nextLine();
		System.out.println("Enter Your EmailId:");
		String EmailId = sc.nextLine();
		System.out.println("Enter Your Location:");
		String Location = sc.nextLine();
		
		
		System.out.println("The name received:\t"+username);
		System.out.println("The Surname received:\t"+SurName);
		System.out.println("The EmailID received:\t"+EmailId);
		System.out.println("The Location received:\t"+Location);
	}
}
