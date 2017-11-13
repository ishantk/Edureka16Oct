package co.edureka;

import javax.ws.rs.GET;
import javax.ws.rs.Path; // JAXRS API
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//import org.glassfish.jersey.servlet.ServletContainer; // -> configure this ServletContain in web.xml file

@Path("/hello")
public class Hello {
	

	// Web Methods
	// You can write the web methods which shall process the data.
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainHello(){
		String str = "Plain Hello from Jersey...!!";
		return str;
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLHello(){
		String str = "<html><body><p>HTML Hello from Jersey...!!</p></body></html>";
		return str;
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello(){
		String str = "<?xml version='1.0'?><hello>XML Hello from Jersey...!!</hello>";
		return str;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayJSONHello(){
		String str = "{'email':'john1@example.com','username':'john1'}";
		return str;
	}
	
}
