<%-- 
    Document   : signup
    Created on : 29 Nov, 2018, 11:20:59 AM
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
    Event Management
    <div class="-right -hide-small">
     
      <a href="login.jsp" class="-bar-item -button">Login</a>
    </div>
  </div>
</div>
<!-- Header -->
<header class="-display-container -content -wide" style="max-width:1700px;min-width:500px" id="home">
  <!--<img class="-round -image -opacity-min" src="images/image24.jpg"   width="1600" height="200">-->

  </div>
</header>
<!-- Page content -->
<div class="-content" style="max-width:1200px">
  <div class="-container -padding-64" id="contact">
    <h1>Sign Up</h1><br>
   <p>Please fill in this form to create an account.</p>
    <form  action="signupServlet" method="post">
      <p><input class="-input -padding-16" type="text" placeholder="Enter Email" name="email" required ></p>
     <p><input class="-input -padding-16" type="text" placeholder="Enter Username" name="user" required ></p>
      <p><input class="-input -padding-16" type="password" placeholder="Enter Password"  name ="psw-repeat" required ></p>
<p><input class="-input -padding-16" type="password" placeholder="Repeat Password"  name ="psw" required ></p>
     <p><button class="-button -light-grey -section" type="submit">Signup</button></p>
      <label>
        <input type="checkbox" checked="checked" name="remember"> Remember me
      </label>
    </div>
    </div>
  </form>
</div>
    </div>
  </form>
</div>
<footer class="-center -light-grey -padding-32">
  <p><a href=....................... title="......" target="_blank" class="-hover-text-green"></a></p>
</footer>
</body>
</html>