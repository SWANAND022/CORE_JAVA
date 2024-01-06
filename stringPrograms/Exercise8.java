package stringPrograms;

public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String message= "Hi everyone!! Weekend is here!!";
		/*Write a program to count the number of words in the given string*/
		String [] words=message.split(" ");
		//int wordCount=words.length;
		System.out.println("Number of words in the string : "+words.length);

	}

}
