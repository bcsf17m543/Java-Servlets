import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class DateTimeServlet extends HttpServlet {

public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{        
	
	
    PrintWriter out = response.getWriter();
    java.util.Date date = new java.util.Date();


    out.println("<html><head><title>Date and Time Servlet</title></head>");
    out.println("<body>");
    out.println("<p>Current Date and Time: "+ date.toString()+"</p>");
    out.println("</body>");
    out.println("</html>");
    
	out.close(); 

	
	}


}