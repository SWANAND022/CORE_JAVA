package multithreadingExamples;

class Warehouse {
	int furnitureStock=100;
	
	public synchronized void addFurniture(int add) {
		if (furnitureStock>=50) {
			
			try {
				System.out.println("Manufacturer is waiting");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			furnitureStock+=add;
			System.out.println("Manufacturer Adding more furniture.."
					+ "\nCurrent no. of furniture = "+furnitureStock);
			
		}
	}
	
	public synchronized void removeFurniture(int add) {
		if (furnitureStock<50) {
			
			try {
				System.out.println("Buyer is waiting");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			furnitureStock-=add;
			System.out.println("Manufacturer removing furniture.."
					+ "\nCurrent no. of furniture = "+furnitureStock);
			
		}
	}
}

class Manifacturer extends Thread{}

class Buyer extends Thread{}

public class waitNotifyDemo {

	public static void main(String[] args) {
		
		

	}

}
