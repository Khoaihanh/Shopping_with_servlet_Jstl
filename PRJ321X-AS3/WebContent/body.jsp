<div class="container">

   <div class="row row-cols-4">
   <div class="row">
                        <c:forEach items="${listp}" var="o">
                            <div class="col-12 col-md-6 col-lg-4">
                                <div class="card">
                                    <img class="card-img-top" src="${o.product_img_source}" alt="Card image cap">
                                    <div class="card-body">
                                        <h4 class="card-title show_txt"><a href="detail?pid=${o.product_id}" title="View Product">${o.product_name}</a></h4>
                                        <p class="card-text show_txt">${o.product_des}</p>
                                        <div class="row">
                                            <div class="col">
                                                <p class="btn btn-danger btn-block">${o.product_price} $</p>
                                            </div>
                                            <div class="col">
                                                <a href="#" class="btn btn-success btn-block">Add to cart</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
    
  </div>
    
</div>