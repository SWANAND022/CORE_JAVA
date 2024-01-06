package stringPrograms;

public class StartsWithDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String institute = "Anudip Foundation";
		
		boolean s1= institute.startsWith("An");
		boolean s2= institute.startsWith("ba");
		
		boolean s3= institute.endsWith("on");
		boolean s4= institute.endsWith("tn");
		
		System.out.println("Does the s1 string starts with An :"+s1);
		System.out.println("Does the  s2 string starts with An :"+s2);

		System.out.println("\nDoes the s3 string ends with on :"+s3);
		System.out.println("Does the  s4 string ends with tn :"+s4);

	}

}
