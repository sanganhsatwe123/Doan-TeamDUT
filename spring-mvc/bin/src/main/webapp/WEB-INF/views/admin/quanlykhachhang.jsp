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
					<i class="fas fa-table"></i> Quản lý khách hàng
				</div>
				<div class="card-body">
					<div class="table-responsive">
						<table id="table-product"
							class="table table-striped table-bordered table-hover">
							<thead>
								<tr>
									<th>Id</th>
									<th>Name</th>
									<th>Email</th>
									<th>Address</th>
									<th>Phone</th>
									<th>Note</th>
									<th>Ngày tạo</th>
									<th>Mã tài khoản</th>
									<!-- <th>Mã khách hàng</th> -->
									<th>Action</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${customerList}" var="customer">
									<tr>
										<td>${customer.id_customer}</td>
										<td>${customer.name}</td>
										<td>${customer.email}</td>
										<td>${customer.address}</td>
										<td>${customer.phone_number}</td>
										<td>${customer.note}</td>
										<td>${customer.create_at}</td>
										<td>${customer.id_user}</td>
										<!-- <th>Type user</th> -->
										<td>Sửa</td>
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
