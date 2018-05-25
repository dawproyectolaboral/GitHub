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
            <div id="cabecera">
                <h1>P.Deportivas de "${nombre}" </h1>
                <input type="hidden" value="${nombre}" name="nombreParada"/>
            </div>
            <div style="overflow-x: auto;width:95%;margin: auto;max-height: 230px;">
                <table style="margin:  auto;" id="tabla" class="tablesorter">
                    <thead>
                        <tr>
                    <th>ID <i class="fas fa-sort"></th>
                    <th>NOMBRE <i class="fas fa-sort"></th>
                    <th>FECHA DE INICIO <i class="fas fa-sort"></th>
                    <th>FECHA DE FIN <i class="fas fa-sort"></th>
                    <th>EXPLICACION <i class="fas fa-sort"></th>
                    <th>PUNTOS <i class="fas fa-sort"></th>
                    <th>NUMERO DE PARADA <i class="fas fa-sort"></th>
                    <th>PDF <i class="fas fa-sort"></th>
                    <th>VIDEO <i class="fas fa-sort"></th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${listado}" var="unaPDeportiva">	
	            <tr>
                    <td>${unaPDeportiva.idpruebadeportiva}</td>
                    <td>${unaPDeportiva.nombre}</td>
                    <td>${unaPDeportiva.fechainicio}</td>
                    <td>${unaPDeportiva.fechafin}</td>
                    <td>${unaPDeportiva.explicacion}</td>
                    <td>${unaPDeportiva.puntos}</td>
                    <td>${unaPDeportiva.parada.numeroParada}</td>
                    <td>${unaPDeportiva.pdf}</td>
                     <td>${unaPDeportiva.video}</td>
		            <td>
                        <a id="icono" href="BorrarPDeportiva.do?nombrePDeportivaBorrar=${unaPDeportiva.nombre}"><i class="fas fa-trash-alt"></i></a>
                                </td>
                               <!--  <td>
                                    <a id="icono" href="contenido/pDeportivas/ModificarPDeportiva.jsp?idpruebadeportiva=${unaPDeportiva.idpruebadeportiva}&nombre=${unaPDeportiva.nombre}&fechainicio=${unaPDeportiva.fechainicio}&fechafin=${unaPDeportiva.fechafin}&explicacion=${unaPDeportiva.explicacion}&puntos=${unaPDeportiva.puntos}&parada=${unaPDeportiva.parada.numeroParada}&pdf=${unaPDeportiva.pdf}&video=${unaPDeportiva.video}"><i class="far fa-edit"></i></a>
                                </td>
                               -->
                        </tr>
                        </c:forEach>
                        </tbody>
                </table>
            </div>
            <div class="seccion">
                    <!--<div class="cajamenu">
                 <a href="contenido/pDeportivas/FormInsertarPDeportiva.jsp?numParada=${nombre}&idParada="${idparada}">Insertar P.Deportiva 
            <br>
            <i class="fas fa-sort-amount-up"></i></a>
                </div>-->
                <div class="cajamenu">
                    <a href="/Demo_Web/index.html">Volver al Menú
            <br>
            <i class="fas fa-undo"></i></a></div>
               
            </div>

        </body>

        </html>