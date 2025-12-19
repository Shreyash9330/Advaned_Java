package CollaborationServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchSevlet
 */
@WebServlet("/SearchSevlet")
public class SearchSevlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		response.sendRedirect
		("https://www.google.com/search?q="+request.getParameter("t1"));
		}
	}
	

