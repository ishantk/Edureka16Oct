package co.edureka;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


// DAO - Data Access Object
public class JDBCHelper {
	
	Connection con;
	PreparedStatement pStmt;

	//1. Load the Driver
	public JDBCHelper(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("--Driver Loaded--");
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}
	}
	
	//2. Create the Connection
	public void createConnection(){
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
	public int registerUser(User u){
		
		int i = 0;
		
		try {
			//3. Write SQL Statement
			String sql = "INSERT INTO USER VALUES(null,?,?,?)"; 
			
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, u.name);
			pStmt.setString(2, u.email);
			pStmt.setString(3, u.password);
			
			i = pStmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}
		
		return i;
	}
	
	public boolean loginUser(User u){
		boolean flag = false;
		
		try {
			//3. Write SQL Statement
			String sql = "SELECT * FROM USER WHERE email = ? AND password = ?"; 
			
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, u.email);
			pStmt.setString(2, u.password);
			
			ResultSet rs = pStmt.executeQuery();
			
			flag = rs.next();
			
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}
		
		return flag;
	}
	
	
	
	//5. Close the Connection
	public void closeConnection(){
		try {
			con.close();
			System.out.println("--Connection Closed--");
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}
	}
	
	
}
