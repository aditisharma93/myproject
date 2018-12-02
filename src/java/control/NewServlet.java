package control;
import java.sql.*;  
  
public class NewServlet {  
public static boolean validate(String name,String pass){  
boolean status=false;  
try{  
    System.out.println(name);
    System.out.println(pass);
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/event?useSSL=false","root","kuchbhi");  
      
PreparedStatement ps=con.prepareStatement(  
"select username,password from registration where username=? and password=?");  
ps.setString(1,name);  
ps.setString(2,pass);  
      
ResultSet rs=ps.executeQuery();  
status=rs.next();  
System.out.println(status);
}catch(Exception e){System.out.println(e);}  
return status;  
}  
}  