<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Cart</title>
</head>
<body>
	<!-- 
Body Section 
-->
	<div class="row">
		<div class="span12">
			<ul class="breadcrumb">
				<li><a href="index.html">Home</a> <span class="divider">/</span></li>
				<li class="active">Check Out</li>
			</ul>
			<div class="well well-small">
				<h1>
					Check Out <small class="pull-right"> 2 Items are in the
						cart </small>
				</h1>
				<hr class="soften" />

				<table class="table table-bordered table-condensed">
					<thead>
						<tr>
							<th>Product</th>
							<th>Description</th>
							<th>Ref.</th>
							<th>Avail.</th>
							<th>Unit price</th>
							<th>Qty</th>
							<th>Total</th>
						</tr>
					</thead>
					<tbody>
							<c:forEach var="item" items="${ Cart }">
								<tr>
									<td><img width="100" src="<c:url value="/assets/user/img/slide/${item.value.product.img}"/>" alt=""></td>
									<td>${item.value.product.title}<br>Carate : 22<br>Model
										: n/a
									</td>
									<td>-</td>
									<td><span class="shopBtn"><span class="icon-ok"></span></span>
									</td>
									<td>${item.value.product.price }000đ</td>
									<td><input type="number" min="0" max="1000" class="span1"
										style="max-width: 34px" placeholder="1"
										id="appendedInputButtons" size="16" type="text" value="2">
									</td>
									<td>$100.00</td>
								</tr>
							</c:forEach>
					</tbody>
				</table>
				<br /> <a href="products.html" class="shopBtn btn-large"><span
					class="icon-arrow-left"></span> Continue Shopping </a> <a
					href="login.html" class="shopBtn btn-large pull-right">Next <span
					class="icon-arrow-right"></span></a>

			</div>
		</div>
	</div>
</body>
</html>