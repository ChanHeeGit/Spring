<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="compare.js"></script> <!-- CreditNumber를 비교하는 함수가 들어있는 js 호출 -->


</head>
<body>

<form name = "orderform" action="/helloMVC/DoSubmit" method="get" onsubmit="return CompareCreditNumber();">

<div style="text-align :center">
 <h1> Order Form </h1>
</div>
	Item Number : <input type="text" name="item"><br>
	Description : <input type="text" name="dis"><br>
	Price Each : <input type="text" name="price"><br>
	<hr>
	First Name : <input type="text" name="fn"><br>
	Last Name : <input type="text" name="ln"><br>
	Middle Initial : <input type="text" name="mi"><br>
	Shipping Address : <input type="text" name="address" ><br>
	Credit Card : <br>
	<input type="radio" name="credit" value="visa">Visa<br>
	<input type="radio" name="credit" value="masterCard">MasterCard<br>
	<input type="radio" name="credit" value="american Express">American Express<br>
	<input type="radio" name="credit" value="discovery">Discovery<br>
	<input type="radio" name="credit" value="java SmartCard">Java SmartCard<br>
	Credit Card Number : <input type="password" name="creditnum"><br>
	Repeat Credit Card Number : <input type="password" name="creditnum2"><br> 
	<div style="text-align:center"><input type="submit" value="Submit Order"></div>
	
	
</form>
</body>
</html>