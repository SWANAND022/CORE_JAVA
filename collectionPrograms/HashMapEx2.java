package collectionPrograms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) {

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("Maharashtra", "Mumbai");
		hm.put("Kerala", "Trivandrum");
		hm.put("Gujrat", "Gandhinagar");
		hm.put("UP", "Lucknow");
		hm.put("Tamil Nadu", "Chennai");
		
		System.out.println(hm);
		Set <String> states = hm.keySet();
		System.out.println("Keys : "+states);
		
		System.out.println("Values: ");
		Collection<String> cities = hm.values();
		System.out.print(cities);
		
		System.out.println("\nGetting each pair seperately in a set...");
		Set<Map.Entry<String,String>> pairs = hm.entrySet();
		Iterator<Map.Entry<String,String>> it = pairs.iterator();
		
		while (it.hasNext())
			System.out.println(it.next());
			
	}

}
