
package control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;  
import java.sql.*;  
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;  
import javax.servlet.http.*;  

public class signupServlet extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String c=request.getParameter("email");  
String d=request.getParameter("user");  
String e=request.getParameter("psw");  
 String f=request.getParameter("psw-repeat"); 

          
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/event?useSSL=false","root","kuchbhi");  
  
PreparedStatement ps=con.prepareStatement(  
"insert into registration values(?,?,?,?)");  
  
ps.setString(1,c);  
ps.setString(2,d);  
ps.setString(3,e);  
ps.setString(4,f);

          
int i=ps.executeUpdate();  
if(i>0){
   // RequestDispatcher rd=request.getRequestDispatcher("Account.html");  
       // rd.forward(request,response); 
out.print("You are successfully registered...");  
      response.sendRedirect("login.jsp");
          
}
else
{response.sendRedirect("signup.jsp");}
}
catch (Exception e2) {System.out.println(e2);}  
          
out.close();  


}  
  
}  