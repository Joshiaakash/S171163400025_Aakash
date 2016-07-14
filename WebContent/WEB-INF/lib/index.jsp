<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>





<head>
  <title>Cars</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">CARS</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Hyundai <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">I10</a></li>
          <li><a href="#">I20</a></li>
          <li><a href="#">Verna</a></li>
        </ul>
     <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Toyota <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Innova</a></li>
          <li><a href="#">Fortuner</a></li>
          <li><a href="#">Etois</a></li>
        </ul>
        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Nissan <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Micra</a></li>
          <li><a href="#">Sunny</a></li>
          <li><a href="#">Terrano</a></li>
        </ul>
  </div>
</nav>
  

<div class="container-fluid">
  <h1>Welcome to Car Planet</h1>
  <div class="row">
    <div class="col-xs-6 col-sm-3" style="background-color:lavender;">
      Description<br>
      There are several cars here to choose from. Enjoy !!
    </div>

  <div class="row">
    <div class="col-xs-6 col-sm-3" style="background-color:lightgray;">
      About<br>
      You can choose different cars and can obtain it's specification along with it's price.
    </div>
    
  <div class="row">
    <div class="col-xs-6 col-sm-3" style="background-color:lightcyan;">
      Price<br>
      You will get the best on road price and discounts on buying with our website.
    </div>
    
  <div class="row">
    <div class="col-xs-6 col-sm-3" style="background-color:lavenderblush;">
      Services and Insurance<br>
      You can get services from the company and Insurance as applicable from here only.
    </div>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="https://imagecdn2.cartrade.com/img/800x600/car-data/big/nissan-micra-default-image.png" alt="Micra" width="460" height="50">
      </div>

      <div class="item">
        <img src="toyotafortunerme/car.png.in/images/ho" alt="Fortuner" width="460" height="345">
      </div>
    
      <div class="item">
        <img src="http://www.telegraph.co.uk/content/dam/motoring2/2015/12/01/1-2015-Hyundai-i20--large_trans++rWYeUU_H0zBKyvljOo6zlkYMapKPjdhyLnv9ax6_too.jpg" alt="I20" width="460" height="300">
      </div>

      <div class="item">
        <img src="https://www.google.co.in/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&ved=0ahUKEwjR96uWs97NAhWFFJQKHQPiCZUQjBwIBA&url=http%3A%2F%2Fwww.hyundai.com%2Fwcm%2Fidc%2Fgroups%2Fsgvehiclecontent%2F%40hmc%2Fdocuments%2Fsitecontent%2Fmdaw%2Fmdcw%2F~edisp%2Fin_main_kv_verna_20131129.png&bvm=bv.126130881,d.dGo&psig=AFQjCNHBNDPKJ-sN83A1TqFhvUMpZP0t6w&ust=1467879426185556" alt="Verna" width="460" height="345">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
         <center>   <h4>This is the end of the page</h4></center>


   
  </div>
</div>
<div class="btn-group btn-group-justified">
	<a href="MYCarsservlet?catid=1" class="btn btn-primary">Cars</a>
	<a href="MYCarsservlet?catid=2" class="btn btn-primary">Accessories</a>
</div>	
	
	
	
	<div class="container">
    <div class="row">
        <div class="col-md-offset-5 col-md-3">
            <div class="form-login">
            <h4>Login</h4>
            <input type="text" name="userName" class="form-control input-sm chat-input" placeholder="username" />
            </br>
            <input type="text" name="userPassword" class="form-control input-sm chat-input" placeholder="password" />
            </br>
            <div class="wrapper">
            <span class="group-btn">     
            	
                <a href="Loginservlet.java" class="btn btn-primary btn-md">login <i class="fa fa-sign-in"></i></a>
            </span>
            </div>
            </div>
        
        </div>
    </div>
</div>
</div>
</body>
</html>


