package stringPrograms;

import java.util.Scanner;

/*
 * Take the name of user .
 * Find out the mirror image of the given name.
 * James Gosling : gnilsoG semaJ
 * */

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name : ");
		String name=sc.nextLine();
		
		
		String reverse ="";
		for(int i=name.length()-1;i>=0;i--) {
			reverse=reverse+name.charAt(i);
		}
		System.out.println("Original Name =  "+name);
		System.out.println("Reverse Name = "+reverse);

	}

}
