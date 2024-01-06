package multithreadingExamples;

class Account{
	
	int balance=10000;
	
	public void withdraw(int wAmount) {
		if(balance <=wAmount) {
			System.out.println("insufficient Balance");
		}
		else {
			balance-=wAmount;
			System.out.println("Amount Withdrawn successfullly...\nCurrent Balance is:"+balance);
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}

public class Synchronization1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
