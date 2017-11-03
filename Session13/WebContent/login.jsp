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

	<h3> Email is: ${param.txtEmail} </h3>

	<%
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		User user = new User("",email,password);
		
		out.print("Email is: "+email+"<br/>");
		
		// JDBC Code Here
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		boolean check = helper.loginUser(user);
		helper.closeConnection();
		
		if(check){
			
			String name = "John Watson";
			int age = 20;
			
			/*Cookie c1 = new Cookie("keyName",name);
			Cookie c2 = new Cookie("keyAge",String.valueOf(age));
			
			//c1.setMaxAge(expiry)
			
			response.addCookie(c1);
			response.addCookie(c2);*/
			
			session.setAttribute("keyName", name);
			session.setAttribute("keyAge", age);
			
			pageContext.setAttribute("keyName", name, PageContext.SESSION_SCOPE);
			
	%>		
		<h3>Login is a Success</h3>
		<br/>
		<jsp:include page="printdate.jsp"/>
		<br/>	
		<!-- <a href="home.jsp">Enter Home</a> -->
		<jsp:forward page="home.jsp"/>
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