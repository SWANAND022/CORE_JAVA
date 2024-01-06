package collectionPrograms;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		
		/*
		 * Vector class is a legacy class, meaning it was introduced before the collection
		 * framework. Later on vector class implemented list and interface and became a part of 
		 * collection.
		 * 
		 * Enumeration is an interface used to fetch members from legacy collectionsuch as vectorstach etc
		 * 
		 */
		
		Vector<String> v= new Vector<String>();
		v.add("Saturday");
		v.add("Friday");
		v.add("Thursday");
		v.add(null);
		v.add("Wednesday");
		v.add("Tuesday");
		v.add("Monday");
		System.out.println(v);
		
		
		System.out.println("\nUsing Enumeration...");
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
}
}
