<%@page import="org.apache.catalina.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <meta charset="UTF-8">

<link rel="stylesheet" type="text/css" href="css/login.css">

</head>
<body>
<%
String user="",password="";
Cookie[] cookies=request.getCookies();
if(cookies!=null){
	for(Cookie cook:cookies){
		if(cook.getName().equals("cookUname")){
			user=cook.getValue();
		}else if(cook.getName().equals("cookPass")){
			password=cook.getValue();
		}
	}
}
%>
<div id="main-wrapper" class="container">
    <div class="row justify-content-center">
        <div class="col-xl-10">
            <div class="card border-0">
                <div class="card-body p-0">
                    <div class="row no-gutters">
                        <div class="col-lg-6">
                            <div class="p-5">
                                <div  style="margin-bottom: 10px; padding-left: 60px;">
                                    <h2 class="h3 font-weight-bold text-theme" style="color: black;font-weight:bolder;">Sign in</h3>
                                </div>

                                <div> ${error}</div>
                                <form action="logincontrol"method="post">
                                    <div class="form-group">
                                       
                                        <input type="email" class="form-control" id="exampleInputEmail1"placeholder="Email"name="user" value="<%=user %>">
                                    </div>
                                    <div class="form-group mb5">
                                        
                                        <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Passwords."name="pass" value="<%=password%>">
                                    </div>                                  
                                   
                                   <a href="#l" class="forgot-link float-right text-primary " id="textprimary">Forgot password?</a>
                               </br>
                                <button type="submit" class="btn btntheme btn1">Login</button>   

                                </form>
                            </div>
                        </div>

                        <div class="col-lg-6 d-none d-lg-inline-block">
                            <div class="account-block rounded-right">
                                <div class="overlay rounded-right"></div>
                                <div class="account-testimonial">
                                    <h4 class="text-white mb-4 text" style="font-size: xx-large;font-weight: bold;">Welcome Back!</h4>
                                    <p class="lead text-white text1"style="font-size: larger;">To keep connected with us</br>please login with your personal</br> info</p>
                               
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
                <!-- end card-body -->
            </div>
            
        </div>
        <!-- end col -->
    </div>
    <!-- Row -->
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>