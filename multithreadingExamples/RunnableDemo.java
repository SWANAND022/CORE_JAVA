package multithreadingExamples;

class MyThread1 implements Runnable{
	public void run() {
		
		for(int i=1;i<=10;i++) {
			
System.out.println("Is is raining in the background..");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MyThread2 implements Runnable{
	public void run() {
		
		for(int i=1;i<=10;i++) {
			
System.out.println("boy is walking...");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}



public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * When we implement Runnable interface then we will inherit only the run method.
		 * Since start method is Thread class method our class will not inherit this method.
		 * So we make Thread Class object and pass our class reference in its constructor,
		 * Hnece the start method of Threac class will call the run method of our class.
		 * 
		 * While making thread it is said that implementing Runnable interface is much
		 * better than extending thread class.
		 * Reasons:-
		 *  
		 *  1) We do not make our class unnecessarily bulky when we implement Runnable 
		 *  2) Since multiple inheritence is not allowed in java in case we extend Thread
		 *     class then we will be able to extend any other class. Hence implementing Runnable  
		 *     would be better.
		 */
		MyThread1 t1= new MyThread1();
		MyThread2 t2 = new MyThread2();
		
		Thread thread1 = new Thread();
		Thread thread2 = new Thread();
		
		thread1.start();
		thread2.start();
		
	}

}
