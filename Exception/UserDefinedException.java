package Exception;

import java.util.Scanner;

/*
 * We can make our own exception with the following steps:-
 * 
 * 1) Our class should be part of the exception hierarchy. So we should extend our class 
 *    with either exception class- this will make our exception a compiletime exception
 *    or extend with Runtin=meException class:- this will make our exception a runtime exception.
 *    
 * 2) Make constructor and basic methods in the exception class.
 * 
 * 3) We use throw keyword to specify on which error code our exception could occur.
 */



class InsufficientBalanceException extends Exception{
	
	public InsufficientBalanceException() {
		
		System.out.println("Balance is not sufficient enough to make withdrawal... ");
	}
	
	@Override
	public String getMessage() {
		return "Balance too low";
	}
	
	@Override
		public String toString() {
		
			return "Exception.InsufficientBalanceException: Balance too low";
		}
}

class Account{
	double balance=10000;
	
	public void withdraw(double withdrawAmount) throws InsufficientBalanceException {
		
		if(balance<=withdrawAmount) {
						
			throw new InsufficientBalanceException();
		}
		else{
			balance-=withdrawAmount;
			System.out.println(withdrawAmount+ " has been withdrawn from your account");
			System.out.println("Current balance is: "+balance);
		}
	}
}

public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a= new Account();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to be withdrawn:");
		double withdrawAmount=sc.nextInt();
		
		try {
			a.withdraw(withdrawAmount);
		}
		catch(InsufficientBalanceException e) {
			e.printStackTrace();
		}

	}

}
