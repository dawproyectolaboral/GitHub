package com.dawes.parada;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class MostrarParadasItinerarioAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		String nombre = request.getParameter("nombre");
		
		String iditinerario = request.getParameter("iditinerario");
		Integer id = Integer.parseInt(iditinerario);
		
		request.setAttribute("listado", su.getMostrarParadasItinerario(id));
		request.setAttribute("nombre", nombre);
		
		return "contenido/paradas/ConfirmarMostrarParadasItinerario.jsp";
	}
} //Fin class.