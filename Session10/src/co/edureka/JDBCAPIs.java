package co.edureka;

class MyStudent{
	int roll;
	String name;
	int age;
}

public class JDBCAPIs {

	public static void main(String[] args) {
		
		// Data is temporary. Persist it !!
		MyStudent s1 = new MyStudent();
		MyStudent s2 = new MyStudent();
		
		s1.roll = 0;
		s1.name = "George";
		s1.age = 20;
		

		s2.roll = 0;
		s2.name = "Fionna";
		s2.age = 27;

		//1. Load the Driver
		JDBCHelper helper = new JDBCHelper();
		
		//2. Create the Connection
		helper.createConnection();
		
		//3. 4. Write & Execute
		helper.insertStudent(s1);
		helper.insertStudent(s2);
		
		//5. Close the Connection
		helper.closeConnection();
		
		
	}

}
