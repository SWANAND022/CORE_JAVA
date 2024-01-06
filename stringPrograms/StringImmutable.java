package stringPrograms;

/*String immutability is the ability of strings to not change the original object .
 * Once a String object is created in SCP memory then we will not be able to change this object .
 * If we refer this new Sting object by a new variable or use the same old reference to now point to new object.
 *  */

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name1="Anjali";    //memory management showing
		String name2="Anjali";    //memory management showing
		System.out.println("Are name2 and name2 referring to same object : "+(name1==name2));
		System.out.println("Before : \nname1 = "+name1+"\nname2 = "+name2);
		
		name1=name1.toUpperCase();  // same name1 variable will now refer to new object.
		//String s=name1.toUpperCase();  //We have created new variable s to refer to the new object.
		System.out.println("\n\nAre name1 and name2 reffering to same object : "+(name1==name2));
		System.out.println("\nAfter : \nname1 = "+name1+"\nname2 = "+name2);
		//System.out.println("The new object created s = "+s);
		

	}

}
