package abstraction.interfaces;
/*
 * Interfaces are template of a class.We use it to create a basic structure for the class.
 * 
 * Points to remember:-
 * 
 * 1) All methods in the interface are automatically considered as public and abstract, we do 
 *    not have to add the keywords public or abstract.
 * 2) All variables in the interface are automatically public, static and final.
 * 3) Interface objects cannot be created.
 * 4) Interfaces do not have constructors.
 * 
 */

interface ClothingApp{
	public String addToCart (String s);
	public double coupon(String code);
}


class ShyamApp implements ClothingApp{

	@Override
	public String addToCart(String s) {
		
		return "Thank you for adding"+s+"in your cart..";
	}

	@Override
	public double coupon(String code) {
		
		
		
		return 0;
	}
	
	class ChanchalApp implements ClothingApp{

		@Override
		public String addToCart(String s) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public double coupon(String code) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
}
public class InterfacesDemo1 {

	public static void main(String[] args) {
		
		
		
		
}

}
