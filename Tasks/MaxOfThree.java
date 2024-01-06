package Tasks;

public class MaxOfThree {

	public static void main(String[] args) {
		
		    int a =21;
	        int b =22;
	        int c =23;

	        int grt = a;

	        if (b > grt) {
	            grt = b;
	        }

	        if (c > grt) {
	            grt = c;
	        }

	        System.out.println("The maximum of the three numbers is: " + grt);

	}

}
