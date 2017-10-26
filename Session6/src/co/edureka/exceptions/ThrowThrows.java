package co.edureka.exceptions;

import java.io.IOException;

// User Defined Exception
//class BankingException extends Exception{ // CHECKED EXCEPTION
class BankingException extends RuntimeException{ // UNCHECKED EXCEPTION
	BankingException(String message){
		super(message);
	}
	
	// Write your stuff in here..
}

class Banking{
	
	int balance = 10000;
	int minBal = 3000;
	
	int attempts = 0;
	
	void withdraw(int amt){
		balance = balance - amt;
		if(balance<=minBal){
			attempts++;
			System.out.println("Withdraw Failure!! Your Balance is LOW: \u20b9"+balance);
			balance = balance + amt;
		}else{
			System.out.println("Withdraw Successful!! Your Balance is: \u20b9"+balance);
		}
		
		if(attempts > 2){
			// UNCHECKED EXCEPTION
			//NullPointerException npe = new NullPointerException("Invalid Attempts Made !!");
			//throw npe; // Explicitly We are throwing exception to crash the program
			
			BankingException be = new BankingException("Invalid Attempts Made !!");
			throw be;
		}
	}
	
	void withdrawAgain(int amt) throws IOException{
		balance = balance - amt;
		if(balance<=minBal){
			attempts++;
			System.out.println("Withdraw Failure!! Your Balance is LOW: \u20b9"+balance);
			balance = balance + amt;
		}else{
			System.out.println("Withdraw Successful!! Your Balance is: \u20b9"+balance);
		}
		
		if(attempts > 2){
			// CHECKED EXCEPTION
			IOException io = new IOException("Invalid Attempts Made !!");
			throw io;
		}
	}
	
}

public class ThrowThrows {

	public static void main(String[] args) {
		
		System.out.println("Banking Started..");
		
		Banking bRef = new Banking();
		
		for(int i=1;i<=100;i++)
			bRef.withdraw(3000);
		
		/*for(int i=1;i<=100;i++)
			try {
				bRef.withdrawAgain(3000);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		*/
		
		System.out.println("Banking Finished..");
		
	}

}
