package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<title>Event management</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/style.css\">\n");
      out.write("<style>\n");
      out.write("body {font-family: \"Times New Roman\", Georgia, Serif;}\n");
      out.write("h1,h2,h3,h4,h5,h6 {\n");
      out.write("    font-family: \"Playfair Display\";\n");
      out.write("    letter-spacing: 5px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("<!-- Navbar (sit on top) -->\n");
      out.write("<div class=\"-top\">\n");
      out.write("  <div class=\"-bar -white -padding -card\" style=\"letter-spacing:4px;\">\n");
      out.write("    Event Management\n");
      out.write("    <div class=\"-right -hide-small\">\n");
      out.write("      <a href=\"signup.jsp\" class=\"-bar-item -button\">Signup</a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- Header -->\n");
      out.write("<header class=\"-display-container -content -wide\" style=\"max-width:1700px;min-width:500px\" id=\"home\">\n");
      out.write(" <!-- <img class=\"-round -image -opacity-min\" src=\"images/image26.jpg\"   width=1600 height=\"806\">-->\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("</header>\n");
      out.write("<!-- Page content -->\n");
      out.write("<div class=\"-content\" style=\"max-width:1000px\">\n");
      out.write("  <div class=\"-container -padding-64\" id=\"contact\">\n");
      out.write("    <h1>Login</h1><br>\n");
      out.write("    <form  action=\"loginServlet\" method=\"post\">\n");
      out.write("      <p><input class=\"-input -padding-16\" type=\"text\" placeholder=\"Enter Username\" name=\"uname\" required ></p>\n");
      out.write("      <p><input class=\"-input -padding-16\" type=\"password\" placeholder=\"Enter Password\"  name =\"psw\" required ></p>\n");
      out.write("      <p><button class=\"-button -light-grey -section\" type=\"submit\">Login</button></p>\n");
      out.write("      <label>\n");
      out.write("    <input type=\"checkbox\" checked=\"checked\" name=\"remember\"> Remember me\n");
      out.write("      </label>\n");
      out.write("     </p><span class=\"psw\">Forgot <a href=\"#\">password?</a></span>\n");
      out.write("    </div>\n");
      out.write("   </div>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<footer class=\"w3-center w3-light-grey w3-padding-32\">\n");
      out.write("  <p><a href=....................... title=\"......\" target=\"_blank\" class=\"w3-hover-text-green\"></a></p>\n");
      out.write("</footer>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
