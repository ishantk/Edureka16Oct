<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	// Extract number form request
	String num = request.getParameter("val");

	try{
		int n = Integer.parseInt(num);
	
		for(int i=1;i<=10;i++){
			out.print(n+" "+i+"'s are "+(n*i)+"<br/>");
		}
		
	}catch(Exception e){
		out.print("Enter a Valid Number !!");
	}


%>