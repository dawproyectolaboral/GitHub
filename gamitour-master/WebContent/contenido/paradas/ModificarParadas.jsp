<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script language="JavaScript" SRC="js/mapaModificar.js"></script>
<title>Modificar Paradas</title>
<style type="text/css">

    body{
        background-color: #EFF4F5;
    }
    .titulo{
    text-align:center;
    font-size:20px;
    }
    .cabecera{
        width: 100%;
        height: 50px;
        background-color: #1F2D3D;
        text-align: center;
        vertical-align: middle;
        display: table;
    }

.titcabecera{
   display: table-cell;
   vertical-align: middle;
    font-size:25px;
    color:white;
}

table {

font: 75%/1.5em arial, geneva, sans-serif;
border-collapse: collapse;
margin: auto;
margin-top:50px;
font-size:17px;
color:#EFF4F5;

}

td {
  
border-bottom: 8px solid #fff;
border-left: 1px dotted #fff;
vertical-align: top;
padding: 12px;
border-style:groove;

}

tr {
    background-color: #64A7D1;
    
}

input{
    background-color: #EFF4F5;
    
   
   
}

.contenido{
    margin:auto;
}
.botones{
margin-top:10px;

display:table;
width: 100%;
        height: 50px;
      
        text-align: center;
  
}
.boton{
    display:table-cell;
    vertical-align: middle;
    
}

.button{

    border-radius: 9px;
    width:140px;
    padding: 5px;
    background-color: #1F2D3D;
    color:#EFF4F5;
}

#map {
    width: 300px;
    height: 200px;
}


    </style>
</head>
<body>
	<p class="titulo">GAMITOUR</p>
        
  
<div class="cabecera">
        <a class="titcabecera">MODIFICAR PARADAS</a>
   </div>

<div class="contenido">
	<form action="ModificarParadas.do" method="post">
	<table>
		<input type="hidden" name="numeroParada" value="${numeroParada}"/>
		<tr>
			<td>Nombre: </td>
			<td><input type="text" name="nombreNuevo" value="${nombre}"/></td>
		</tr>
		<tr>
			<td>Ubicación: </td><td>
			 <div id="map"></div>
			  <input type="hidden" id="coorden" value="${ubicacion}" name="ubicacionVieja"/>
    		<input type="text" readonly value="${ubicacion}" id="ubicacion" class="form-control px-3" name="ubicacionNueva" data-form-field="" placeholder="Ubicación" id="phone-header15-i">
                                     
			<!-- <td><input type="text" name="ubicacionNueva" value="${ubicacion}"/> -->
			</td> 
		</tr>
		<tr>
			<td>Historía: </td>
			<td><input type="text" name="historiaNueva" value="${historia}"/></td>
		</tr>
		<tr>
			<td>Anecdotario: </td>
			<td><textarea rows="6" cols="40" name="anecdotarioNuevo" maxlength="200" >${anecdotario}</textarea>
		</tr>
		<tr>
			<td>Gastronomía: </td>
			<td><textarea rows="6" cols="40" name="gastronomiaNueva" maxlength="200"> ${gastronomia}</textarea>
			</tr>
		<tr>
			<td>Imagen: </td>
			<td><textarea rows="6" cols="40" name="imagenNueva" maxlength="200" >${imagen}</textarea>
		</tr>

</table>	
<div class="botones">
     
    <div class="boton">
<input class="button" type="submit" value="Modificar">
<input class="button" type="reset" value="Limpiar">
<a href="/Demo_Web/index.html"><input class="button" type="button" value="Volver"></a>

</div>

</div>


</form>
</div>




 <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBuELBhU6RUMASvt7LMELsAAt46gJmQNRc&callback=initMap" async defer></script>
   


</body>
</html>