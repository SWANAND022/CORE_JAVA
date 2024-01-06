package stringPrograms;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Take a user input of name,city,graduation.
		 * Write a program where at the end a should have all details added in the blanks.
		 */
		String s="Hi my name is  _. I am from  _. I have done graduation in _.";
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter  name : ");
		String name=sc.nextLine();
		
		System.out.println("Enter  location.");
		String location=sc.nextLine();
		
		System.out.println("Enter  education.");
		String education=sc.nextLine();
		
		s=s.replaceFirst("_", name);
		s=s.replaceFirst("_", location);
		s=s.replaceFirst("_", education);
		
		System.out.println(s);
		

	}

}
