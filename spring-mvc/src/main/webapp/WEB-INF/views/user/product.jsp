<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>CHI TIẾT SẢN PHẨM</title>
</head>
<body>
	<!-- 
Body Section 
-->
	<p>${Cart.size() }</p>
	<div class="row">
		<div id="sidebar" class="span3">
			<div class="well well-small">
				<ul class="nav nav-list">
					<c:forEach var="item" items="${cateList}">
							<li><a href="/san-pham/${item.id }"><span
							class="icon-chevron-right"></span> ${item.name }</a></li>
						</c:forEach>
					<li style="border: 0">&nbsp;</li>
					<li><a class="totalInCart" href="cart.html"><strong>Đã Mua<span class="badge badge-warning pull-right"
								style="line-height: 18px;">$448.42</span>
						</strong></a></li>
				</ul>
			</div>

			<div class="well well-small alert alert-warning cntr">
				<h2>50% Discount</h2>
				<p>
					only valid for online order. <br>
					<br>
					<a class="defaultBtn" href="#">Click here </a>
				</p>
			</div>
			<div class="well well-small">
				<a href="#"><img src="assets/img/paypal.jpg"
					alt="payment method paypal"></a>
			</div>

			<a class="shopBtn btn-block" href="#">Upcoming products <br>
			<small>Click to view</small></a> <br> <br>
			<ul class="nav nav-list promowrapper">
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="product_details.html"
							title="add to cart"><span class="icon-search"></span> QUICK
							VIEW</a> <img src="assets/img/bootstrap-ecommerce-templates.png"
							alt="bootstrap ecommerce templates">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="product_details.html">VIEW</a> <span
									class="pull-right">$22.00</span>
							</h4>
						</div>
					</div>
				</li>
				<li style="border: 0">&nbsp;</li>
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="product_details.html"
							title="add to cart"><span class="icon-search"></span> QUICK
							VIEW</a> <img src="assets/img/shopping-cart-template.png"
							alt="shopping cart template">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="product_details.html">VIEW</a> <span
									class="pull-right">$22.00</span>
							</h4>
						</div>
					</div>
				</li>
				<li style="border: 0">&nbsp;</li>
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="product_details.html"
							title="add to cart"><span class="icon-search"></span> QUICK
							VIEW</a> <img src="assets/img/bootstrap-template.png"
							alt="bootstrap template">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="product_details.html">VIEW</a> <span
									class="pull-right">$22.00</span>
							</h4>
						</div>
					</div>
				</li>
			</ul>

		</div>
		<div class="span9">
			<ul class="breadcrumb">
				<li><a href="index.html">Homepage</a> <span class="divider">/</span></li>
				<li><a href="products.html">Items</a> <span class="divider">/</span></li>
				<li class="active">Preview</li>
			</ul>
			<div class="well well-small">
				<div class="row-fluid">
					<div class="span5">
						<div id="myCarousel" class="carousel slide cntr">
							<div class="carousel-inner">
								<div class="item active">
									<a href="#"> <img src="<c:url value="/assets/user/img/slide/${itemList.img }"/>" alt=""
										style="width: 100%"></a>
								</div>
							</div>
							<a class="left carousel-control" href="#myCarousel"
								data-slide="prev">‹</a> <a class="right carousel-control"
								href="#myCarousel" data-slide="next">›</a>
						</div>
					</div>
					<div class="span7">
						<h3>${itemList.productName}</h3>
						<hr class="soft" />

						<form class="form-horizontal qtyFrm" method="get" action="<c:url value="/AddCart/${itemList.id_product }"/>">
							<div class="control-group">
								<label class="control-label"><span><fmt:formatNumber type="number" groupingUsed="true" value="${itemList.price}"/>,000đ</span></label>
								<div class="controls">
									<input type="number" min="0" value="0" class="span6" placeholder="Qty.">
								</div>
							</div>

							<div class="control-group">
								<label class="control-label"><span>Color</span></label>
								<div class="controls">
									<select class="span11">
										<option>Red</option>
										<option>Purple</option>
										<option>Pink</option>
										<option>Red</option>
									</select>
								</div>
							</div>
							<h4>${itemList.title}</h4>
							<p>Nowadays the lingerie industry is one of the most
								successful business spheres. Nowadays the lingerie industry is
								one of ...
							<p>
								<button type="submit" class="shopBtn">
									<span class=" icon-shopping-cart"></span> Add to cart
								</button>
						</form>
					</div>
				</div>
				<hr class="softn clr" />


				<ul id="productDetail" class="nav nav-tabs">
					<li class="active"><a href="home" data-toggle="tab">Product
							Details</a></li>
					<li class=""><a href="#profile" data-toggle="tab">Related
							Products </a></li>
				</ul>
				<div id="myTabContent" class="tab-content tabWrapper">
					<div class="tab-pane fade active in" id="home">
						${itemList.detail}

					</div>
					<div class="tab-pane fade" id="profile">
						<div class="row-fluid">
							<div class="span2">
								<img src="assets/img/d.jpg" alt="">
							</div>
							<div class="span6">
								<h5>Product Name</h5>
								<p>Nowadays the lingerie industry is one of the most
									successful business spheres. We always stay in touch with the
									latest fashion tendencies - that is why our goods are so
									popular..</p>
							</div>
							<div class="span4 alignR">
								<form class="form-horizontal qtyFrm">
									<h3>$140.00</h3>
									<label class="checkbox"> <input type="checkbox">
										Adds product to compair
									</label><br>
									<div class="btn-group">
										<a href="product_details.html" class="defaultBtn"><span
											class=" icon-shopping-cart"></span> Add to cart</a> <a
											href="product_details.html" class="shopBtn">VIEW</a>
									</div>
								</form>
							</div>
						</div>
						<hr class="soft">
						<div class="row-fluid">
							<div class="span2">
								<img src="assets/img/d.jpg" alt="">
							</div>
							<div class="span6">
								<h5>Product Name</h5>
								<p>Nowadays the lingerie industry is one of the most
									successful business spheres. We always stay in touch with the
									latest fashion tendencies - that is why our goods are so
									popular..</p>
							</div>
							<div class="span4 alignR">
								<form class="form-horizontal qtyFrm">
									<h3>$140.00</h3>
									<label class="checkbox"> <input type="checkbox">
										Adds product to compair
									</label><br>
									<div class="btn-group">
										<a href="product_details.html" class="defaultBtn"><span
											class=" icon-shopping-cart"></span> Add to cart</a> <a
											href="product_details.html" class="shopBtn">VIEW</a>
									</div>
								</form>
							</div>
						</div>
						<hr class="soft" />
						<div class="row-fluid">
							<div class="span2">
								<img src="assets/img/d.jpg" alt="">
							</div>
							<div class="span6">
								<h5>Product Name</h5>
								<p>Nowadays the lingerie industry is one of the most
									successful business spheres. We always stay in touch with the
									latest fashion tendencies - that is why our goods are so
									popular..</p>
							</div>
							<div class="span4 alignR">
								<form class="form-horizontal qtyFrm">
									<h3>$140.00</h3>
									<label class="checkbox"> <input type="checkbox">
										Adds product to compair
									</label><br>
									<div class="btn-group">
										<a href="product_details.html" class="defaultBtn"><span
											class=" icon-shopping-cart"></span> Add to cart</a> <a
											href="product_details.html" class="shopBtn">VIEW</a>
									</div>
								</form>
							</div>
						</div>
						<hr class="soft" />
						<div class="row-fluid">
							<div class="span2">
								<img src="assets/img/d.jpg" alt="">
							</div>
							<div class="span6">
								<h5>Product Name</h5>
								<p>Nowadays the lingerie industry is one of the most
									successful business spheres. We always stay in touch with the
									latest fashion tendencies - that is why our goods are so
									popular..</p>
							</div>
							<div class="span4 alignR">
								<form class="form-horizontal qtyFrm">
									<h3>$140.00</h3>
									<label class="checkbox"> <input type="checkbox">
										Adds product to compair
									</label><br>
									<div class="btn-group">
										<a href="product_details.html" class="defaultBtn"><span
											class=" icon-shopping-cart"></span> Add to cart</a> <a
											href="product_details.html" class="shopBtn">VIEW</a>
									</div>
								</form>
							</div>
						</div>
						<hr class="soften" />
						<div class="row-fluid">
							<div class="span2">
								<img src="assets/img/d.jpg" alt="">
							</div>
							<div class="span6">
								<h5>Product Name</h5>
								<p>Nowadays the lingerie industry is one of the most
									successful business spheres. We always stay in touch with the
									latest fashion tendencies - that is why our goods are so
									popular..</p>
							</div>
							<div class="span4 alignR">
								<form class="form-horizontal qtyFrm">
									<h3>$140.00</h3>
									<label class="checkbox"> <input type="checkbox">
										Adds product to compair
									</label><br>
									<div class="btn-group">
										<a href="product_details.html" class="defaultBtn"><span
											class=" icon-shopping-cart"></span> Add to cart</a> <a
											href="product_details.html" class="shopBtn">VIEW</a>
									</div>
								</form>
							</div>
						</div>
					</div>
					<div class="tab-pane fade" id="cat1">
						<p>Etsy mixtape wayfarers, ethical wes anderson tofu before
							they sold out mcsweeney's organic lomo retro fanny pack lo-fi
							farm-to-table readymade. Messenger bag gentrify pitchfork
							tattooed craft beer, iphone skateboard locavore carles etsy
							salvia banksy hoodie helvetica. DIY synth PBR banksy irony.
							Leggings gentrify squid 8-bit cred pitchfork. Williamsburg banh
							mi whatever gluten-free, carles pitchfork biodiesel fixie etsy
							retro mlkshk vice blog. Scenester cred you probably haven't heard
							of them, vinyl craft beer blog stumptown. Pitchfork sustainable
							tofu synth chambray yr.</p>
						<br> <br>
						<div class="row-fluid">
							<div class="span2">
								<img src="assets/img/b.jpg" alt="">
							</div>
							<div class="span6">
								<h5>Product Name</h5>
								<p>Nowadays the lingerie industry is one of the most
									successful business spheres. We always stay in touch with the
									latest fashion tendencies - that is why our goods are so
									popular..</p>
							</div>
							<div class="span4 alignR">
								<form class="form-horizontal qtyFrm">
									<h3>$140.00</h3>
									<label class="checkbox"> <input type="checkbox">
										Adds product to compair
									</label><br>
									<div class="btn-group">
										<a href="product_details.html" class="defaultBtn"><span
											class=" icon-shopping-cart"></span> Add to cart</a> <a
											href="product_details.html" class="shopBtn">VIEW</a>
									</div>
								</form>
							</div>
						</div>
						<hr class="soften" />
						<div class="row-fluid">
							<div class="span2">
								<img src="assets/img/a.jpg" alt="">
							</div>
							<div class="span6">
								<h5>Product Name</h5>
								<p>Nowadays the lingerie industry is one of the most
									successful business spheres. We always stay in touch with the
									latest fashion tendencies - that is why our goods are so
									popular..</p>
							</div>
							<div class="span4 alignR">
								<form class="form-horizontal qtyFrm">
									<h3>$140.00</h3>
									<label class="checkbox"> <input type="checkbox">
										Adds product to compair
									</label><br>
									<div class="btn-group">
										<a href="product_details.html" class="defaultBtn"><span
											class=" icon-shopping-cart"></span> Add to cart</a> <a
											href="product_details.html" class="shopBtn">VIEW</a>
									</div>
								</form>
							</div>
						</div>
						<hr class="soften" />
					</div>
					<div class="tab-pane fade" id="cat2">

						<div class="row-fluid">
							<div class="span2">
								<img src="assets/img/d.jpg" alt="">
							</div>
							<div class="span6">
								<h5>Product Name</h5>
								<p>Nowadays the lingerie industry is one of the most
									successful business spheres. We always stay in touch with the
									latest fashion tendencies - that is why our goods are so
									popular..</p>
							</div>
							<div class="span4 alignR">
								<form class="form-horizontal qtyFrm">
									<h3>$140.00</h3>
									<label class="checkbox"> <input type="checkbox">
										Adds product to compair
									</label><br>
									<div class="btn-group">
										<a href="product_details.html" class="defaultBtn"><span
											class=" icon-shopping-cart"></span> Add to cart</a> <a
											href="product_details.html" class="shopBtn">VIEW</a>
									</div>
								</form>
							</div>
						</div>
						<hr class="soften" />
						<div class="row-fluid">
							<div class="span2">
								<img src="assets/img/d.jpg" alt="">
							</div>
							<div class="span6">
								<h5>Product Name</h5>
								<p>Nowadays the lingerie industry is one of the most
									successful business spheres. We always stay in touch with the
									latest fashion tendencies - that is why our goods are so
									popular..</p>
							</div>
							<div class="span4 alignR">
								<form class="form-horizontal qtyFrm">
									<h3>$140.00</h3>
									<label class="checkbox"> <input type="checkbox">
										Adds product to compair
									</label><br>
									<div class="btn-group">
										<a href="product_details.html" class="defaultBtn"><span
											class=" icon-shopping-cart"></span> Add to cart</a> <a
											href="product_details.html" class="shopBtn">VIEW</a>
									</div>
								</form>
							</div>
						</div>
						<hr class="soften" />
						<div class="row-fluid">
							<div class="span2">
								<img src="assets/img/d.jpg" alt="">
							</div>
							<div class="span6">
								<h5>Product Name</h5>
								<p>Nowadays the lingerie industry is one of the most
									successful business spheres. We always stay in touch with the
									latest fashion tendencies - that is why our goods are so
									popular..</p>
							</div>
							<div class="span4 alignR">
								<form class="form-horizontal qtyFrm">
									<h3>$140.00</h3>
									<label class="checkbox"> <input type="checkbox">
										Adds product to compair
									</label><br>
									<div class="btn-group">
										<a href="product_details.html" class="defaultBtn"><span
											class=" icon-shopping-cart"></span> Add to cart</a> <a
											href="product_details.html" class="shopBtn">VIEW</a>
									</div>
								</form>
							</div>
						</div>
						<hr class="soften" />
						<div class="row-fluid">
							<div class="span2">
								<img src="assets/img/d.jpg" alt="">
							</div>
							<div class="span6">
								<h5>Product Name</h5>
								<p>Nowadays the lingerie industry is one of the most
									successful business spheres. We always stay in touch with the
									latest fashion tendencies - that is why our goods are so
									popular..</p>
							</div>
							<div class="span4 alignR">
								<form class="form-horizontal qtyFrm">
									<h3>$140.00</h3>
									<label class="checkbox"> <input type="checkbox">
										Adds product to compair
									</label><br>
									<div class="btn-group">
										<a href="product_details.html" class="defaultBtn"><span
											class=" icon-shopping-cart"></span> Add to cart</a> <a
											href="product_details.html" class="shopBtn">VIEW</a>
									</div>
								</form>
							</div>
						</div>
						<hr class="soften" />

					</div>
				</div>

			</div>
		</div>
	</div>
	<!-- Body wrapper -->
</body>
</html>