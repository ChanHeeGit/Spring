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
<div style="text-align :center">
 <h1> Reading All Request Parameters </h1>
</div>

	<table border = "1" align="center">
		<th>Parameter Name</th>
		<th>Parameter Value(s)</th>
		<tr>
			<td>Item</td>
			<td>${item.item}</td>
		</tr>
		<tr>
			<td>Discription</td>
			<td>${item.dis}</td>
		</tr>
		<tr>
			<td>Price</td>
			<td>${item.price}</td>
		</tr>
		<tr>
			<td>First Name</td>
			<td>${item.fn}</td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td>${item.ln}</td>
		</tr>
		<tr>
			<td>Middle Initial</td>
			<td>${item.mi}</td>
		</tr>
		<tr>
			<td>Address</td>
			<td>${item.address}</td>
		</tr>
		<tr>
			<td>CardType</td>
			<td>${item.credit}</td>
		</tr>
		<tr>
			<td>CreditNumber</td>
			<td>${item.creditnum}</td>
		</tr>
		


	</table>
<!--  <ul>
		<li> Id : ${item.item} </li> 
		<li> Name : ${item.dis} </li> 
		<li> Price : ${item.price} </li> 
		<li> fn : ${item.fn} </li> 
		<li> ln : ${item.ln} </li> 
		<li> mi : ${item.mi} </li> 
		<li> mi : ${item.address} </li> 
		<li> credit : ${item.credit} </li> 
		<li> creditnum : ${item.creditnum} </li> 
		<li> creditnum2 : ${item.creditnum2} </li> 
	</ul>
	-->
	
	
	
	<!--  <table>
		<c:forEach var="item" items="${items}">
			<tr>
			<td> Id : ${item.item}</td>
			<td> Name : ${item.dis} </td> 
			<td> Price : ${item.price} </td> 
			<td> fn : ${item.fn} </td> 
			<td> ln : ${item.ln} </td> 
			<td> mi : ${item.mi} </td> 
			<td> credit : ${item.credit} </td> 
			<td> creditnum : ${item.creditnum} </td> 
			<td> creditnum2 : ${item.creditnum2} </td> 
			</tr>
		</c:forEach>
	</table> 
-->


</body>
</html>