package co.edureka;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet({ "/LoginServlet", "/Login" })
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		User user = new User(null,email,password);
		
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		
		boolean flag = helper.loginUser(user);
		
		helper.closeConnection();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<html><body>");
		
		String name = "John Watson";
		int age = 20;
		
		if(flag){
			
			// 1. Cookies
			// You can mention name after retrieval
			/*Cookie ck1 = new Cookie("keyName", name);
			Cookie ck2 = new Cookie("keyAge", String.valueOf(age));
			
			//ck1.setMaxAge();
			
			response.addCookie(ck1);
			response.addCookie(ck2);*/
			
			out.print("<b><i>Login is Success !!</b></i><br/>"); // write html response
			//out.print("<a href = 'Welcome'>Enter Home Here</a>"); // write html response
			
			//2. URL Re-Writing
			//out.print("<a href = 'Welcome?keyname="+name+"&keyage="+age+"'>Enter Home Here</a>"); // write html response
			
			//3. Hidden Form Fields
			/*String form = "<form action='Welcome' method='post'>"+
			"<input type='hidden' name='txtName' value='"+name+"'/>"+
			"<input type='hidden' name='txtAge' value='"+age+"'/>"+
			"<input type='submit' value='Enter Home'/>"+
			"</form>";
			
			out.print(form);*/
			
			HttpSession session = request.getSession();
			session.setAttribute("keyName", name);
			session.setAttribute("keyAge", String.valueOf(age));
			
			out.print("<a href = 'Welcome'>Enter Home Here</a>"); // write html response
			
		}else{
			out.print("<b><i>Login is Error !!</b></i><br/>"); // write html response
			
			//RequestDispatcher dispatcher = request.getRequestDispatcher("registereduser.html");
			//dispatcher.include(request, response);
			
			response.sendRedirect("https://www.google.co.in");
		}
		
		out.print("</body></html>");
		
		/*response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<html><body>");
		out.print("<b><i>Welcome to Login Servlet</b></i>");
		out.print("</body></html>");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("Check");
		dispatcher.forward(request, response);*/
		
	}

}
