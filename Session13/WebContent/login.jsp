<%@page import="co.edureka.User"%>
<%@page import="co.edureka.JDBCHelper"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		User user = new User("",email,password);
		
		// JDBC Code Here
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		boolean check = helper.loginUser(user);
		helper.closeConnection();
		
		if(check){
	%>		
		<h3>Login is a Success</h3>	
	<% 		
		}else{
	%>	
		<h3>Login is a Failure</h3>	
	<%		
	
		response.sendRedirect("https://www.google.co.in");
	
		}
	%>

</body>
</html>