var map;
var contador=0;
google.maps.event.addDomListener(window, 'load', init);

function initMap() {
  //posicion del mapa inicial
  var myLatLng = {lat: 40.39603, lng: -3.550693};
      map = new google.maps.Map(document.getElementById('map'), {
      center: myLatLng ,
      zoom: 5
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
    
    //alert(coordenadas);
    var marker = new google.maps.Marker({position: latLng,map: map});  
    map.panTo(latLng);
    contador++;
    document.getElementById("ubicacion").value = coordenadas; 
  }
	

}//fin init