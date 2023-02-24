

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class newServlet
 */
public class newServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public newServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		Application  Scope 
		ServletContext sc=getServletContext();
		sc.setAttribute("name","SAITM");
		PrintWriter pw=response.getWriter();
		pw.println("WelCome to the Servlet  ,click on below  ");
	 
		
		 
	    pw.println("Servlet config and context");
	    System.out.println("servlet cotext object"+ getServletContext());
	    System.out.println("servlet config object"+ getServletConfig());
	    
	    
	    String name=request.getParameter("username");
	    String password=request.getParameter("password");
	    pw.print("Hello"+name);
	    pw.print("Your Password is :"+password);
	    
	    
	    
	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
