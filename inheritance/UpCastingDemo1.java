package inheritance;

class LivingThings{
	public void movement() {
		System.out.println("This being is moving...");
	}
}

class Birds extends LivingThings{
	
	public void layingEggs() {
		System.out.println("The Bird is laying eggs...");
	}
}

public class UpCastingDemo1 {

	public static void main(String[] args) {
		
		/*
		 * b is the reference variable which is pointing to the memory location where the object 
		 * of birds class is made.
		 */
		
		Birds b = new Birds(); 
		b.movement(); 
		
		/*
		 * Below we are seeing upcasting. Here we are making object of child class and referring it
		 * with a variable of the parent types.
		 */
		
		LivingThings lt = new LivingThings();
	    lt.movement();
		
		

	}

}
