package fundamentals;


public class StaticVariables {
	
	int num1=30; //instance variable
	static int num2=40; //static variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVariables sv = new StaticVariables();
		System.out.println("Num1:"+sv.num1);
		System.out.println("Num2:"+num2);
		
		sv.display();

	}
	
	public void display() {
		
		System.out.println("Num1:"+num1);
		System.out.println("Num2:"+num2);
		
	}

}
