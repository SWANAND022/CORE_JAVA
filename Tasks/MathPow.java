package Tasks;

import java.util.Scanner;

public class MathPow {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();

        System.out.print("Enter the exponent: ");
        int exp = scanner.nextInt();


        long ans = 1;

        for (int i = 0; i < exp; i++) {
            ans *= base;
        }

        System.out.println(base + "^" + exp + " = " + ans);
	}

}
