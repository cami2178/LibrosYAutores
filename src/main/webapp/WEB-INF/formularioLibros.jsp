<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agregar nuevo Libro</title>
</head>
<body>
<h1>Agrega un nuevo Libro</h1>

	<form action="/procesa/libro" method="POST">
        <div>
            <label for="nombreLibro">Nombre del libro:</label>
            <input type="text"  name="nombreLibro" >
        </div>
        <br>
        <div>
            <label for="nombreAutor">Autor:</label>
            <input type="text" name="nombreAutor" >
        </div>
        <br>
        <div>
            <button>Agregar Libro</button>
        </div>
    </form>
    <br>
	
	<a href="/libros"> Volver al inicio </a>

</body>
</html>