package collectionPrograms;

import java.util.HashMap;

public class HashMapEx1 {

	public static void main(String[] args) {
		/*
		 * HashMap :=
		 * 
		 * Properties:-
		 *       1) Insertion order is not maintained.
		 *       2) Members are not sorted.
		 *       3) Keys cannnot be duplicate, but value can be duplicates.
		 *       4) Only one null key is allowed, multiple null values are allowed.
		 *       
		 */
		HashMap<String, Long> contacts = new HashMap<String, Long>();
		contacts.put("Swanand", 7507473936l);
		contacts.put("Sahil", 97857473936l);
		contacts.put("Shreyas", 24567473936l);
		contacts.put("Salman", 73837473936l);
		contacts.put("Shahrukh", 827673936l);
		contacts.put("Amir", 8207473936l);
		
		System.out.println(contacts);
		
		System.out.println("Contact no. of swanand: "+contacts.get("Swanand"));
		
		
	}

}
