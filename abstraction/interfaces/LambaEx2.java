package abstraction.interfaces;


interface SchoolTemplate{
	public void attendace(String className,Integer studentCount);
}



public class LambaEx2 {
	public static void main(String[] args) {
		
		SchoolTemplate st=(String className, Integer studentCount) -> {
			System.out.println("The class Name is:"+className+" And number of students:"+studentCount);
		};
		st.attendace("VID", 30);
		
	}

}
