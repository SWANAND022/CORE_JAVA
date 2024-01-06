package arrayExample;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * create an array of int type size 5
		 * take user input to add data in the array 
		 * now sort the array in ascending order
		 */
		
		int[] numbers = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter any  numbers:" );
            numbers[i] = sc.nextInt();
        }
        
        for(int i=0; i<numbers.length;i++) {
        
        	
        	for(int j=i+1; j<numbers.length;j++) {
        		int temp=numbers[i];
        		
        		if(numbers[i]>numbers[j]) {
        			numbers[i]=numbers[j];
        			numbers[j]=temp;
        			
        		}
        	}
        	
       }
        System.out.println("In Ascending Order:");
    	for(int a : numbers) {
    		System.out.println(a);
    	}
	}

}
