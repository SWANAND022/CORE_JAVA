package Tasks;
/*
 * Write a program to make an app movieticketapp.
 * this class should have two instance method and abstract method.
 * give implementaion to the abstract methods in child class bookmyshow. 
 */

abstract class MovieTicketApp{
	
	public void purchase() {
		System.out.println("You can purchase movie tickets by two ways..");
	}
	
	public void offline() {
		System.out.println("The tickets are selling offline at the location");
	}
	public abstract void online();
	
	public abstract void printTicket();
}

 class BookMyshow  extends MovieTicketApp {
	 public void online() {
		 System.out.println("You can purchase online tickets online on bookmyshow app...");
	 }
	 public void printTicket() {
		 System.out.println("You can print ticket details on bookmyshow app...");
	 }
 }

public class AbstractTask1 {

	public static void main(String[] args) {
		
		BookMyshow b = new BookMyshow();
		b.purchase();
		b.offline();
		b.online();
		b.printTicket();
	}

}
