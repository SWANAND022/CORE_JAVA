package arrayExample;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * create a new int type array b of size 5.
		 * The members should be double of the member in array a
		 */

		int [] a = {1,2,3,4,5};
		
		int[] b = new int[5];

		for (int i = 0; i < a.length; i++)
		{
            b[i] = 2 * a[i];
            System.out.println(b[i]);
            
        }
		
		//System.out.println("here we double the member of a in array b:");
        //for (int num : b)
        //{
           // System.out.println(num+"");
        //}
		
		

		
	}

}
