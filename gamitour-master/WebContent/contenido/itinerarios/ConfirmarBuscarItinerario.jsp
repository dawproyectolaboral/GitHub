<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mostrar itinerario</title>
</head>
<body>



<h1>Mostrar itinerario</h1>
<table>
	<tr><td>Id : <%= request.getAttribute("iditinerario") %></td></tr>
	<tr><td>Nombre : <%= request.getAttribute("nombre") %></td></tr>
	<tr><td>Categoria : <%= request.getAttribute("categoria") %></td></tr>
	<tr><td>Duracion : <%= request.getAttribute("duracion") %></td></tr>
	<tr><td>Ubicacion : <%= request.getAttribute("ubicacion") %></td></tr>
	<tr><td>Paradas : <%= request.getAttribute("paradas") %></td></tr>
</table>



<a href="/Demo_Web/index.html">Volver al index</a>







</body>
</html>