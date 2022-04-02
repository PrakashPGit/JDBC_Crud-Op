package Login_Validation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String usern = req.getParameter("un");
		String pass = req.getParameter("ps");
		
		String passkey = "1234";
		
		if(passkey.equalsIgnoreCase(pass) ){
			
			PrintWriter output = resp.getWriter();
			output.println("Wrong");
			
			RequestDispatcher rd = req.getRequestDispatcher("ws");
			rd.forward(req, resp);
			
			
		}
		
		else {
			PrintWriter output = resp.getWriter();
			output.println("sorry wrong un take");
			
			RequestDispatcher rd = req.getRequestDispatcher("/Index.html");
			rd.include(req, resp);
		}
	}

}
