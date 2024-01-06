package stringPrograms;

public class SubStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Address="Andheri West,Azaad nagar";
		String s1=Address.substring(8);
		
		String s2=Address.substring(8, 12);
		
		System.out.println(""+Address);
		System.out.println(s1);
		System.out.println(s2);
	}

}
