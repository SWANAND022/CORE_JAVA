package collectionPrograms;

import java.util.PriorityQueue;

public class PriorityQueueEx1 {

	public static void main(String[] args) {

		
		/*
		 * Priority Queue Class implements interface.
		 * 
		 * Properties:=
		 *       1) It does not follow FIFO, by default the member having least priority will
		 *          be deleted.
		 *       2) Null values are not allowed.
		 *       3) Insertion order is not maintaind.
		 *       4) Members are not sorted.
		 *       5) Duplicates are allowed.
		 *       6) Only those classes which have implemented comparanle can be added to
		 *          priority queue, Otherwise we have to use comparator.
		 */
		
		PriorityQueue <Integer> pq = new PriorityQueue<Integer>();
		pq.add(1040);
		pq.add(24);
		pq.add(55);
		pq.add(75);
		//pq.add(null); NullPointException after adding null value.
		pq.add(94);
		
		System.out.println(pq);

		pq.poll();
		System.out.println("After polling:\n"+pq);
	}

}
