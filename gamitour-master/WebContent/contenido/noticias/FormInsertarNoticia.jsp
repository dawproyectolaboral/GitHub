<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>InsertarNoticia</title>
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

    </style>
</head>
<body>
    
 <p class="titulo">GAMITOUR</p>
        
  
<div class="cabecera">
        <a class="titcabecera">INSERTAR NOTICIA</a>
   </div>

<div class="contenido">
<form action="../../InsertarNoticia.do" method="get">

<table>

<tr>
<td>Introduce el nombre de la noticia: </td>
<td><input type="text" name="nombrenoticia"></td>
</tr>

<tr>
<td>Introduce el texto de la noticia:
<td><textarea rows="6" cols="40" maxlength="200"  name="textonoticia" ></textarea>
<!--  <input type="text" name="textonoticia"> --></td>
</tr>

<tr>
<td>Introduce la fecha de alta:</td>
<td><input type="text" name="fechaalta"></td>
</tr>

<tr>
<td>Introduce una fecha de caducidad:</td>
<td><input type="text" name="fechacaducidad"></td>
</tr>

<tr>
<td>Introduce una imagen:</td>
<td><input type="text" name="imagen"></td>
</tr>
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





</body>
</html>