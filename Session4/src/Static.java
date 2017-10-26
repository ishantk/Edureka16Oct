
class Employee{
	
	// Attributes
	// Below are the properties of Object
	int eid;
	String name;
	int salary;
	
	// Attributes
	// Below are the properties of Class and Not of Object
	static String dept;
	
	// Methods
	// Below are the properties of Object
	Employee() {
		eid = 0;
		name = "NA";
		salary = 0;
	}
	
	Employee(int i, String n, int s) {
		eid = i;
		name = n;
		salary = s;
	}
	
	void showEmployee(){
		// dept = "R&D"; |  Property of Class can be accessed by Property of Object 
		System.out.println("Employee with id "+eid+" is "+name+" and withdraws "+salary+" salary");
	}
	
	// Methods
	// Below are the properties of Class and Not of Object
	static void showDept(){
		// eid = 1; error | Property of Object cannot be accessed by Property of Class
		System.out.println("Department is: "+dept);
	}
	
}

class WhatsApp{
	
	static String title;
	String status;
	
	void showData(){
		System.out.println("Title: "+title);
		System.out.println("Status: "+status);
	}
}

public class Static {

	public static void main(String[] args) {
		
		/*Employee e1 = new Employee(101,"John Watson",50000);
		Employee e2 = new Employee(102,"Fionna",70000);
		
		e1.showEmployee();
		e2.showEmployee();
		
		Employee.dept = "HR";
		Employee.showDept();*/
		
		WhatsApp user1 = new WhatsApp();
		WhatsApp user2 = new WhatsApp();
		WhatsApp user3 = new WhatsApp();
		
		user1.status = "Lets Rock";
		user2.status = "Let Party";
		user3.status = "Lets Enjoy";
		
		WhatsApp.title = "Its Friday...!!";
		
		//user1.title = "Lets Party at Home";
		
		user1.showData();
		user2.showData();
		user3.showData();
		
		

	}

}
