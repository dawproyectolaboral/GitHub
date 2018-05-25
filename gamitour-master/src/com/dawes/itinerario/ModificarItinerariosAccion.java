package com.dawes.itinerario;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dawes.modelo.Itinerario;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class ModificarItinerariosAccion extends Accion {
	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		ServiceGenericDAO service = new ServiceGenericDAOImp();
		
		Itinerario itinerario = (Itinerario)service.getDetalleItinerario(request.getParameter("nombreViejo"));
		
		itinerario.setNombre(request.getParameter("nombreNuevo"));
		itinerario.setCategoria(request.getParameter("categoriaNueva"));
		itinerario.setDuracion(request.getParameter("duracionNueva"));
		String ubica = request.getParameter("ubicacionNueva");
		String ubicaVieja = request.getParameter("ubicacionVieja");

		if(ubica.charAt(0)=='('){
			
			ubica = ubica.substring(1,ubica.length()-1);
			itinerario.setUbicacion(ubica);
		}else{
			itinerario.setUbicacion(ubicaVieja);
		}
		
		
		
		service.update(itinerario);
		
		return "index.html";
	}
} // Fin class