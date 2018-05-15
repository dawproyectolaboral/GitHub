<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mostrar parada</title>
</head>
<body>



<h1>Mostrar parada</h1>

<table>
	<tr><td>Id : <%= request.getAttribute("idParada") %></td></tr>
	<tr><td>Nombre : <%= request.getAttribute("nomParada") %></td></tr>
	<tr><td>Numero : <%= request.getAttribute("nParada") %></td></tr>
	<tr><td>Ubicacion : <%= request.getAttribute("ubicParada") %></td></tr>
	<tr><td>Historia : <%= request.getAttribute("histParada") %></td></tr>
	<tr><td>Anecdotario : <%= request.getAttribute("anecParada") %></td></tr>
	<tr><td>Gastronomia : <%= request.getAttribute("gastParada") %></td></tr>
	<tr><td>Imagen : <%= request.getAttribute("imgParada") %></td></tr>
	<tr><td>Itinerario: <%= request.getAttribute("itinerario") %></td></tr>
	<tr><td>Pruebas culturales : <%= request.getAttribute("pCulturales") %></td></tr>
	<tr><td>Pruebas deportivas : <%= request.getAttribute("pDeportivas") %></td></tr>
</table>



<a href="/Demo_Web/index.html">Volver al index</a>







</body>
</html>