package Tasks;

public class ClassPlan9Area {
	
	
	static double calculateArea(double length, double width) {
        return length * width;
    }

    static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    static double calculateArea(double base, double height, String shape) {
        
            return 0.5 * base * height;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Area of Rectangle: " + calculateArea(5, 8));

        System.out.println("Area of Circle: " + calculateArea(4.5));

        System.out.println("Area of Triangle: " + calculateArea(4, 6, "triangle"));

	}

}
