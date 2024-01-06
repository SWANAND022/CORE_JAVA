package stringPrograms;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Write a program to take user input of any word.
		 * Example :
		 * String s="Anudip";
		 * Print pattern as following : 
		 * pidunA
		 * pidun
		 * pidu
		 * pid
		 * pi
		 * p
		 * */
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter  any word : ");
				String word=sc.nextLine();
				for (int i = 0; i <= word.length(); i++) {
		            for (int j = word.length()-1; j >=i; j--) {
		                System.out.print(word.charAt(j));
		            }
		            System.out.println();
		        }

	
	}
}
