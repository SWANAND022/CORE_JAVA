package fundamentals;

public class ParametersDemo2 {

	public void display(String a , int b) {
		System.out.println("String input"+a);
		System.out.println("Int input"+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParametersDemo2 pd= new ParametersDemo2();
		pd.display("Swanand", 22 ); //sequence matters of parameters declared
	}

}
