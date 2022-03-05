<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class='header'>
<div class="righthead">
<div style="color:white;font-size: 20pt;padding-left: 25px;">PRJ321X
</div>
<div style="color:#00BFFF;">Welcome to my<br>
Website</div>
</div>
<form action="Search" method="get" >
<div class="input-group mb-3 lefthead "style="width: 75%;" >
  <span class="input-group-text">Categories</span>
  <input type="text" name="txt" class="form-control"  placeholder="What are you looking for?">
 <input type="submit" value="Search" class="submit" class="input-group-text" style="background-color: orange;"/>

</div>
  </form>
</div>


<div class='topnav'>

<a href="Homecontroller">Home</a>
<a href="Homecontroller">Products</a>
<a href="#">About</a>


<a href="register.jsp" style="float: right">Register</a>
<c:if test="${sessionScope.acc==null }">
<a href="login.jsp" style="float: right">Login</a>
</c:if>
<c:if test="${sessionScope.acc!=null }">
<a href="logout" style="float: right">Logout</a>
<a href="" style="float: right">Hello!${sessionScope.acc.user_name }</a>
</c:if>
</div>