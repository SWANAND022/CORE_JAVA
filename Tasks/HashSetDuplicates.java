package Tasks;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<>();

	     
        list.add("swanand");
        list.add("sahil");
        list.add("shreyas");
        list.add("sneha");
        list.add("saiee");
        list.add("swanand");

        System.out.println("List Before Removing Duplicates: " + list);

       
        HashSet<String> h = new HashSet<>(list);

        
        list.clear();


        list.addAll(h);

        System.out.println("List After Removing Duplicates:: " + list);


	}

}
