
public class Conditions {

	public static void main(String[] args) {
		
		int age = 80;
		
		// Regular if/else
		if(age>=18){
			System.out.println("You can Vote");
		}else{
			System.out.println("You cannot Vote");
		}
		
		boolean gpsStatus = false; // GPS is OFF
		boolean internetStatus = false; // Internet is ON
		
		// Nested if/else
		if(internetStatus){
			if(gpsStatus){
				System.out.println("You can use Maps");
			}else{
				System.out.println("Please enable GPS");
			}
		}else{
			System.out.println("Please enable Internet");
		}
		
		
		if(!internetStatus){
			System.out.println("Please Enable Internet");
		}else{
			System.out.println("You can Browse Web");
		}
		
		int balance = 3000;
		int minBal = 3000;
		
		if(balance > minBal){
			System.out.println("You can process a withdrawl");
		}else{
			System.out.println("You cannot process a withdrawl");
		}
		
		
		// Ladder If/Else
		
		int marks = 75;
		if(marks >= 90){
			System.out.println("You got Grade A");
		}else if(marks >=80 && marks<90){
			System.out.println("You got Grade B");
		}else if(marks >=70 && marks<80){
			System.out.println("You got Grade C");
		}else{
			System.out.println("Please re attempt exam");
		}
			

	}

}
