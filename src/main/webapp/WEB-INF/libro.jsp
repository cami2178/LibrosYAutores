<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de Libros</title>
</head>
<body>
	  <ul>
        <c:forEach items="${listaLibros}" var="libro">
            <li><a href="/libros/${libro.key}">${libro.key}</a></li>
        </c:forEach>
    </ul>
    <br>
    <a href="/libros/formulario">
        <button>Agregar un nuevo libro</button>
    </a>
</body>
</html>