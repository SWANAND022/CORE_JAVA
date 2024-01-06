package stringPrograms;

public class ReplaceDemo {
	
	//It is like polymorphism means method overloading.
	public void display(char a, char b) {
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "Cook book";
		String word2=word.replace('o','e');
		System.out.println("Word : "+word);
		System.out.println("Word2 : "+word2);
		
		String word3=word.replace("Cook", "Computer");
		System.out.println("Word3 : "+word3);
		
		String message="The boy is standing on the road. The dog is sitting newr the boy";
		String message2=message.replace("boy", "girl");
		String message3=message.replaceFirst("boy", "girl");
		System.out.println("Original message : "+message);
		System.out.println("New message : "+message2);
		System.out.println("Third  message : "+message3);
		
		ReplaceDemo r =new ReplaceDemo();
		r.display('x', 'y');

	}

}
