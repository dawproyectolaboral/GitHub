<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mostrar actividad</title>
</head>

<body>

<h1>Mostrar actividad</h1>

<table>
	<tr><td>Id: <%= request.getAttribute("id")%></td></tr>
	<tr><td>Fecha inicio : <%= request.getAttribute("fechai") %></td></tr>
	<tr><td>Fecha fin : <%= request.getAttribute("fechaf") %></td></tr>
	<tr><td>Ubicacion: <%= request.getAttribute("ubicacion") %></td></tr>
	<tr><td>Participantes: <%= request.getAttribute("participantes") %></td></tr>
	<tr><td>Precio: <%= request.getAttribute("precio") %></td></tr>
	<tr><td>Puntos : <%= request.getAttribute("puntos") %></td></tr>
	<tr><td>Clientes : <%= request.getAttribute("clientes") %></td></tr>
</table>

<a href="/Demo_Web/index.html">Volver al index</a>

</body>
</html>