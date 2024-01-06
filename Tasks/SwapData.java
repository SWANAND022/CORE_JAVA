package Tasks;

public class SwapData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=8;
		int b=5;
		
		System.out.println("a is:"+a + "\nb is:"+b);
		
		a=a+b; //8+5=13
		b=a-b; //12-5=8
		a=a-b; // 12-8=5
		
		
		System.out.println("After swapping a is:"+a);
		
		System.out.println("After swapping b is:"+b);

	}

}
