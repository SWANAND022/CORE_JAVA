package stringPrograms;

public class StringBufferEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*If we want to create mutable object of character sequence the we should use -
		 * -StringBuffer or StringBuilder
		 * 
		 * StringBuffer is synchronize and StringBuilder is asynchronize.
		 * StringBuffer and StringBuilder classes  are both used to create multiple string objects 
		 * The only difference between the two is the StringBuffer is thread safe whereas 
		 * StringBuilder is NOT thread safe.
		 * These are also classes that create mutable objects.
		 * 
		 * Concatination is the process of adding words or character to an existing string
		 * */
		StringBuffer sb=new StringBuffer("Anudip"); //These are mutable objects
		String s="Anudip";
		
		System.out.println("Before : ");
		System.out.println("s="+s+"\nsb="+sb);
		
		s.concat("Foundation");
		sb.append("Foundation");
		
		System.out.println("\nAfter : ");
		System.out.println("s="+s+"\nsb="+sb);

	}

}
