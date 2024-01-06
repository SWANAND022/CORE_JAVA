package arrayExample;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Enhanced For loop is known as foreach loop.
		 * This type of  loop is used to fetch from arrays or collection.
		 * 
		 * syntax:
		 *         for(arrDataType var : arrayName){}
		 *         
		 */
		
		double[] marks= {98.99,76.00,78.75,74.87,99.44};
		System.out.println("using normal for loop:");
		for(int i=0; i <marks.length; i++) {
			System.out.println(marks[i]);
			
		}
		
		System.out.println("\nusing enhanced for loop:");
		for (double m : marks) {
			
			System.out.println(m);
		}

	}

}
