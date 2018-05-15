<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mostrar pDeportiva</title>
</head>
<body>



<h1>Mostrar prueba deportiva</h1>

<table>
	<tr><td>Id : <%= request.getAttribute("idpruebadeportiva") %></td></tr>
	<tr><td>Nombre : <%= request.getAttribute("nombre") %></td></tr>
	<tr><td>Fecha de inicio : <%= request.getAttribute("fechainicio") %></td></tr>
	<tr><td>Fecha de fin : <%= request.getAttribute("fechafin") %></td></tr>
	<tr><td>Explicacion : <%= request.getAttribute("explicacion") %></td></tr>
	<tr><td>Puntos : <%= request.getAttribute("puntos") %></td></tr>
	<tr><td>Puntos : <%= request.getAttribute("pdf") %></td></tr>
	<tr><td>Puntos : <%= request.getAttribute("video") %></td></tr>
</table>



<a href="/Demo_Web/index.html">Volver al index</a>







</body>
</html>