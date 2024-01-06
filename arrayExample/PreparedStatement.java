package arrayExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class PreparedStatement  {
	
	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);

        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip_6201?user=root&password=swanand@321");

            System.out.print("Enter employee ID to delete: ");
            int employeeId = scanner.nextInt();

            String sql = "DELETE FROM employee WHERE id = ?";
            java.sql.PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, employeeId);

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Employee deleted successfully!");
            } else {
                System.out.println("No employee found with the given ID.");
            }

            ps.close();
            con.close();
            
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
		
	}

}
