package Tasks;

import java.util.Scanner;

public class Task4 {
	
	public String show() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your name:");
		String name=sc.nextLine();
		
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Task4 tsk= new Task4();
		String studentname=tsk.show();
		 
		System.out.println("hello "+studentname + " Welcome to this java session.");
		

	}

}
