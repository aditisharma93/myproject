package control;
import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;
  
  
public class loginServlet extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String n=request.getParameter("uname");  
    String p=request.getParameter("psw");  
          
    if(NewServlet.validate(n, p)){
        HttpSession session = request.getSession();
        session.setAttribute("name",n);
        RequestDispatcher rd=request.getRequestDispatcher("eventmanagement.jsp");  
        rd.forward(request,response);  
        
    }  
    else{   out.println("<script>alert('Username or password incorrect');window.location.href='login.jsp';</script>");  
       // RequestDispatcher rd=request.getRequestDispatcher("login.jsp"); 
    //rd.forward(request,response);
        //out.print("Sorry username or password error");  
       // RequestDispatcher rd=request.getRequestDispatcher("index.html");  
       // rd.include(request,response);  
    }  
          
    out.close();  
    }  
}  