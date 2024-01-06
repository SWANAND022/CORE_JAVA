package Tasks;

public class Vehicle {
	
	public Vehicle() {
		System.out.println("This is a car");
	}
	public Vehicle(String Bike) {
		System.out.println("This is a Bike name="+Bike);
	}
	public Vehicle(String Scooty,String Model) {
		System.out.println("This is Scooty name="+Scooty+" And Model="+Model);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v= new Vehicle();
		Vehicle v1=new Vehicle("Passion");
		Vehicle v2=new Vehicle("Activa ","6G");
	}

}
