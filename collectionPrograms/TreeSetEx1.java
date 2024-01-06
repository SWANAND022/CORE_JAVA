package collectionPrograms;

import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {

		/*
		 *TreeSet implements sortedSet interface. SortedSet extends Set interface.
		 *
		 * 
		 * Properties:-
		 *        1) Duplicates are not allowed.
		 *        2) Insertion order is not maintained.
		 *        3) Members are sorted.
		 *        4) Null values are not allowed.
		 */

		TreeSet<Double> ts = new TreeSet<Double>();
		ts.add(5.97);
		ts.add(6.0);
		//ts.add(null);
		ts.add(7.24);
		ts.add(9.99);
		ts.add(6.0);
		ts.add(9.97);
		
		System.out.println(ts);
	}

}
