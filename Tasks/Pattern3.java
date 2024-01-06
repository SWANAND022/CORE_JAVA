package Tasks;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		for (int i = 1; i <= 5; i++) {
        	System.out.println(" ");
			
            for (int j = 5; j >= i; j--) 
            {
                System.out.print( " "+j);
            }
            
            System.out.println("");
        }
	}

}
