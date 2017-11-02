package co.edureka;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet({ "/HomeServlet", "/Welcome" })
public class HomeServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<html><body>");
		out.print("<b><i>Welcome Home Dear User</b></i><br/><b>");
		
		
		/*Cookie[] ckArr = request.getCookies();
		for(Cookie ck : ckArr){
			out.print(ck.getName()+" - "+ck.getValue()+"<br/>");
		}*/
		
		//String name = request.getParameter("keyname");
		//String age = request.getParameter("keyage");
		
		//String name = request.getParameter("txtName");
		//String age = request.getParameter("txtAge");
		//int a = Integer.parseInt(age);
		
		HttpSession session = request.getSession();
		
		String name = (String)session.getAttribute("keyName");
		String age =  (String)session.getAttribute("keyAge");
		
		out.print(name+" - "+age);
		
		
		out.print("</b></body></html>");
			
	}

}
