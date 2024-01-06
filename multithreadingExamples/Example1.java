package multithreadingExamples;
/*
 * Multhreading is a type of multitasking.
 * In multhreading we can execute two or more threads simultaneously.
 * Thread is the smallest unit of the code that can be run seperately.
 * 
 * To make a tread we can use Runnable interface or Thread class.
 * 
 * Runnable Interface: It is a functional interface and it has only one abstract method that 
 *                     is public void run(){} method.
 * 
 * Thread class: Thread class implements Runnable interface , hence run method is inherited
 *               by thread class from runnable interface. Apart from this thread class has many
 *               other predefined methods such as start(), setPriority(), getPriority() etc.
 */
class Animation{
	public void walking() {
		
		for(int i=1;i<=10;i++) {
			System.out.println("Boy is walking");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void singing() {
		
		for(int i=1;i<=10;i++) {
			System.out.println("Boy is singing");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void raining() {
		
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

class Thread1 extends Thread{
	Animation a;
	Thread1(Animation a){
		
		this.a=a;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		a.walking();
	}
}

class Thread2 extends Thread{
	Animation a;
	Thread2(Animation a){
		
		this.a=a;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		a.singing();
	}
}

class Thread3 extends Thread{
	Animation a;
	Thread3(Animation a){
		
		this.a=a;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		a.raining();
	}
}

public class Example1 {
	
	public static void main(String[] args) {
		
		Animation a= new Animation();
		
		Thread1  t1 = new Thread1(a);
		Thread2  t2 = new Thread2(a);
		Thread3  t3 = new Thread3(a);
		
		t1.start();
		t2.start();
		t3.start();
				
	}

}
