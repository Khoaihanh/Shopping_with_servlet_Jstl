<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        

<link rel="stylesheet" type="text/css" href="css/Style.css">

</head>
<body>
<div class="container-fluid">
<c:import url="/header.jsp"></c:import>
 <div class="row ">
   <div class="row col-lg-9 ">
                        <c:forEach items="${listp}" var="o">
                            <div class="col-8 col-md-4 col-lg-4">
                                <div class="card">
                                    <img class="card-img-top" src="${o.product_img_source}" alt="Card image cap">
                                    <div class="card-body">
                                        <h4 class="card-title show_txt" style="height: 50px;"><a href="detail?pid=${o.product_id}" title="View Product">${o.product_name}</a></h4>
                                        <p class="card-text show_txt">${o.product_des}</p>
                                        <div class="row">
                                            <div class="col">
                                                <p class="btn btn-danger btn-block">Giá : ${o.product_price} $</p>
                                            </div>
                                            <div class="col">
                                                <a href="CartControl?id=${o.product_id}" class="btn btn-success btn-block">Add to cart</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                         </div>
                          <div class=" col-lg-3"></div>
      
                   
    
  </div>
<c:import url="/navpage.jsp"></c:import>
<c:import url="/footer.jsp"></c:import>


</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>