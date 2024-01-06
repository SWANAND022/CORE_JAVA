package stringPrograms;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter any word : ");
		String s=new Scanner(System.in).nextLine();
		/*Write a program to remove all the duplicate letter of this words happy birthday*/
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					c[i]=' ';
				}
			}
		}
		s=new String(c);
		s=s.replace(" ", " ");
		System.out.println(s);
		
		//		s = s.replace(" ", "").toLowerCase();
//		StringBuilder result = new StringBuilder();
//		for (int i = 0; i < s.length(); i++) {
//            char currentChar = s.charAt(i);
//            if (result.indexOf(String.valueOf(currentChar)) == -1) {
//                result.append(currentChar);
//            }
//        }
//		System.out.println("Original word: " + s);
//        System.out.println("Duplicate Words : " + result.toString());
	

	}

}
