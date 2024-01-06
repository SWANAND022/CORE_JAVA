package Tasks;

/*
 * Need and Uses of ToString() method:-
 * 
 *   1) It allows you to concatenate an object (such as an Integer) to a string.
 *   2) Sometimes you can do this just by appending an empty string to that object 
 *      (e.g. "" + my_int will produce a string) because under the hood Java calls my_int's 
 *      toString() method to convert it for you.
 *   3) Returns a string representation of the object. 
 *   4) The result should be a concise but informative representation that is easy for a 
 *      person to read. It is recommended that all subclasses override this method.
 *   5) Since toString() method simply returns the current string without any changes, 
 *      there is no need to call the string explicitly, it is usually called implicitly.
 *      
 */


public class CarLab {
	
	private int carid;
    private String engineType;
    private String color;
    private String brand;

    // Constructor
    public CarLab(int carid, String engineType, String color, String brand) {
        this.carid = carid;
        this.engineType = engineType;
        this.color = color;
        this.brand = brand;
    }
    
    public void setCarId(int carId) {
        this.carid = carId;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public int getCarId() {
        return carid;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }
    
    
	
	@Override
	public String toString() {
		return "CarLab [carid=" + carid + ", engineType=" + engineType + ", color=" + color + ", brand=" + brand + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarLab c = new CarLab(22, "Electric", "Blue", "Audi");
		
		 System.out.println("Car ID: " + c.getCarId());
	     System.out.println("Engine Type: " + c.getEngineType());
	     System.out.println("Color: " + c.getColor());
	     System.out.println("Brand: " + c.getBrand());

	}

}
