package com.dawes.itinerario;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Itinerario;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class ModificarItinerarioPasoAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		Itinerario itinerario = (Itinerario) su.getDetalleItinerario(request.getParameter("nombre"));
		
		request.setAttribute("nombre", itinerario.getNombre());
		request.setAttribute("categoria", itinerario.getCategoria());
		request.setAttribute("duracion", itinerario.getDuracion());
		request.setAttribute("ubicacion", itinerario.getUbicacion());
	

		
		return "contenido/itinerarios/ModificarItinerarios.jsp";
	}

}
