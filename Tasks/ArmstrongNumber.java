package Tasks;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int number = scanner.nextInt();

        int Number = number;
        int numDigits = countNum(number);
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }

        if (sum == Number) {
            System.out.println(Number + " is an Armstrong number.");
        } else {
            System.out.println(Number + " is not an Armstrong number.");
        }

	}
	
	 public static int countNum(int num) {
	        int count = 0;
	        while (num > 0) {
	            num /= 10;
	            count++;
	        }
	        return count;
	    }
}
;