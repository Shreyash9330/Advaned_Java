package CollaborationServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContextInterfServlet
 */
@WebServlet("/ContextInterfServlet")
public class ContextInterfServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out =response.getWriter();
		response.setContentType("text/html");
		
		ServletContext Content =  request.getServletContext();
	context.setAttribute("drivers","com.mysql.cj.jdbc.Driver");
	out.println("<h4> Information is stored Sucessfully</h4>");
	
	}

}
