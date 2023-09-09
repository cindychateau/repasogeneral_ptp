<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Numero</title>
</head>
<body>
	<h1>¡Bienvenid@ ${nombre} !</h1>
	
	<!-- for(int i=0; i<=numero; i++) -->
	<c:forEach begin="1" step="1" end="${numero}">
		<p>${nombre}</p>
	</c:forEach>
	
	<ul>
		<!-- 
		frutas = {"fresas", "platano", "mango", "papaya"}
		fruta = "fresas"
		fruta = "platano".....
		 -->
		<c:forEach items="${frutas}" var="fruta">
			<li>${fruta}</li>
		</c:forEach>
	</ul>
	<h2>${frutas[2]}</h2>
	<p>${prueba.regresaAlgo()}</p>
</body>
</html>