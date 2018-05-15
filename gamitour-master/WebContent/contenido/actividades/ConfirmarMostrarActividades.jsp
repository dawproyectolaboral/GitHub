<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script defer src="https://use.fontawesome.com/releases/v5.0.6/js/all.js"></script>

<script type="text/javascript" src="jquery/jquery-3.3.1.js"></script>
<script type="text/javascript" src="jquery/jquery.tablesorter.js"></script>
<script type="text/javascript" src="jquery/js.js"></script>
<link href="css/mostrar.css" rel="stylesheet">


</head>
<body>


<div  id="cabecera">
<h1>Actividades  </h1>
</div>

<div style="overflow-x: auto;width:95%;margin: auto;">
<table style="margin:  auto;" id="tabla" class="tablesorter">
 <thead>

<tr>
<tr><th>ID <i class="fas fa-sort"></i></th>
<th>NOMBRE <i class="fas fa-sort"></i></th>
<th>FECHA INICIO <i class="fas fa-sort"></i></th>
<th>FECHA FIN <i class="fas fa-sort"></i></th>
<th>UBICACION <i class="fas fa-sort"></i></th>
<th>PARTICIPANTES <i class="fas fa-sort"></i></th>
<th>PRECIO <i class="fas fa-sort"></i></th>
<th>IMAGEN <i class="fas fa-sort"></i></th>
<th>PUNTOS <i class="fas fa-sort"></i></th>
</tr>
</thead>
<tbody>
<c:forEach items="${listado}" var="unaActividad">	
	<tr>
		<td>${unaActividad.idactividad}</td>
		<td>${unaActividad.nombre}</td>
		<td>${unaActividad.fechainicio}</td>
		<td>${unaActividad.fechafin}</td>
		<td>${unaActividad.ubicacion}</td>
		<td>${unaActividad.numparticipantes}</td>
		<td>${unaActividad.precio}</td>
		<td>${unaActividad.imagen}</td>
		<td>${unaActividad.puntos}</td>
		<td><a id="icono" href="BorrarActividad.do?idBorrar=${unaActividad.nombre}"><i class="fas fa-trash-alt"></i></a></td>
		<td><a id="icono" href="ModificarActividadPaso.do?nombreActividad=${unaActividad.nombre}"><i class="far fa-edit"></i></a></td>
		
	</tr>
</c:forEach>
</tbody>
</table>
</div>


             <div class="seccion">
                 
                 <div class="cajamenu">
                        <a href="contenido/actividades/FormInsertarActividad.jsp">Insertar Actividad
                                <br>
                                <i class="fas fa-sort-amount-up"></i></a>

                 </div>
                 <div class="cajamenu">
                     <a href="/Demo_Web/index.html">Volver al Menú
                        <br>
                        <i class="fas fa-undo"></i></a></div>
               
          
            
         </div>
	


</body>
</html>