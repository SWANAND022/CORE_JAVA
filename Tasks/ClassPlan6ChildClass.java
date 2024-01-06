package Tasks;

public class ClassPlan6ChildClass {
	
public void callProtectedMethod() {
		
        protectedMethod();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPlan6ChildClass c = new ClassPlan6ChildClass();

        // Accessing the protected method from the parent class
        c.callProtectedMethod();

	}

}
