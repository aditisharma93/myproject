package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class eventmanagement_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<title>Event management</title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/style.css\">\n");
      out.write("<!--<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">-->\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("body {font-family: \"Times New Roman\", Georgia, Serif;}\n");
      out.write("h1,h2,h3,h4,h5,h6 {\n");
      out.write("    font-family: \"Playfair Display\";\n");
      out.write("    letter-spacing: 5px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("  <nav class=\"-sidebar -collapse -white \" style=\"z-index:3;width:300px;\" id=\"mySidebar\"><br>\n");
      out.write("  <div class=\"-container\">\n");
      out.write("   <!-- <a href=\"#\" onclick=\"_close()\" class=\" -hide-large -right -jumbo -padding -hover-grey\" title=\"close menu\">\n");
      out.write("      <i class=\"fa fa-remove\"></i>\n");
      out.write("    </a>-->\n");
      out.write("    <img src=\"images/user.png\" style=\"width:45%;\" class=\"-round\"><br><br>\n");
      out.write("    <h1><b>");
      out.print(
       request.getSession().getAttribute("name").toString()
            );
      out.write("</b></h1>\n");
      out.write("    <h4><b>Event management</b></h4>\n");
      out.write("    <p class=\"-text-grey\"></p>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"-bar-block\">\n");
      out.write("    <a href=\"#home\" onclick=\"_close()\" class=\"-bar-item -button padding -text-teal\">EVENT MANAGEMENT</a> \n");
      out.write("    <a href=\"#about\" onclick=\"_close()\" class=\"-bar-item -button -padding\"> <img src=\"images/about.png\" > ABOUT</a> \n");
      out.write("    <a href=\"login.jsp\" onclick=\"_close()\" class=\"-bar-item -button -padding\"> <img src=\"images/login.png\" > LOGIN</a>\n");
      out.write("    <a href=\"signup.jsp\" onclick=\"_close()\" class=\"-bar-item -button -padding\"> <img src=\"images/login.png\" > SIGNUP</a>\n");
      out.write("    <a href=\"contact.jsp\" onclick=\"_close()\" class=\"-bar-item -button -padding\"> <img src=\"images/contact.png\" > CONTACT</a>\n");
      out.write("   <a href=\"login.jsp\" onclick=\"_close()\" class=\"-bar-item -button -padding\"><img src=\"images/logout.png\" > LOGOUT</a>\n");
      out.write("   <a href=\"feedback.jsp\" onclick=\"_close()\" class=\"-bar-item -button -padding\"><img src=\"images/fd.png\" > FEEDBACK</a>\n");
      out.write("<div class=\"-dropdown-hover -hide-small\">\n");
      out.write("\n");
      out.write("     </div>\n");
      out.write("  </div>\n");
      out.write("    <div class=\"-panel -large\">\n");
      out.write("    <img src=\"images/fb.png\" >\n");
      out.write("    <img src=\"images/insta.png\" >\n");
      out.write("     <img src=\"images/twit.png\" >\n");
      out.write("      <img src=\"images/pin.png\" >\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<!-- Navbar (sit on top) -->\n");
      out.write("<div class=\"-top\">\n");
      out.write("  <div class=\"-bar -white -padding -card\" style=\"letter-spacing:4px;\">\n");
      out.write("    <div class=\"-right -hide-small\">\n");
      out.write("      <form class=\"example\" action=\"SearchServlet\">\n");
      out.write("  <input type=\"text\" placeholder=\"Search..\" name=\"search\">\n");
      out.write("  <img src=\"images/search.png\" >\n");
      out.write("  \n");
      out.write("</form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- !PAGE CONTENT! -->\n");
      out.write("<div class =\"-content\" style=\"margin-left:300px\">\n");
      out.write("\n");
      out.write("<!-- Header -->\n");
      out.write("<div class=\" -opacity\">\n");
      out.write("<span class=\" -button  -xxlarge  -white  -right\" onclick=\"_open()\"><i class=\"fa fa-bars\"></i></span> \n");
      out.write("<div class=\" -clear\"></div>\n");
      out.write("<header class=\" -center  -margin-bottom\">\n");
      out.write(" <header class=\" -display-container  -content  -wide\" style=\"max-width:2000px;min-width:500px\" id=\"home\">\n");
      out.write("  <img class=\" -round  -image \" src=\"images/image4.jpg\"  width=\"1600\" height=\"850\">\n");
      out.write("</header>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Photo Grid -->\n");
      out.write("  <div class=\" -row-padding\">\n");
      out.write("    <div class=\" -third  -container  -margin-bottom\">\n");
      out.write("        <a href=\"ticket.jsp\"> <img src=\"images/image2.jpg\" alt=\"Norway\" style=\"width:100%\" class=\" -hover-opacity\"></a>\n");
      out.write("      <div class=\" -container  -white\">\n");
      out.write("        <p><b>CONCERTS</a></b></p>\n");
      out.write("        <p>................</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\" -third  -container  -margin-bottom\">\n");
      out.write("      <img src=\"images/img7.jpg\" alt=\"Norway\" style=\"width:100%\" class=\" -hover-opacity\">\n");
      out.write("      <div class=\" -container  -white\">\n");
      out.write("        <p><b>CONFERENCE</b></p>\n");
      out.write("        <p>.............</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"-third -container\">\n");
      out.write("      <img src=\"images/img8.jpg\" alt=\"Norway\" style=\"width:100%\" class=\"-hover-opacity\">\n");
      out.write("      <div class=\"-container -white\">\n");
      out.write("        <p><b>WEDDING</b></p>\n");
      out.write("        <p>.........</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <!-- Second Photo Grid-->\n");
      out.write("  <div class=\"-row-padding\">\n");
      out.write("    <div class=\"-third -container -margin-bottom\">\n");
      out.write("      <img  src=\"images/img9.jpg\" alt=\"Norway\" style=\"width:100%\" class=\"-hover-opacity\" href=\"login.html\">\n");
      out.write("      <div class=\"-container -white\">\n");
      out.write("        <p><b>PLANNING</b></p>\n");
      out.write("        <p>...........</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"-third -container -margin-bottom\">\n");
      out.write("      <img src=\"images/image13.jpg\" alt=\"Norway\" style=\"width:100%\" class=\"-hover-opacity\">\n");
      out.write("      <div class=\"-container -white\">\n");
      out.write("        <p><b>PARTIES</b></p>\n");
      out.write("        <p>............</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"-third -container\">\n");
      out.write("      <img src=\"images/promo.jpg\" alt=\"Norway\" style=\"width:100%\" class=\"-hover-opacity\">\n");
      out.write("      <div class=\"-container -white\">\n");
      out.write("        <p><b>PROMOTION</b></p>\n");
      out.write("        <p>..............</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!--our team-->\n");
      out.write("  <div class=\"-container -padding-64 -center\" id=\"about\">\n");
      out.write("<h2>OUR TEAM</h2>\n");
      out.write("<p>Meet the team - our office rats:</p>\n");
      out.write("\n");
      out.write("<div class=\"-row\"><br>\n");
      out.write("\n");
      out.write("<div class=\"-quarter\">\n");
      out.write("  <img src=\".\" alt=\"Boss\" style=\"width:45%\" class=\"-circle -hover-opacity\">\n");
      out.write("  <h3>Harry Potter</h3>\n");
      out.write("  <p>Web Designer</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"-quarter\">\n");
      out.write("  <img src=\"\" alt=\"Boss\" style=\"width:45%\" class=\"-circle -hover-opacity\">\n");
      out.write("  <h3>Hermione</h3>\n");
      out.write("  <p>Support</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"-quarter\">\n");
      out.write("  <img src=\"\" alt=\"Boss\" style=\"width:45%\" class=\"-circle -hover-opacity\">\n");
      out.write("  <h3>Ron</h3>\n");
      out.write("  <p>Boss man</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"-quarter\">\n");
      out.write("  <img src=\"\" alt=\"Boss\" style=\"width:45%\" class=\"-circle -hover-opacity\">\n");
      out.write("  <h3>Dumbledore</h3>\n");
      out.write("  <p>Fixer</p>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("  <hr>\n");
      out.write("<!-- Footer -->\n");
      out.write("  <footer class=\"-row-padding -padding-32\">\n");
      out.write("    <div class=\"-third\">\n");
      out.write("      <h3>About us</h3>\n");
      out.write("      <p> xcvbnm,hjbswjhb  </p>\n");
      out.write("      <p>xcvbnm,hjbswjhb </p>\n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("    <div class=\"-third\">\n");
      out.write("      <h3>BLOG POSTS</h3>\n");
      out.write("      <ul class=\"-ul -hoverable\">\n");
      out.write("        <li class=\"-padding-16\">\n");
      out.write("          <img src=\"\" class=\"-left -margin-right\" style=\"width:50px\">\n");
      out.write("          <span class=\"-large\"></span><br>\n");
      out.write("          <span></span>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"-padding-16\">\n");
      out.write("          <img src=\"\" class=\"-left -margin-right\" style=\"width:50px\">\n");
      out.write("          <span class=\"-large\"></span><br>\n");
      out.write("          <span></span>\n");
      out.write("        </li> \n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"-third -serif\">\n");
      out.write("      <h3>Contact</h3>\n");
      out.write("      <p>\n");
      out.write("      </p>\n");
      out.write("    </div>\n");
      out.write("  </footer>\n");
      out.write("<!-- End Page Content -->\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
