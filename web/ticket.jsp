<%-- 
    Document   : ticket
    Created on : 29 Nov, 2018, 11:21:42 AM
    Author     : Aditi Sharma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<title>Event management</title>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" media="screen" href="css/style.css">
<style>
body {font-family: "Times New Roman", Georgia, Serif;}
h1,h2,h3,h4,h5,h6 {
    font-family: "Playfair Display";
    letter-spacing: 5px;
}
</style>
<body>
<!-- Navbar (sit on top) -->
<div class="-top">
  <div class="-bar -white -padding -card" style="letter-spacing:4px;">
    <a href="eventmanagement.jsp" class="-bar-item -button">Event Management</a>
    <div class="-right -hide-small">
      <a href="login.jsp" class="-bar-item -button">Login</a>
      <a href="signup.jsp" class="-bar-item -button">Signup</a>
    </div>
  </div>
</div>
<!-- Header -->
<header class="-display-container -content -wide" style="max-width:1700px;min-width:500px" id="home">
 <!-- <img class="-round -image -opacity-min" src="images/image26.jpg"   width=1600 height="806">-->

  </div>
</header>
<!-- Page content -->
<div class="-content" style="max-width:1000px">
  <div class="-container -padding-64" id="contact">
    <h1>Tickets</h1><br>
    <form  action="TicketServlet" method="post">
      <p><input class="-input -padding-16" type="text" placeholder="Enter Username" name="uname" required ></p>
      
      <select class="-input -padding-16" id="city" name="concert">
      <option value="usa">Concerts</option>
      <option value="australia">Sat,1 Dec     5:00pm     The Nignt Run 2018  in jwaharlal nehru stadum </option>
      <option value="canada">Chandigarh</option>
      <option value="usa">Mumbai</option>
      <option value="usa">Delhi</option>
      <option value="usa">Hydrabad</option>
     </select>
      <p><button class="-button -light-grey -section" type="submit">BUY NOW</button></p>
      <label>
    <input type="checkbox" checked="checked" name="remember"> Remember me
      </label>

    </div>
   </div>
  </form>
</div>

<footer class="w3-center w3-light-grey w3-padding-32">
  <p><a href=....................... title="......" target="_blank" class="w3-hover-text-green"></a></p>
</footer>
</body>
</html>