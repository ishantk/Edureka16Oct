package co.edureka;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/RegisterServlet", "/Register", "/Awesome" })
public class RegisterServlet extends HttpServlet {
	
	// RegisterServlet is a class. Its object is created by WebServer (ApacheTomcat)
	// WebContainer on WebServer which will actually create object and manages it also.
	
	// init method is called when object is created by WebContainer on WebServer
	public void init(ServletConfig config) throws ServletException {
		System.out.println("**init executed**");
	}

	// destroy method is called when object is destroyed by WebContainer on WebServer
	public void destroy() {
		System.out.println("**destroy executed**");
	}

	// service method is executed when anyone request for RegisterServlet
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("**service executed**");
		
		
		// Read the data from request (form client)
		String name = request.getParameter("txtName");
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		System.out.println(name+" - "+email+" - "+password);
		
		// JDBC Code Goes Here to Save the User in Table
		User user = new User(name, email, password);
		
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		
		int i = helper.registerUser(user);
		
		helper.closeConnection();
		
		// Write the response back to client 
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//out.print("Thank You for Your Registration!!"); // write textual response
		
		
		out.print("<html><body>");
		
		if(i>0){
			out.print("<b><i>Thank You for Your Registration!!</b></i>"); // write html response
		}else{
			out.print("<b><i>Registration Error !!</b></i>"); // write html response
		}
		
		out.print("</body></html>");
	}

}
