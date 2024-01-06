package arrayExample;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Arrays is a predefined class to manipulate the members of an array.
		 * In this class all methods are static.
		 */
		
		int[] numbers = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter any  numbers:" );
            numbers[i] = sc.nextInt();
        }
        
        
        //sort is a static method so we can call it with just class name
        Arrays.sort(numbers);
        
        System.out.println("In Ascending Order:");
    	for(int a : numbers) {
    		System.out.println(a);
    	}
    		System.out.println("Number 12 is at index:"+Arrays.binarySearch(numbers,12));
    		System.out.println("Members of array a="+Arrays.toString(numbers));
    	
        
        
	}

}
