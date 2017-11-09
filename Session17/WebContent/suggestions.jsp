<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	// Extract name form request
	String name = request.getParameter("name");

	try{
		
		//JDBC
		//1. Load the Driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//2. Create the Connection
		String url = "jdbc:mysql://localhost/edureka";
		String user = "root";
		String password = "";
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		//3. Write and execute SQL Query
		String sql = "Select * from Student where name like '"+name+"%'";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()){
			out.print(rs.getInt(1)+"  |   "+rs.getString(2)+"  |  "+rs.getInt(3)+"<br/>");
		}
		
		rs.close();
		con.close();
		
	}catch(Exception e){
		out.print("Some Problem !!");
	}


%>