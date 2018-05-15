package com.dawes.itinerario;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Itinerario;
import com.dawes.modelo.Parada;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class MostrarItinerarioAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		String nombrebuscar = request.getParameter("nombre");
		
		Itinerario itinerario = (Itinerario)su.getDetalleItinerario(nombrebuscar);
		
		Integer id = itinerario.getIditinerario();
		String iditinerario = String.valueOf(id);
		request.setAttribute("iditinerario", iditinerario);
		
		String nombre = itinerario.getNombre();
		request.setAttribute("nombre",nombre);
		
		String categoria = itinerario.getCategoria();
		request.setAttribute("categoria",categoria);
		
		String duracion = itinerario.getDuracion();
		request.setAttribute("duracion",duracion);
		
		String ubicacion = itinerario.getUbicacion();
		request.setAttribute("ubicacion",ubicacion);
		
		Set<Parada> paradas = itinerario.getParadas();
		request.setAttribute("paradas",paradas);
		
		
		return "contenido/itinerarios/ConfirmarBuscarItinerario.jsp";
	}

}
