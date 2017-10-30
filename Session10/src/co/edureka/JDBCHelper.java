package co.edureka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


// DAO - Data Access Object
public class JDBCHelper {
	
	Connection con;
	Statement stmt;

	//1. Load the Driver
	JDBCHelper(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("--Driver Loaded--");
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}
	}
	
	//2. Create the Connection
	void createConnection(){
		try {
			String url = "jdbc:mysql://localhost/edureka";
			String user = "root";
			String password = "";
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println("--Connection Created--");
			
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}
	}
	
	//3. Write SQL Statement
	//4. Execute SQL Statement
	void insertStudent(MyStudent s){
		try {
			//3. Write SQL Statement
			String sql = "INSERT INTO STUDENT VALUES(null,'"+s.name+"',"+s.age+")";
			
			//4. Execute SQL Statement
			stmt = con.createStatement();
			int i = stmt.executeUpdate(sql); // Execution of SQL Command over the Connection
			if(i>0){
				System.out.println(s.name+" saved in db");
			}else{
				System.out.println(s.name+" not saved in db");
			}
			
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}
	}
	
	//5. Close the Connection
	void closeConnection(){
		try {
			con.close();
			System.out.println("--Connection Closed--");
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}
	}
	
	
}
