package collectionPrograms;

import java.util.HashSet;

public class HasSetEx1 {

	public static void main(String[] args) {

		/*
		 * HashSet implements Set interface.
		 * 
		 * Properties:- 
		 *        1) Duplicates are not allowed.
		 *        2) Insertion order is not maintained.
		 *        3) Members are not sorted.
		 *        4) Only one null values is allowed.
		 */
		
		HashSet<String> hs= new HashSet<String>();
		hs.add("Pen");
		hs.add("Scale");
		hs.add("Eraser");
		hs.add("Sharpner");
		hs.add("Protractor");
		
		System.out.println(hs);
		
		

	}

}
