package inheritance;
/*
 * Write a program where a car run on a diffrent types of fuels.
 * example petrol and cng.
 */

class Car{
	public void fuels() {
		System.out.println("Car runs on different fuels");
	}
	public void fuels(int a) {
		System.out.println("Current Price of cng:"+a+"rs.");
	}
	public void fuels(double a) {
		System.out.println("Current price of petrol:"+a+"rs.");
	}
	public void fuels(String a,String b) {
		System.out.println("Car runs on different fuels Like "+a+" and "+b+"...");
	}
}

public class MethodOverloadingPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.fuels();
		c.fuels(80);
		c.fuels(106.9);
		c.fuels("CNG", "PETROL");
		

	}

}
