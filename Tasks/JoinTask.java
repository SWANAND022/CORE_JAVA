package Tasks;

class Designation extends Thread{
public Designation(String n) {
	 super(n);
}

public void run() {
	 System.out.println(getName() + " is a developer");
	 try {
		 Thread.sleep(1000);
	 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
	 System.out.println(getName()+ " is a tester");
  }
}


public class JoinTask extends Thread {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Designation d = new Designation("Aryan");
		Designation d2 = new Designation("Sahil");	
		
		d.start();
		d2.start();
		
		try {
			d.join();
			d2.join();
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		System.out.println("There ar two types of designation");
		

	}
}



