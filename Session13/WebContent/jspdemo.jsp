<%@page import="co.edureka.User"%>
<%@ page import="java.util.Date"%>
<%@ page isThreadSafe="true" %>
<%-- <%@ page isELIgnored="true" %> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page buffer="8kb" %>    
<%@ page errorPage="errorpage.jsp" %>    
<%@ include file="printdate.jsp" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Demo</title>
</head>
<body>
	<h3>Welcome to JSP Demos</h3>
	<br/>
	<h3>Scriptlet Tag</h3>
	
	<c:forEach var="k" begin="1" end="10">
		k is: <c:out value="${k}"/> <br/>
	</c:forEach>
	
	<c:set var="age" value="20"/>
	
	<c:if test="${age>18}">
		You can Vote
	</c:if>
	
	<c:redirect url="https://www.google.co.in"/>
	
	<%
	
		int age1 = 20;
	
		for(int i=1;i<=10;i++){
			out.print("i is: "+i+"<br/>");
		}
	%>
	
	
	<%
		User user = new User();
		user.setName("John");
		user.setEmail("john@example.com");
		user.setPassword("password123");
		
	%>
	
	User Name is: <%= user.getName() %>
	<br/>
	<br/>
	<jsp:useBean id="uRef" class="co.edureka.User"/>
	<jsp:setProperty property="name" name="uRef" value="Fionna"/>
	<jsp:setProperty property="email" name="uRef" value="fionna@example.com"/>
	<jsp:setProperty property="password" name="uRef" value="fionna123"/>
	
	User Name is: <jsp:getProperty property="name" name="uRef"/>
	<br/><br/>
	<%-- Today is: <%= new Date() %> --%>
	<br/>
	<%
		int[]arr = {10,20,30,40,50};
	
		//try{
		out.print("arr[0] is: "+arr[0]);
		//}catch(Exception e){
		//	out.print("Some Exception: "+e);
		//}
	%>
	
	
	<% 
		int a = 10;
		int b = 20;
		int c = a+b;
		out.print("c is: "+c);
	%>
	<br/>
	Some More Example:
	<br/>
	<%
		int age = 10;
		if(age>=18){
			//out.print("<b>You can Vote<b>");
			
	%>
		<b>You Can Vote</b>
	<%		
		}else{
			
	%>
		<b>You Cannot Vote</b>
	<%		
			//out.print("<b>You cannot Vote<b>");
		}
	%>
	
	<br/>
	Square of 21 is:  <% out.print(squareOfNum(21));  %>
	
	<br/>
	<h3>Declarative Tag</h3>
	
	<%!
		float pi = 3.14f;
		int squareOfNum(int num){
			return num*num;
		}
	%>
	<br/>
	Value of PI is: <% out.print(pi); %> 
	<br/>
	Square of 19 is:  <% out.print(squareOfNum(19)); %>
	<br/>
	a is:  <% out.print(a); %>  
	
	<br/>
	<h3>Expression Tag</h3>
	
	<br/>
	Value of PI is: <%= pi %> 
	<br/>
	Square of 19 is:  <%= squareOfNum(19) %>
	<br/>
	a is:  <%= a %>  
	
</body>
</html>