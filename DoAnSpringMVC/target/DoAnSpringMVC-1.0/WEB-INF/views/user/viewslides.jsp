<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View List</title>
</head>
<body>
	<p>ĐÂY LÀ TRANG SẢN PHẨM</p>
	<h1>Slides List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Img</th><th>Caption</th><th>Content</th>
   <c:forEach var="data" items="${list}">   
   <tr>  
   <td>${data.id}</td>  
   <td>${data.img}</td>  
   <td>${data.caption}</td>  
   <td>${data.content}</td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
</body>
</html>