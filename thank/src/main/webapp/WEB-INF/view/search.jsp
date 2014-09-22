<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <%@taglib prefix="spring" uri="http://www.springframework.org/tags"%> --%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 	<form method="GET" action="<c:url value="/search"/>"> --%>
<!-- 		<fieldset> -->
<!-- 			<legend>Search Criteria</legend> -->
<!-- 			<table> -->
<!-- 				<tr> -->
<!-- 					<td><label for="title">Title</label></td> -->
<!-- 					<td><input id="title" name="title" /></td> -->
<!-- 				</tr> -->
<!-- 			</table> -->
<!-- 		</fieldset> -->
<!-- 		<button id="search">Search</button> -->
<!-- 	</form> -->
	<sf:form method="GET" modelAttribute="bookSearchCriteria">
		<fieldset>
			<legend>Search Criteria</legend>
			<table>
				<tr>
					<td>
						<sf:label path="title">Title</sf:label>
					</td>
					<td>
						<sf:input path="title"/>
					</td>
				</tr>
			</table>
		</fieldset>
		<button id="search">Search</button>
	</sf:form>
	<c:if test="${not empty bookList}">
		<table>
			<tr>
				<th>Title</th>
				<th>Description</th>
				<th>Price</th>
			</tr>
			<c:forEach items="${bookList}" var="book">
				<tr>
					<td><a href="<c:url value="/detail/${book.id}"/>">${book.title}</a></td>
					<td>${book.description}</td>
					<td>${book.price}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>