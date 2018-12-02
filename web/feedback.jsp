<%-- 
    Document   : feedback
    Created on : 2 Dec, 2018, 10:25:59 PM
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
    <h1>Feedback</h1>
    <h2> You can write anything in here about the event.</h2></br>
    <form  action="" method="post">

    <h4>* Which event did you attend?</h4>
      <select class="-input -padding-16" id="event"  name="event">
      <option value="event">Select</option>
      <option value="w">Wedding</option>
      <option value="C">Concert</option>
      <option value="co">Conference</option>
      <option value="dj">Music Night</option>
      <option value="p">Party</option>
      </select>
      <h4>* Overall, how entertaining was the event?</h4>
      <p>
<input type="radio" name="1" value="1">1
<input type="radio" name="2" value="2">2
<input type="radio" name="3" value="3">3
<input type="radio" name="4" value="4">4
<input type="radio" name="5" value="5">5
<input type="radio" name="6" value="6">6
<input type="radio" name="7" value="7">7
<input type="radio" name="8" value="8">8
<input type="radio" name="9" value="9">9
<input type="radio" name="10" value="10">10</p>
<p><input class="-input -padding-16" type="text" placeholder="* what was the best part of the event?" name="like" required ></p>

      <h4>* How was the Quality of food</h4>
      <p>
<input type="radio" name="1" value="1">1
<input type="radio" name="2" value="2">2
<input type="radio" name="3" value="3">3
<input type="radio" name="4" value="4">4
<input type="radio" name="5" value="5">5
<input type="radio" name="6" value="6">6
<input type="radio" name="7" value="7">7
<input type="radio" name="8" value="8">8
<input type="radio" name="9" value="9">9
<input type="radio" name="10" value="10">10</p>
     <p><input class="-input -padding-16" type="text" placeholder="* What problems you encounter?" name="like" required ></p>
      <p><input class="-input -padding-16" type="text" placeholder="* Any suggestions for future events" name="like" required ></p>
       <p><input class="-input -padding-16" type="text" placeholder="* Any comments?" name="like" required ></p>

      <p><button class="-button -light-grey -section" type="submit"><a href="eventmanagement.jsp">SUBMIT</a></button></p>
    </div>
   </div>
  </form>
</div>

<footer class="w3-center w3-light-grey w3-padding-32">
<p><a href=....................... title="......" target="_blank" class="w3-hover-text-green"></a></p>
</footer>
</body>
</html>
