package collectionPrograms;

import java.util.Enumeration;
import java.util.Stack;

public class StackEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Stack slass extends vector class hence we see similar properties as vector.
		 * we can use Enumeration with stack also.
		 * 
		 * Stack follows LOFO(Last in first out)
		 * 
		 * push method is used to add members in the stack.
		 * pop method is used to delete the member that was added to the stack last.
		 * 
		 */
		
		Stack<String> s= new Stack <String> ();
		s.push("january");
		s.push("Feb");
		s.push("March");
		s.push("April");
		
		System.out.println("Before :\n"+s);
		
		s.pop();
		
		System.out.println("After Popping:\n"+s);
		Enumeration<String> e = s.elements();
		while(e.hasMoreElements())
		System.out.println(e.nextElement());
	}

}
