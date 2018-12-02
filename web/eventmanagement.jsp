<%-- 
    Document   : eventmanagement
    Created on : 29 Nov, 2018, 10:53:02 AM
    Author     : Aditi Sharma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<title>Event management</title>
<link rel="stylesheet" type="text/css" media="screen" href="css/style.css">
<!--<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">-->

<style>
body {font-family: "Times New Roman", Georgia, Serif;}
h1,h2,h3,h4,h5,h6 {
    font-family: "Playfair Display";
    letter-spacing: 5px;
}
</style>
<body>
  <nav class="-sidebar -collapse -white " style="z-index:3;width:300px;" id="mySidebar"><br>
  <div class="-container">
   <!-- <a href="#" onclick="_close()" class=" -hide-large -right -jumbo -padding -hover-grey" title="close menu">
      <i class="fa fa-remove"></i>
    </a>-->
    <img src="images/user.png" style="width:45%;" class="-round"><br><br>
    <h1><b><%=
       request.getSession().getAttribute("name").toString()
            %></b></h1>
    <h4><b>Event management</b></h4>
    <p class="-text-grey"></p>
  </div>
  <div class="-bar-block">
    <a href="#home" onclick="_close()" class="-bar-item -button padding -text-teal">EVENT MANAGEMENT</a> 
    <a href="#about" onclick="_close()" class="-bar-item -button -padding"> <img src="images/about.png" > ABOUT</a> 
    <a href="login.jsp" onclick="_close()" class="-bar-item -button -padding"> <img src="images/login.png" > LOGIN</a>
    <a href="signup.jsp" onclick="_close()" class="-bar-item -button -padding"> <img src="images/login.png" > SIGNUP</a>
    <a href="contact.jsp" onclick="_close()" class="-bar-item -button -padding"> <img src="images/contact.png" > CONTACT</a>
   <a href="login.jsp" onclick="_close()" class="-bar-item -button -padding"><img src="images/logout.png" > LOGOUT</a>
   <a href="feedback.jsp" onclick="_close()" class="-bar-item -button -padding"><img src="images/fd.png" > FEEDBACK</a>
<div class="-dropdown-hover -hide-small">

     </div>
  </div>
    <div class="-panel -large">
    <img src="images/fb.png" >
    <img src="images/insta.png" >
     <img src="images/twit.png" >
      <img src="images/pin.png" >
    
  </div>
</nav>

<!-- Navbar (sit on top) -->
<div class="-top">
  <div class="-bar -white -padding -card" style="letter-spacing:4px;">
    <div class="-right -hide-small">
      <form class="example" action="SearchServlet">
  <input type="text" placeholder="Search.." name="search">
  <img src="images/search.png" >
  
</form>
    </div>
  </div>
</div>

<!-- !PAGE CONTENT! -->
<div class ="-content" style="margin-left:300px">

<!-- Header -->
<div class=" -opacity">
<span class=" -button  -xxlarge  -white  -right" onclick="_open()"><i class="fa fa-bars"></i></span> 
<div class=" -clear"></div>
<header class=" -center  -margin-bottom">
 <header class=" -display-container  -content  -wide" style="max-width:2000px;min-width:500px" id="home">
  <img class=" -round  -image " src="images/image4.jpg"  width="1600" height="850">
</header>
</div>

<!-- Photo Grid -->
  <div class=" -row-padding">
    <div class=" -third  -container  -margin-bottom">
        <a href="ticket.jsp"> <img src="images/image2.jpg" alt="Norway" style="width:100%" class=" -hover-opacity"></a>
      <div class=" -container  -white">
        <p><b>CONCERTS</a></b></p>
        <p>................</p>
      </div>
    </div>
    <div class=" -third  -container  -margin-bottom">
      <img src="images/img7.jpg" alt="Norway" style="width:100%" class=" -hover-opacity">
      <div class=" -container  -white">
        <p><b>CONFERENCE</b></p>
        <p>.............</p>
      </div>
    </div>
    <div class="-third -container">
      <img src="images/img8.jpg" alt="Norway" style="width:100%" class="-hover-opacity">
      <div class="-container -white">
        <p><b>WEDDING</b></p>
        <p>.........</p>
      </div>
    </div>
  </div>
  
  <!-- Second Photo Grid-->
  <div class="-row-padding">
    <div class="-third -container -margin-bottom">
      <img  src="images/img9.jpg" alt="Norway" style="width:100%" class="-hover-opacity" href="login.html">
      <div class="-container -white">
        <p><b>PLANNING</b></p>
        <p>...........</p>
      </div>
    </div>
    <div class="-third -container -margin-bottom">
      <img src="images/image13.jpg" alt="Norway" style="width:100%" class="-hover-opacity">
      <div class="-container -white">
        <p><b>PARTIES</b></p>
        <p>............</p>
      </div>
    </div>
    <div class="-third -container">
      <img src="images/promo.jpg" alt="Norway" style="width:100%" class="-hover-opacity">
      <div class="-container -white">
        <p><b>PROMOTION</b></p>
        <p>..............</p>
      </div>
    </div>
  </div>


  <!--our team-->
  <div class="-container -padding-64 -center" id="about">
<h2>OUR TEAM</h2>
<p>Meet the team - our office rats:</p>

<div class="-row"><br>

<div class="-quarter">
  <img src="." alt="Boss" style="width:45%" class="-circle -hover-opacity">
  <h3>Harry Potter</h3>
  <p>Web Designer</p>
</div>

<div class="-quarter">
  <img src="" alt="Boss" style="width:45%" class="-circle -hover-opacity">
  <h3>Hermione</h3>
  <p>Support</p>
</div>

<div class="-quarter">
  <img src="" alt="Boss" style="width:45%" class="-circle -hover-opacity">
  <h3>Ron</h3>
  <p>Boss man</p>
</div>

<div class="-quarter">
  <img src="" alt="Boss" style="width:45%" class="-circle -hover-opacity">
  <h3>Dumbledore</h3>
  <p>Fixer</p>
</div>
</div>
</div>
  <hr>
<!-- Footer -->
  <footer class="-row-padding -padding-32">
    <div class="-third">
      <h3>About us</h3>
      <p> xcvbnm,hjbswjhb  </p>
      <p>xcvbnm,hjbswjhb </p>
    </div>
  
    <div class="-third">
      <h3>BLOG POSTS</h3>
      <ul class="-ul -hoverable">
        <li class="-padding-16">
          <img src="" class="-left -margin-right" style="width:50px">
          <span class="-large"></span><br>
          <span></span>
        </li>
        <li class="-padding-16">
          <img src="" class="-left -margin-right" style="width:50px">
          <span class="-large"></span><br>
          <span></span>
        </li> 
      </ul>
    </div>

    <div class="-third -serif">
      <h3>Contact</h3>
      <p>
      </p>
    </div>
  </footer>
<!-- End Page Content -->
</div>
</body>
</html>
