package inheritance;

/*
 * Super Keyword represents the parent class object.
 * It will declare the immediate parent.
 * 
 */

class University{
	String name="Mumbai University";
	
}

class College extends University{
	String name="Bhavan's College";
	
	public void display() {
		System.out.println("Name od university="+name);
		System.out.println("Name="+super.name);
	}
}

class Department extends College{
	String name="It department";
	
	public void show() {
		System.out.println("Name="+name);
		System.out.println("Name of univerity using super="+super.name);
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		
		College c=new College();
		c.display();
		
		Department d= new Department();
		d.show();
		
	}

}
