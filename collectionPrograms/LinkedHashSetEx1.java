package collectionPrograms;

import java.util.HashSet;

public class LinkedHashSetEx1 {

	public static void main(String[] args) {

		/*
		 * HashSet implements Set interface.
		 * 
		 * Properties:- 
		 *        1) Duplicates are not allowed.
		 *        2) Insertion order is maintained.
		 *        3) Members are not sorted.
		 *        4) Only one null values is allowed.
		 */
		
		HashSet<String> h= new HashSet<String>();
		h.add("Pen");
		h.add("Scale");
		h.add("Sharpner");
		h.add(null);
		h.add("Eraser");
		h.add("Sharpner");
		h.add("Protractor");
		
		System.out.println(h);

	}

}
