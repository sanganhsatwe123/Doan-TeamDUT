<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="header" >
	<div class="container">

		<!-- Navbar ================================================== -->
		<div id="logoArea" class="navbar">
			<a id="smallScreen" data-target="#topMenu" data-toggle="collapse"
				class="btn btn-navbar"> <span class="icon-bar"></span> <span
				class="icon-bar"></span> <span class="icon-bar"></span>
			</a>
			<div class="navbar-inner">
				<a class="brand" href="index.html">Electric</a>
				<form class="form-inline navbar-search" method="post"
					action="products.html">
					<input id="srchFld" class="srchTxt" type="text" /> <select
						class="srchTxt">
						<option>All</option>
						<option>CLOTHES</option>
						<option>FOOD AND BEVERAGES</option>
						<option>HEALTH & BEAUTY</option>
						<option>SPORTS & LEISURE</option>
						<option>BOOKS & ENTERTAINMENTS</option>
					</select>
					<button type="submit" id="submitButton" class="btn btn-primary">
						Go</button>
				</form>
				<ul id="topMenu" class="nav pull-right">
					<li class=""><a href="special_offer.html">Specials Offer</a></li>
					<li class=""><a href="normal.html">Delivery</a></li>
					
					<%
					if (request.getSession().getAttribute("userSession") != null) {
					%>
					<li class=""><a href="/spring-mvc/dangxuat">Logout</a></li>
					<li class="nav-item">
					<a class="nav-link" href="trang-chu/profile"
						id="userDropdown" role="button" aria-expanded="false"> 
						<i class="fas fa-user-circle fa-fw"></i> ${userSession.email}
					</a>
					</li>
					<%
					} else {
					%>
					<li class="nav-item"><a class="nav-link"
						href="/spring-mvc/dangnhap">Login</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/spring-mvc/dangky">SignUp</a></li>
					<%
					}
					%>



				</ul>
			</div>
		</div>
	</div>
</div>