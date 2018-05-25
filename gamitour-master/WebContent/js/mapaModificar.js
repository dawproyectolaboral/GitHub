var map;
var contador=0;
google.maps.event.addDomListener(window, 'load', init);

function initMap() {

    var ubicacion = document.getElementById("coorden").value;
   
    var comparar = ',';
    var separador = 0;

    for(var i=0; i< ubicacion.length; i++){
        if(ubicacion.charAt(i)==comparar){
            separador = i;
        }
    }

    latitudString = ubicacion.substring(0,separador);
    longitudString = ubicacion.substring(separador+2, ubicacion.length);
    latitud = parseFloat(latitudString);
    longitud = parseFloat(longitudString);

   // alert("la latitud es :"+ latitud);
  //  alert("la longitud es :"+ longitud);
   
    var myLatLng = {lat: latitud, lng: longitud};
    map = new google.maps.Map(document.getElementById('map'), {
    center: myLatLng ,
    zoom: 10
});

//funcion cuando clickas 
map.addListener('click',function(e) {
		
              placeMarkerAndPanTo(e.latLng, map);
		
		});
     //pintar marca
    function placeMarkerAndPanTo(latLng, map) {
        if(contador>0){
            //FALLA Y LA APLICACION SE PARA, POR ESO SOLO PINTA UNO Y NO CONTINUA
            marker.setPosition(null)
            contador=0;
        }
       //construir marca
        var coordenadas = latLng;
        var marker = new google.maps.Marker({position: latLng,map: map});  
        map.panTo(latLng);
        contador++;
        
        document.getElementById("ubicacion").value = coordenadas; 
      }
      
  }//fin init



