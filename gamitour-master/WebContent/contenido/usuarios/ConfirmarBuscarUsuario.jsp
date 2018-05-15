<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BuscarUsuario</title>
</head>
<body>


<h1>Mostrar usuario</h1>
<table>

	<table>
	<tr><td>ID : <%= request.getAttribute("id") %></td></tr>
	<tr><td>Nombre : <%= request.getAttribute("nombre") %></td></tr>
	<tr><td>Apellidos : <%= request.getAttribute("apellidos") %></td></tr>
	<tr><td>Fecha nacimiento : <%= request.getAttribute("fechaNaci") %></td></tr>
	<tr><td>Email : <%= request.getAttribute("email") %></td></tr>
	<tr><td>Password : <%= request.getAttribute("password") %></td></tr>
	<tr><td>Teléfono : <%= request.getAttribute("telefono") %></td></tr>
	<tr><td>Direccion : <%= request.getAttribute("direccion") %></td></tr>
	<tr><td>Código postal : <%= request.getAttribute("cp") %></td></tr>
	<tr><td>Avatar : <%= request.getAttribute("avatar") %></td></tr>
	<tr><td>Puntos : <%= request.getAttribute("puntos") %></td></tr>
	<tr><td>Fecha registro : <%= request.getAttribute("fecharegi") %></td></tr>
	<tr><td>Rol : <%= request.getAttribute("rol") %></td></tr>
	<tr><td>Nick : <%= request.getAttribute("nick")%> </td></tr>
	<tr><td>Premios : <%= request.getAttribute("premios")%></td></tr>
	<tr><td>Votos : <%= request.getAttribute("votos")%></td></tr>
	<tr><td>Actividades : <%= request.getAttribute("actividades")%></td></tr>
	<tr><td>Multimedia : <%= request.getAttribute("multimedias")%></td></tr>


</table>

<a href="/Demo_Web/index.html">Volver al index</a>




</body>
</html>