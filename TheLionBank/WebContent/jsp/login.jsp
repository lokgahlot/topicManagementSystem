<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%  String message = (String)request.getAttribute("message");%>     
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>The Lion Bank</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style1.css"/>
<link href='http://fonts.googleapis.com/css?family=Raleway:400,200,300,600,700,800' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800,600,300,200' rel='stylesheet' type='text/css'>
<link href="<%=request.getContextPath() %>/css/font-awesome.min.css" rel="stylesheet" media="screen">
<link href="<%=request.getContextPath() %>/css/responsive.css" rel="stylesheet" media="screen" type="text/css"/>
<link href="<%=request.getContextPath() %>/css/style.css" rel="stylesheet" type="text/css"/>

<link rel="stylesheet" href="<%=request.getContextPath() %>/sidr/stylesheets/jquery.sidr.dark.css">
<script src="<%=request.getContextPath() %>/js/jquery.min.js"></script>
<script src="<%=request.getContextPath() %>/sidr/jquery.sidr.min.js"></script>
<script type="<%=request.getContextPath() %>/text/javascript" src="js/smoothscroll.js"></script>

<!-- Custom styles for this template -->
    <link href="<%=request.getContextPath() %>/navbar-fixed-top.css" rel="stylesheet">

</head>

<body>
<nav class="navbar navbar-default navbar-fixed-top">
	<div class="header">
    	<div class="container">
		<div class="navbar-header">
    		<div class="logo-menu">
        		<div class="logo">
            		<h1><a href="#">The Lion Bank</a></h1>
            	</div>
                <!--<a id="simple-menu" href="../#sidr">Toggle menu</a>-->
                <div id="mobile-header">
<a class="responsive-menu-button" href="#"><img src="<%=request.getContextPath() %>/images/11.png"/></a>
</div>
            	<div class="menu" id="navigation">
				
            		<ul>
                    	<li><a href="<%=request.getContextPath() %>/index.html">Home</a></li>
                        <li><a href="<%=request.getContextPath() %>/html/login.html">Login</a></li>
                    </ul>
            	</div>
        	</div>
        </div>
		</div>
    </div>
    </nav>
    <div class="banner">
    	<div class="container">
        	<div class="header-text">
			<p><blink><%= message%></blink></p>
			<p  class="big-text">Login with User Credentials</p>
				<div class="login-box" align="center">
				<div id="login" class="hidden">
					<form class="form" method="post" action="<%=request.getContextPath()%>/Login">
						<input name="userName" type="text" placeholder="Username" required>
						<input name="password" type="password" placeholder="Password" required>
						<input type="hidden" name = "name" value = "loginPost" />
						<input type=submit value='Login' id='login-button'/>
					</form>
					<br><br>
				</div></div>
            </div>
        </div>
    </div>


    <div class="footer">
        	<div class="container">
            	<div class="infooter">
                <p class="copyright">Copyright &copy; The Lion Bank 2015</p>	
            	</div>
            
            </div>
        </div>
		

        <script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.nicescroll.min.js"></script>
        <script type="text/javascript">		
			 $(document).ready(function() {
				$('#simple-menu').sidr({
				side: 'right'
			});
			});
			$('.responsive-menu-button').sidr({
				name: 'sidr-main',
				source: '#navigation',
				side: 'right'

				});
			$(document).ready(
			function() {
			$("html").niceScroll({cursorborder:"0px solid #fff",cursorwidth:"5px",scrollspeed:"70"});
			}
			);
		</script>
</body>
</html>
