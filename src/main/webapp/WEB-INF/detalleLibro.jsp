<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detalle de Libro</title>
</head>
<body>
	<h1>Detalles del Libro</h1>

     <c:if test="${not empty detallesLibro}">
        <ul>
            <c:forEach var="detalle" items="${detallesLibro}">
                <li>${detalle}</li>
            </c:forEach>
        </ul>
    </c:if>

    <c:if test="${not empty mensajeError}">
        <p>${mensajeError}</p>
    </c:if>
	<a href="/libros"> Volver al inicio </a>

</body>
</html>