<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>

<div class="container">
	<div class="row d-flex justify-content-center">
		<div class="col">


			<div class="card">
				<div class="card-header">
					<i class="fas fa-table"></i> Quản lý sản phẩm
				</div>
				<div class="card-body">
					<a class="btn btn-primary" href="/spring-mvc/addproduct"
						role="button">Thêm</a>
					<div class="table-responsive">
						<table id="table-product"
							class="table table-striped table-bordered table-hover">
							<thead>
								<tr>
									<th>Id</th>
									<th>Name</th>
									<th>Price</th>
									<th>Category</th>
									<th>Img</th>
									<th>Action</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${productList}" var="product">
									<tr>
										<td>${product.productId}</td>
										<td>${product.productName}</td>
										<td>${product.listPrice}</td>
										<td>${productDAO.getNameById(product.productId)}</td>
										<td><img width="40" height="40"
											src="<c:url value='/resources/images/${product.productImage}'/>"
											alt=""></td>
										<th>
											<button type="button" class="btn btn-success">
												<i class="fas fa-edit"></i>
											</button>
											<button type="button" class="btn btn-danger">
												<i class="far fa-trash-alt"></i>
											</button></th>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>

			</div>
		</div>
	</div>
</div>
<script>
	$(document).ready(function() {
		setTimeout(function() {
			$("table").DataTable({
				rowReorder : {
					selector : "td:nth-child(2)",
				},
				responsive : true,
			});
		}, 500);
	});
</script>