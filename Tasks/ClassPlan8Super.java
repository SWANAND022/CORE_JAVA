package Tasks;

class Vehicle3 {
    String brand = "Audi";

    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car extends Vehicle3 {
    String brand = "BMW";

    void displayBrands() {
        System.out.println("Car brand: " + brand);
        System.out.println("Vehicle brand: " + super.brand);
    }

    void start() {
        super.start();
        System.out.println("Car is Starting");
    }
}
public class ClassPlan8Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car();
        c.displayBrands();

        System.out.println("\nCalling start method here");
        c.start();

	}
}
