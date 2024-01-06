package stringPrograms;

public class ScpDempEx1 {
	/*
	 * SCP: STRING CONTROL POOL
	 * 
	 * s and t are created using literals . Hence both reference variables will point to the same object
	 * of Java in SCP memory.
	 * For strings if we use == operator then jvm checks if two strings are located at same memory or not.
	 * Hence when we do s==t we get true.
	 * 
	 * Whereas when we use new keyword then always a new object is created in heap memory.
	 * Therefore a and b will point to two different objects in heap memory.
	 * Hence a==b will give false.
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String s="Java";
		 String t="Java";
		 String x=new String("Java");
		 
		 String a=new String("Coding");
		 String b=new String("Coding");
		 
		 System.out.println("Are s and t pointing to same object : "+(s==t));
		 System.out.println("Are a and b pointing to same object : "+(a==b));
		 System.out.println("Are t and x pointing to same object : "+(t==x));
		 System.out.println("Does t and x have the same value : "+t.compareTo(x));
		 System.out.println("Does t and x have the same value : "+t.equals(x));

	}

}
