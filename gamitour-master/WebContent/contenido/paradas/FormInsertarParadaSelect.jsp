<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script language="JavaScript" SRC="js/mapa.js"></script>
<link rel="stylesheet" type="text/css" href="css.css">
<title>InsertarParada</title>

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
        <a class="titcabecera">INSERTAR PARADA</a>
  </div>

<div class="contenido">
<form action="InsertarParada.do" method="POST">

<table>

<tr><td>Itinerario asociado: </td><td>


<select name="nomItinerario">
	<c:forEach items="${itinerarios}" var="it">
		 <option value="${it.nombre}">${it.nombre}</option>
	</c:forEach>
</select>


</td></tr>
<tr><td>Nombre: </td><td><input type="text" name="nomParada"></td></tr>
<!--  
<tr><td>N�mero: </td><td><input type="text" name="numParada"></td></tr>
-->
<tr><td>Ubicacion: </td><td>
<div id="map"></div>
<input type="text" readonly id="ubicacion" class="form-control px-3" name="ubicacion" data-form-field="" placeholder="Ubicación" id="phone-header15-i">

</td></tr>
<tr><td>Historia: </td><td><textarea rows="6" cols="40" name="histParada" ></textarea></td></tr>
<tr><td>Anecdotario: </td><td><textarea rows="6" cols="40" name="anecParada" ></textarea></td></tr>
<tr><td>Gastronom�a: </td><td><textarea rows="6" cols="40" name="gastroParada" ></textarea></td></tr>
<tr><td>Imagen: </td><td><input type="text" name="imgParada"></td></tr>

</table>	
<div class="botones">
     
<div class="boton">
<input class="button" type="submit" value="Insertar">
<input class="button" type="reset" value="Limpiar">
<a href="/Demo_Web/index.html"><input class="button" type="button" value="Volver"></a>

</div>

</div>


</form>
</div>


 <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBuELBhU6RUMASvt7LMELsAAt46gJmQNRc&callback=initMap" async defer></script>
   
</body>
</html>