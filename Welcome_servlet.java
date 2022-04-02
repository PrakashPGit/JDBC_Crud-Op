package Login_Validation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcome_servlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("un");
		String Pass = req.getParameter("ps");
		
		PrintWriter output = resp.getWriter();
		output.println("<html> < <body> <h1> Welcome Password Matched </h1> <p>user details:- Username:- "+name+" <br> Password:- "+Pass+" </p> </body></html>");
		
	}
	

}
