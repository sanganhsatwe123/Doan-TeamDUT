<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SẢN PHẨM</title>
</head>
<body>
	<p>ĐÂY LÀ TRANG SẢN PHẨM</p>
	<p> ${slides.id} </p>
	<h1>Slides List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Img</th><th>Caption</th><th>Content</th>
   <c:forEach var="emp" items="${list}">   
   <tr>  
   <td>${slides.id}</td>  
   <td>${slides.img}</td>  
   <td>${slides.caption}</td>  
   <td>${slides.content}</td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
</body>
</html>