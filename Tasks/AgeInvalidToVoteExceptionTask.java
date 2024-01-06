package Tasks;

import java.util.Scanner;

class AgeInvalidToVoteException extends Exception {
    public AgeInvalidToVoteException(String s) {
        super(s);
    }
}

public class AgeInvalidToVoteExceptionTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			 Scanner sc=new Scanner(System.in);
			 
			 System.out.println("Enter you age: ");
			 int age=sc.nextInt();
			 
			 if (age < 18) 
		            {
		                throw new AgeInvalidToVoteException(null);
		            }
			 System.out.println("You are eligible for voting...");
			       
		     } 
		
		catch (AgeInvalidToVoteException e) 
		
		{
		    System.out.println("You are not eligible for votinh....");
		}
		
	}

}
