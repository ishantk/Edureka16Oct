<%@page import="javax.ws.rs.core.MediaType"%>
<%@page import="javax.ws.rs.core.UriBuilder"%>
<%@page import="javax.ws.rs.client.WebTarget"%>
<%@page import="javax.ws.rs.client.Client"%>
<%@page import="javax.ws.rs.client.ClientBuilder"%>
<%@page import="org.glassfish.jersey.client.ClientConfig"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Client</title>
</head>
<body>

	<%
		ClientConfig cConfig = new ClientConfig();
		Client client = ClientBuilder.newClient(cConfig);
		
		WebTarget target = client.target(UriBuilder.fromUri("http://localhost:8080/Session18Rest"));
		
		// Consume the WebService
								// /rest/hello
		String plain = target.path("rest").path("hello").request().accept(MediaType.TEXT_PLAIN).get(String.class);
		String html = target.path("rest").path("hello").request().accept(MediaType.TEXT_HTML).get(String.class);
		String xml = target.path("rest").path("hello").request().accept(MediaType.TEXT_XML).get(String.class);
		String json = target.path("rest").path("hello").request().accept(MediaType.APPLICATION_JSON).get(String.class);
		
		out.print("Plain Text: "+plain+"<br/>");
		out.print("HTML Text: "+html+"<br/>");
		out.print("XML Text: "+xml+"<br/>");
		out.print("JSON Text: "+json+"<br/>");
	%>

</body>
</html>