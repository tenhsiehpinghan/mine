<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:url
		value="/resource/image/books/9780132350884/book_front_cover.png"
		var="bookImage" />
	<img src="${bookImage}" align="left" alt="${book.title}" width="250" />
	<table>
		<tr>
			<td>Title</td>
			<td>${book.title}</td>
		</tr>
		<tr>
			<td>Description</td>
			<td>${book.description}</td>
		</tr>
		<tr>
			<td>Price</td>
			<td>${book.price}</td>
		</tr>
	</table>
</body>
</html>