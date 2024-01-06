package WrapperClasses;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Wrapper Class are predefined classes, they are use to convert premitive data to 
		 * object types.
		 * 
		 *  primitive          Wrapper Class
		 *  byte               Byte
		 *  short              Short
		 *  int                Integer
		 *  long               Long
		 *  
		 *  float              Float
		 *  double             Double
		 *  
		 *  boolean            Boolean
		 *  char               Character 
		 */
		
		int num1 = 10;
		Integer num = num1;//autoboxing,primitive is automatically wrapped and converted to object.
		/*
		 * usinf objects instead of primitive datatypes is useful since we get many predefined
		 * methods to manipulate our data in wrapper class objects.
		 */
		
		System.out.println("num="+num);
		
		String a ="10";
		String b ="20";
		
		System.out.println("Addition of Strings = "+(a+b));
		
		Integer i= Integer.parseInt(a);
		Integer j= Integer.parseInt(b);
		
		System.out.println("\nAddition of Integers = "+(i+j));

	}

}
