package stringPrograms;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Take any word from user and print it in the following pattern.
		 * Example : James.
		 * James
		 * Jame
		 * Jam
		 * Ja
		 * J
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  any word : ");
		String word=sc.nextLine();
		for (int i = word.length()-1; i >=0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }

	}

}
