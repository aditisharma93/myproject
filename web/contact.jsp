<%-- 
    Document   : contact
    Created on : 29 Nov, 2018, 11:13:06 AM
    Author     : Aditi Sharma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
<header class="-display-container -content wide" style="max-width:1700px;min-width:500px" id="home">
  <img class="-round -image -opacity-min" src="images/image10.jpg"   width=1600 height="1200">

  </div>
</header>
<!-- Page content -->
<div class="-content" style="max-width:1200px">

  <!-- CONTACT -->
  <div class="-container -padding-64" id="contact">
    <h1>Contact</h1><br>
    <p> NEED HELP ? CALL
    (+91) 9459674722
   </a></p>
    <p class="-text-blue-grey -large"><b>  </b></p>
    <p>Please fill the form to contact us and book us for your events</p>
    <form action="ContactServlet" target="_blank">
      <p><input class="-input -padding-16" type="text" placeholder="Name"  name="Name" required></p>
      <p><input class="-input -padding-16" type="text" placeholder="Phone" name="Phone" required></p>
      <p><input class="-input -padding-16" type="text" placeholder="Email"  name="Email" required></p>
      <p><input class="-input -padding-16" type="text" placeholder="Event name"  name="Event" required></p>
      <select class="-input -padding-16" id="city" name="city">
      <option value="usa">city</option>
      <option value="banglore">Banglore</option>
      <option value="Chandigarh">Chandigarh</option>
      <option value="Mharashtra">Mumbai</option>
      <option value="delhi">Delhi</option>
      <option value="hydrabad">Hydrabad</option>
     
    </select>
    <p><input class="-input -padding-16" type="number" placeholder="How many people" required name="People"></p>
    <p><input class="-input -padding-16" type="datetime-local" placeholder="Date and time" required name="date" value="2017-11-16T20:00"></p>
    <p><input class="-input -padding-16" type="text" placeholder="Message \ Special requirements" required name="Message"></p>
    <p><button class="-button -light-grey -section" type="submit">SEND MESSAGE</button></p>
    </form>
  </div>
</div>
<!-- Footer -->
<footer class="-center -light-grey -padding-32">
  <p><a href=....................... title="......" target="_blank" class="-hover-text-green"></a></p>
</footer>
</body>
</html>
