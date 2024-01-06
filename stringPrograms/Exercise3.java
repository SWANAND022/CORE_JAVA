package stringPrograms;

import java.util.Scanner;

/*Take a word from the user .
 * Create a unique password from it where all
 * a-->@
 * e-->3
 * i-->1
 * o-->*
 * u-->$
 * */

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  any word : ");
		String word=sc.nextLine();
		word=word.replace('a', '@');
		word=word.replace('e', '3');
		word=word.replace('i', '1');
		word=word.replace('o', '*');
		word=word.replace('u', '$');
		System.out.println("Password : "+word);

	}

}
