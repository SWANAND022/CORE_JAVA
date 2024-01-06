package stringPrograms;

public class Example1 {

	public static void main(String[] args) {
		
		String s="Swanand"; //using literals
		System.out.println("s  ="+s);
		
		/* 
		 * making String objects with new keyword
		 * We have called the empty constructor to make this object
		 */
		String s1 = new String(); 
		System.out.println("s1 ="+s1);
		
		String s2 = new String("Java"); //parametarized string 
		System.out.println("s2 ="+s2);
		
		String s3 = new String(s); //called variable value
		System.out.println("s3 ="+s);
		
		char symbols[]= {'*','&','%','$'}; //array
		/*
		 * Below we are makinh the ovject of the string class by calling  the constructor
		 * which accepts a character type array.
		 * When we print s4 we can see that all characters of the array has been added
		 * as one single string in s4.
		 */
		String s4 =new String(symbols);
		System.out.println("s4 ="+s4);
	}

}
