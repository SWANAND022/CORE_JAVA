package collectionPrograms;

import java.util.ArrayDeque;

public class ArrayDequeueEx1 {

	public static void main(String[] args) {

		/*
		 * Array Deque class implements dequeue interface.
		 * 
		 * Properties:- 
		 *       1) Null value not allowed.
		 *       2) Insertion order maintainer.
		 *       3) Members are not sorted.
		 *       4) Duplicates are allowed.
		 *       5) We can add and remove members from both of the Arraydeque because it is a
		 *          doubly ended quueue.
		 */
		ArrayDeque<String> colors = new ArrayDeque<String>();
		colors.offer("Red");
		colors.add("pink");
		colors.add("blue");
		colors.add("black");
		colors.add("grey");
		
		System.out.println(colors);
		
		colors.poll();
		System.out.println(colors);

	}

}
