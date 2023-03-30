<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
<!DOCTYPE html>
<html lang="en">
<head>
<title>Trang chủ</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>

	<!-- 
Body Section 
-->
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
					only valid for online order. <br> <br> <a
						class="defaultBtn" href="#">Click here </a>
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
			<div class="well np">
				<div id="myCarousel" class="carousel slide homCar">
				
					<div class="carousel-inner">
						<c:forEach var="item" items="${userList}" varStatus="index">
							<c:if test="${index.first}">
								<div class="item active">
							</c:if>
							<c:if test="${ not index.first}">
								<div class="item">
							</c:if>
							<img style="width: 100%"
								src="<c:url value="/assets/user/img/slide/${item.img}"/>"
								alt="bootstrap ecommerce templates">
							<div class="carousel-caption">
								<h4>${item.caption}</h4>
								<p>
									<span>${item.content}</span>
								</p>
							</div>
							</div>
						</c:forEach>
					</div>
					<a class="left carousel-control" href="#myCarousel"
						data-slide="prev">&lsaquo;</a> <a class="right carousel-control"
						href="#myCarousel" data-slide="next">&rsaquo;</a>
				</div>
			</div>
			<!--
New Products
-->
			<div class="well well-small">
				<h3>New Products</h3>
				<hr class="soften" />
				<div class="row-fluid">
					<div id="newProductCar" class="carousel slide">
						<div class="carousel-inner">
							<div class="item active">
								<ul class="thumbnails">
									<li class="span3">
										<div class="thumbnail">
											<a class="zoomTool" href="product_details.html"
												title="add to cart"><span class="icon-search"></span>
												QUICK VIEW</a> <a href="#" class="tag"></a> <a
												href="product_details.html"><img
												src="assets/img/bootstrap-ring.png" alt="bootstrap-ring"></a>
										</div>
									</li>
									<li class="span3">
										<div class="thumbnail">
											<a class="zoomTool" href="product_details.html"
												title="add to cart"><span class="icon-search"></span>
												QUICK VIEW</a> <a href="#" class="tag"></a> <a
												href="product_details.html"><img src="assets/img/i.jpg"
												alt=""></a>
										</div>
									</li>
									<li class="span3">
										<div class="thumbnail">
											<a class="zoomTool" href="product_details.html"
												title="add to cart"><span class="icon-search"></span>
												QUICK VIEW</a> <a href="#" class="tag"></a> <a
												href="product_details.html"><img src="assets/img/g.jpg"
												alt=""></a>
										</div>
									</li>
									<li class="span3">
										<div class="thumbnail">
											<a class="zoomTool" href="product_details.html"
												title="add to cart"><span class="icon-search"></span>
												QUICK VIEW</a> <a href="product_details.html"><img
												src="assets/img/s.png" alt=""></a>
										</div>
									</li>
								</ul>
							</div>
							<div class="item">
								<ul class="thumbnails">
									<li class="span3">
										<div class="thumbnail">
											<a class="zoomTool" href="product_details.html"
												title="add to cart"><span class="icon-search"></span>
												QUICK VIEW</a> <a href="product_details.html"><img
												src="assets/img/i.jpg" alt=""></a>
										</div>
									</li>
									<li class="span3">
										<div class="thumbnail">
											<a class="zoomTool" href="product_details.html"
												title="add to cart"><span class="icon-search"></span>
												QUICK VIEW</a> <a href="product_details.html"><img
												src="assets/img/f.jpg" alt=""></a>
										</div>
									</li>
									<li class="span3">
										<div class="thumbnail">
											<a class="zoomTool" href="product_details.html"
												title="add to cart"><span class="icon-search"></span>
												QUICK VIEW</a> <a href="product_details.html"><img
												src="assets/img/h.jpg" alt=""></a>
										</div>
									</li>
									<li class="span3">
										<div class="thumbnail">
											<a class="zoomTool" href="product_details.html"
												title="add to cart"><span class="icon-search"></span>
												QUICK VIEW</a> <a href="product_details.html"><img
												src="assets/img/j.jpg" alt=""></a>
										</div>
									</li>
								</ul>
							</div>
						</div>
						<a class="left carousel-control" href="#newProductCar"
							data-slide="prev">&lsaquo;</a> <a class="right carousel-control"
							href="#newProductCar" data-slide="next">&rsaquo;</a>
					</div>
				</div>

			</div>
			<!--
	Featured Products
	-->
			<div class="well well-small">
				<h3>
					<a class="btn btn-mini pull-right" href="products.html"
						title="View more">VIew More<span class="icon-plus"></span></a>
					Featured Products
				</h3>
				<hr class="soften" />
				<div class="row-fluid">
					<c:if test="${itemList.size() > 0}">
						<ul class="thumbnails">
						<c:forEach var="item" items="${itemList }" varStatus="loop">
							<li class="span4">
							<div class="thumbnail">
								<a class="zoomTool" href="<c:url value="product/${item.id_product}"/>"
									title="add to cart"><span class="icon-search"></span> QUICK
									VIEW</a> <a href="<c:url value="product/${item.id_product}"/>"><img
									src="<c:url value="/assets/user/img/slide/${item.img }"/>" 
									alt=""></a>
								<div class="caption">
									<h5>${ item.productName}</h5>
									<h4>
										<a class="defaultBtn" href="product_details.html"
											title="Click to view"><span class="icon-zoom-in"></span></a>
										<a class="shopBtn" href="<c:url value="/AddCart/${addCart.id_product }"/>" title="add to cart"><span
											class="icon-plus"></span></a> <span class="pull-right"><fmt:formatNumber type="number" groupingUsed="true" value="${item.price}"/>,000đ</span>
									</h4>
								</div>
							</div>
						</li>
							<c:if test="${(loop.index + 1)% 3 == 0 || (loop.index + 1) == itemList.size()}">
								</ul>
								<c:if test="${(loop.index + 1) <  itemList.size()}">
									<ul class="thumbnails" >
								</c:if>
							</c:if>
						</c:forEach>
					</c:if>

						
				</div>
			</div>

			<div class="well well-small">
				<a class="btn btn-mini pull-right" href="#">View more <span
					class="icon-plus"></span></a> Popular Products
			</div>
			<hr>
			<div class="well well-small">
				<a class="btn btn-mini pull-right" href="#">View more <span
					class="icon-plus"></span></a> Best selling Products
			</div>
		</div>
	<!-- 
Clients 
-->
	<section class="our_client">
		<hr class="soften" />
		<h4 class="title cntr">
			<span class="text">Manufactures</span>
		</h4>
		<hr class="soften" />
		<div class="row">
			<div class="span2">
				<a href="#"><img alt="" src="assets/img/1.png"></a>
			</div>
			<div class="span2">
				<a href="#"><img alt="" src="assets/img/2.png"></a>
			</div>
			<div class="span2">
				<a href="#"><img alt="" src="assets/img/3.png"></a>
			</div>
			<div class="span2">
				<a href="#"><img alt="" src="assets/img/4.png"></a>
			</div>
			<div class="span2">
				<a href="#"><img alt="" src="assets/img/5.png"></a>
			</div>
			<div class="span2">
				<a href="#"><img alt="" src="assets/img/6.png"></a>
			</div>
		</div>
	</section>


</body>
</html>
