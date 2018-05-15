<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BuscarPremio</title>
</head>
<body>
<h1>Mostrar Premio</h1>
<table>
	<tr><td>Id: <%= request.getAttribute("id")%></td></tr>
	<tr><td>Nombre: <%= request.getAttribute("nombrepremio")%></td></tr>
	<tr><td>Descripcion: <%= request.getAttribute("descripcion")%></td></tr>
	<tr><td>Imagen: <%= request.getAttribute("imagen")%></td></tr>
	<tr><td>Fecha de Activacion: <%= request.getAttribute("fechadeactivacion")%></td></tr>
	<tr><td>Fecha de Consumo: <%= request.getAttribute("fechaconsumo")%></td></tr>
	<tr><td>Puntos: <%= request.getAttribute("puntos")%></td></tr>
	
</table>

<a href="/Demo_Web/index.html">Volver al index</a>

</body>
</html>