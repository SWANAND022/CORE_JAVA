package Tasks;

public class LambdaTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r1 =()->{
			for(int i=1;i<=4;i++) {
				System.out.println("Indian team qualifies for the semi finals");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		
		Runnable r2= ()->{

			for(int i=1;i<=10;i++) {
				System.out.println("Indian team will be playing final");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Thread t1=new Thread(r1);
		Thread t2= new Thread(r2);
		
		t1.start();
		t2.start();
	}

}
