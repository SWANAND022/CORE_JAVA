package fundamentals;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name:");
		String name= sc.nextLine();
		
		System.out.print("Enter your marks:");
		double marks= sc.nextDouble();
		
		System.out.print("Enter if you are fresher or not(Answer in true or false):");
		boolean fresher= sc.nextBoolean();
		
		System.out.print("Enter you mobile number:");
		long contact= sc.nextLong();
		
		System.out.println("*********** Datails Given *************");
		System.out.println("Name:"+name);
		System.out.println("Marks:"+marks);
		System.out.println("Fresher:"+fresher);
		System.out.println("Contact:"+contact);
	}

}
