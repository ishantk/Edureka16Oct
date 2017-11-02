<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="errorpage.jsp" %>    
    
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
	
	<%
		int[]arr = {10,20,30,40,50};
	
		//try{
		out.print("arr[10] is: "+arr[10]);
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