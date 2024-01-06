package stringPrograms;

import java.util.Scanner;

/*
 * Count the number of vowels in the word given by user.
 */
public class Exercise2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  a name : ");
		String name=sc.nextLine();
		String word=name.toLowerCase();
		int count=0;
		for (int i = 0; i < word.length(); i++) 
		{
			char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                count++;
		    }
         }
		System.out.println("Original Name : "+name);
		System.out.println("Total no of vowels: " +count);

	}

}
