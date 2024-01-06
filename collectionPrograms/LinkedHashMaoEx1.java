package collectionPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMaoEx1 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * LinkedHashMap:- LinkedHashMap is similar to hasmap, only difference is that 
		 *                 insertion order maintained in LinkedHashMap.
		 */
		
		LinkedHashMap<String, String> hm = new LinkedHashMap<String, String>();
		hm.put("Maharashtra", "Mumbai");
		hm.put("Kerala", "Trivandrum");
		hm.put("Gujrat", "Gandhinagar");
		hm.put("UP", "Lucknow");
		hm.put("Tamil Nadu", "Chennai");
		
		System.out.println(hm);

	}

}
