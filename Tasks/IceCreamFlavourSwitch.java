package Tasks;

import java.util.Scanner;

public class IceCreamFlavourSwitch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Select an ice cream flavor:");
		System.out.println("1. Chocolate");
	    System.out.println("2. Strawbeey");
		System.out.println("3. Vanilla");
		System.out.println("4. ButterScotch");
	       
			int flavour = scanner.nextInt();
			
	        int price;

	        switch (flavour) {
	            case 1:
	            	price = 10;
	                break;
	            case 2:
	            	price = 20; 
	                break;
	            case 3:
	            	price = 30;
	                break;
	            case 4:
	            	price = 40; 
	                break;
	            default:
	                System.out.println("Please select a valid ice cream flavor.");
	                return; 
	        }
	        System.out.println("The price of your selected ice cream flavor is " + price +"rs.");

	}

}
