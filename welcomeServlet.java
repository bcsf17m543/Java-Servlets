import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class welcomeServlet extends HttpServlet {

public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{        
	
	
    PrintWriter out = response.getWriter();


    out.println("<html><head><title>Welcome Servlet</title></head>");
    out.println("<body>");
    out.println("<h1>Welcome! </h1>");
    out.println("</body>");
    out.println("</html>");
    
	out.close(); 

	
	}


}