<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MostrarNoticia</title>
</head>
<body>

<h1>Mostrar Noticia</h1>
<table>
	<tr><td>Id: <%= request.getAttribute("id")%></td></tr>
	<tr><td>Nombre: <%= request.getAttribute("nombrenoticia")%></td></tr>
	<tr><td>Texto: <%= request.getAttribute("texto")%></td></tr>
	<tr><td>Fecha de Alta: <%= request.getAttribute("fechaf")%></td></tr>
	<tr><td>Fecha de caducidad: <%= request.getAttribute("fechac")%></td></tr>
	<tr><td>Imagen: <%= request.getAttribute("imagen")%></td></tr>
</table>

<a href="/Demo_Web/index.html">Volver al index</a>

</body>
</html>