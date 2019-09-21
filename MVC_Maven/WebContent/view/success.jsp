<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<ul>
		<li> Id : ${customer.id} </li> 
		<li> Name : ${customer.name} </li> 
		<li> Email : ${customer.email} </li> 
	</ul>
	
	
	<table>
		<c:forEach var="customer" items="${customers}">
			<tr>
				<td> ${customer.id}</td>
				<td> ${customer.name}</td>
				<td> ${customer.email}</td>
			</tr>
		</c:forEach>
	</table> 
	
</body>
</html>