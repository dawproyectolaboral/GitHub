<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
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
<div style="height: 60px;">
        <h1 style="text-align:center;color:White;font-family:forte;font-size:40px;margin-top:20px;">GamiAstour</h1>  
    </div>


<div  id="cabecera">
<h1>Votos  </h1>
</div>

<div style="overflow-x: auto;width:95%;margin: auto;max-height: 230px;">
<table style="margin:  auto;" id="tabla" class="tablesorter">
 <thead>

<tr>
<tr><th>ID <i class="fas fa-sort"></th>
<th>PUNTOS <i class="fas fa-sort"></th>
<th>NOMBRE CLIENTE <i class="fas fa-sort"></th>
<th>TITULO MULTIMEDIA <i class="fas fa-sort"></th>
</tr>
</thead>
<tbody>
<c:forEach items="${listado}" var="unVoto">	
	<tr>
		<td>${unVoto.idvoto}</td>
		<td>${unVoto.puntos}</td>
		<td>${unVoto.cliente.nick}</td>
		<td>${unVoto.multimedia.titulo}</td>
		<td><a id="icono" href="BorrarVoto.do?idBorrar=${unVoto.idvoto}"><i class="fas fa-trash-alt"></i></a></td>
		<td><a id="icono" href="ModificarVotosPaso.do?idvoto=${unVoto.idvoto}"><i class="far fa-edit"></i></a></td>
		
	</tr>
</c:forEach>
</tbody>
</table>

</div>


             <div class="seccion">
                 
                 <div class="cajamenu">
                        <a href="InsertarVotoConSelect.do">Insertar Votos
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