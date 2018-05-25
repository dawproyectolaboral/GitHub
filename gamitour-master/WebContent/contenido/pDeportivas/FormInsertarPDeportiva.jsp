<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insertar p.deportiva</title>


<link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="assets/bootstrap/css/bootstrap-grid.min.css">
<link rel="stylesheet" href="assets/bootstrap/css/bootstrap-reboot.min.css">
<link rel="stylesheet" href="css/select.css">
<link rel="stylesheet" href="assets/theme/css/style.css">
<link rel="stylesheet" href="assets/mobirise/css/mbr-additional.css" type="text/css">



<link rel="shortcut icon" href="logoastur.png">
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<link rel="stylesheet" type="text/css" href="css/demo.css" />
<link rel="stylesheet" type="text/css" href="css/component.css" />

<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.12/css/all.css" integrity="sha384-G0fIWCsCzJIMAVNQPfjH08cyYaUtMwjJwqiRKxxE/rx96Uroj1BtIQ6MLJuheaO9" crossorigin="anonymous">



<style type="text/css">

   body{
    background-image: url("images/img6.png");
    background-repeat: no-repeat;
    background-size:100%;
    
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

 button {
            width: 90px;
            border: none;
            background:#1F2D3D;
            color: #f2f2f2;
            font-size: 18px;
            border-radius: 5px;
            position: relative;
            box-sizing: border-box;
            transition: all 500ms ease;
            padding: 8px;

        }

        button:before {
            content: "";
            position: absolute;
            top: 0px;
            left: 0px;
            width: 0px;
            height: 43px;
            background: rgba(255, 255, 255, 0.7);
            border-radius: 5px;
            transition: all 0.5s ease;
        }

        button:hover:before {
            width: 100%;
        }


    </style>
</head>
<body>
     
    
	
 <div style="height: 60px;">
    <h1 style="text-align:center;color:White;font-family:forte;font-size:40px;margin-top:20px;">GamiAstour</h1>  
</div>
    <div class="cabecera">
            <a class="titcabecera" style="color:White;">INSERTAR P.DEPORTIVA</a>
       </div>
    



<section class="cid-qQSwyVJLVG mbr-fullscreen mbr-parallax-background" id="header15-i">


   

    <div class="mbr-overlay" style="opacity: 0.5; background-color:#5B5B5B;"></div>

    <div class="container align-right" style="text-align: center;">
        <div class="row">

            <div class="col-lg-4 col-md-5" style="margin:auto">
                <div class="form-container" style="overflow-y: auto;margin-top:-120px;">
                    <div class="media-container-column" data-form-type="formoid">
                        <form action="InsertarPDeportiva.do" class="mbr-form" method="POST">
                       

                            <div style="max-height: 340px;">

                                 <div data-for="" >
                                        <div class="form-group" >

                                        <div class="center-on-page">
										<input type="text" name="numParada" value="${nombreParada}"/>
										<input type="text" name="numParada" value="${idparada}"/>
                                        </div>
                                    </div>
                                    </div>
                                    </div>
                                <div data-for="">
                                    <div class="form-group">
                                        <input type="text" class="form-control px-3" name="nombre" data-form-field="" placeholder="Nombre" id="email-header15-i">
                                    </div>
                                </div>
                                <div data-for="">
                                    <div class="form-group">
                                        <input type="date" class="form-control px-3" name="fechaInicio" data-form-field="" placeholder="Fecha de Inicio (año-mes-día):" id="phone-header15-i">
                                    </div>
                                </div>

                                <div data-for="">
                                    <div class="form-group">
                                        <input type="date" class="form-control px-3" name="fechaFin" data-form-field="" placeholder="Fecha de Fin (año-mes-día):" id="phone-header15-i">
                                    </div>
                                </div>

                                <div data-for="">
                                    <div class="form-group">
                                        <textarea class="form-control px-3" name="explicacion" placeholder="Explicación" rows="6" cols="40" ></textarea>
                                    </div>
                                </div>

                                <div data-for="">
                                    <div class="form-group">
                                        <input type="number" class="form-control px-3" name="puntos" data-form-field="" placeholder="Puntos" id="phone-header15-i">
                                    </div>
                                </div>


                                <div data-for="">
                                    <div class="form-group">
                                        
                                                <input type="file" name="pdf" id="file-1" class="inputfile inputfile-1" data-multiple-caption="{count} files selected"  style="display:none" multiple />
                                                <label for="file-1"style="width:100%;height:50px;"> <i class="fas fa-file-pdf"></i>   Elegir PDF</label>                                                
                                            </div>
                                        </div>
                                        <div data-for="">
                                            <div class="form-group">
                                                
                                                        <input type="file" name="video" id="file-1" class="inputfile inputfile-1" data-multiple-caption="{count} files selected"  style="display:none" multiple />
                                                        <label for="file-1"style="width:100%;height:50px;"><i class="fas fa-video"></i>  Elegir Video</label>
                                                    </div>
                                                </div>
                                
                              

                        



                            </div>
                    </div>
                </div>
                <div style="margin-top:10px;">
                    <button type="submit" value="Insertar">Insertar</button>
                    <button type="reset" value="Limpiar">Borrar</button>
                    <a href="/Demo_Web/index.html"><button type="button" value="Volver">Volver</button></a>
                </div>
                </form>

            </div>
        </div>
    </div>
    </div>
    </div>

</section>





</body>
</html>