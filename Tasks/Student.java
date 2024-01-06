package Tasks;

class Stud
{
	String name;
	int id;
	long mobileno;
	String branch;
	int year;
	public Stud()
	{
		System.out.println("This is Anudip NGO");
	}

public  Stud(String name,int id,long mobileno,String branch,int year)
{
	this.name=name;
	this.id=id;
	this.mobileno=mobileno;
	this.branch=branch;
	this.year=year;
}

/*
 * alt+shift+s  : getter setter short cut key
 * */
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setMobileno(long mobileno) {
	this.mobileno = mobileno;
}
public String getBranch() {
	return branch;
}
public int getYear() {
	return year;
}
public void display()
{
	System.out.println("Student Name : "+name+"\n"+"Student Id : "+id+"\n"+"Student Branch : "+branch+"\n"+"Student MobileNo : "+mobileno+"\n"+"Student Year : "+year);
}
}

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Details of First Student");
		Stud s=new Stud("Swanand",1,274638L,"IT",4);
		s.display();
		System.out.println();
		System.out.println("Details of Second Student");
		Stud s1=new Stud("Sahil",3,564443L,"IT",3);
		s1.display();
		System.out.println();
		System.out.println("Details of Third Student");
		Stud s3=new Stud("Shreyas",3,864784L,"IT",3);
		s3.display();
		System.out.println();
		
		System.out.println("\n\nPrinting Details in Sneha Object : ");
		Stud st=new Stud();
		st.setName("Sneha");
		st.setMobileno(74634373L);
		st.display();
		

	}

}
