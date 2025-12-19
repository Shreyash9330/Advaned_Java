package Servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        String uname = request.getParameter("t1");
        String pwd = request.getParameter("t2");

        out.println("<html><body>");
        if (uname.equalsIgnoreCase("admin") && pwd.equalsIgnoreCase("admin")) {
            out.println("<h1>Welcome : " + uname + "</h1>");
        } else {
            out.println("<h1>Login Failed</h1>");
        }
        out.println("</body></html>");
        out.close();
    }
}
