package fundamentals;

import java.util.Scanner;

public class ParametersTask1 {
	
public String info(String name, String email) {
		
		return "The name given:"+name+  "\nThe name given:"+email;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		ParametersTask1 pt= new ParametersTask1();
		
		System.out.println("Enetr the name:");
		String name = sc.nextLine();
		
		System.out.println("Enetr the email:");
		String email = sc.nextLine();
		
		String  message = pt.info(name,email);
		System.out.println(message);
		
		

	}

}
