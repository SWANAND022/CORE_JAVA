package statementsAndLoops;

import java.util.Scanner;

public class SwitchStatement1 {
	
	/*
	 * Switch statement is used when we know that a variable is going to have many possible values and we want 
	 * to give different output for different values.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter any color present in rainbow...");
		String color=sc.nextLine();
		
		switch(color) {
		
		case "Violet":
			System.out.println("Known as a royal color");
			break;
		case "Indigo":
			System.out.println("Ashok Chakra is of indifo color");
			break;
		case "Blue":
			System.out.println("Color of clear sky");
			break;
		case "Green":
			System.out.println("Nature and trees are of color green");
			break;
		case "Yellow":
			System.out.println("Sunflower has a beautiful yellow color");
			break;
		case "Orange":
			System.out.println("The fruit orange is orange in color too");
			break;
		case "Red":
			System.out.println("We stop at red signal");
			break;
		default :
			System.out.println("Please give names in only small letters and only those colors which are present in the rainbow");
		}
	}

}
