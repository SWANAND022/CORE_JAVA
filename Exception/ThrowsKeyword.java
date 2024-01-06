package Exception;

class Demo{                  
	public void databaseConnectivity() throws ClassNotFoundException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
	}
	
}

public class ThrowsKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo d=new Demo();
		try {
		d.databaseConnectivity();
		}
		catch(Exception e) {
			System.out.println("An exception occured");
		}

	}

	
}