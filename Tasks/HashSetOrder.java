package Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSetOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> h = new HashSet<String>(); 
		  
	       
        h.add("Oppo"); 
        h.add("Samsung"); 
        h.add("Vivo"); 
        h.add("Redmi"); 
        h.add("Oneplus"); 
        h.add("Apple"); 
  
        System.out.println("Original Set: "+ h); 
  
        
       ArrayList<String> sorted= new ArrayList<String>(h); 
        Collections.sort(sorted); 
  
       System.out.println("Sorted Set: "+ sorted); 

	}

}
