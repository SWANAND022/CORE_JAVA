package Tasks;

import java.util.Scanner;

public class VowelOrConstant {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any alphabet: ");
        char c = scanner.next().charAt(0);

        scanner.close();

        // Check if the input is a lowercase vowel
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println(c + " is a vowel with lowercase.");
        }
        // Check if the input is an uppercase vowel
        else if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            System.out.println(c + " is an vowel with uppercase.");
        }
        // Check if the input is a valid alphabet
        else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.println(c + " is a consonant.");
        } else {
            System.out.println("You entered wrong details.Please enter a single alphabet.");
        }

	}

}
