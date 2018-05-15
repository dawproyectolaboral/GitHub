<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mostrar multimedia</title>
</head>
<body>



<h1>Mostrar multimedia</h1>
<table>
	<tr><td>Id: <%= request.getAttribute("idmultimedia")%></td></tr>
	<tr><td>Cliente: <%= request.getAttribute("cliente")%></td></tr>
	<tr><td>Prueba deportiva: <%= request.getAttribute("pruebad")%></td></tr>
	<tr><td>Fecha: <%= request.getAttribute("fecha")%></td></tr>
	<tr><td>Comentario: <%= request.getAttribute("comentario")%></td></tr>
	<tr><td>Imagen: <%= request.getAttribute("imagen")%></td></tr>
	<tr><td>Video: <%= request.getAttribute("video")%></td></tr>
	<tr><td>Puntos: <%= request.getAttribute("puntos")%></td></tr>
	<tr><td>Titulo: <%= request.getAttribute("titulo")%></td></tr>
	<tr><td>Comentarios: <%= request.getAttribute("comentarios")%></td></tr>
	<tr><td>Votos: <%= request.getAttribute("votos")%></td></tr>
	
	
</table>



<a href="/Demo_Web/index.html">Volver al index</a>











</body>
</html>