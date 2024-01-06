package fundamentals;

public class InstanceVariable {
	int num=12;
	String institute="Anudip";
	String course="java";

	public static void main(String[] args) {
		
		InstanceVariable iv = new InstanceVariable();
	System.out.println("Num:"+iv.num);
	
	iv.diaplay();

	}
	
	public void diaplay() {
		System.out.println("Number:"+num);
	}

}
