<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BuscarVoto</title>
</head>
<body>


<h1>Mostrar voto</h1>
<table>
	<tr><td>Id: <%= request.getAttribute("id")%></td></tr>
	<tr><td>Cliente: <%= request.getAttribute("cliente")%></td></tr>
	<tr><td>Multimedia: <%= request.getAttribute("multimedia")%></td></tr>
	<tr><td>Puntos: <%= request.getAttribute("puntos")%></td></tr>
	
	
</table>



<a href="/Demo_Web/index.html">Volver al index</a>










</body>
</html>