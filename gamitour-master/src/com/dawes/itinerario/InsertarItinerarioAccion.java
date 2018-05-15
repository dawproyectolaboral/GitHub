package com.dawes.itinerario;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Itinerario;
import com.dawes.modelo.Parada;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class InsertarItinerarioAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		
		
		String nombre = request.getParameter("nombreItinerario");
		String categoria = request.getParameter("categoria");
		String duracion = request.getParameter("duracion");
		String ubicacion = request.getParameter("ubicacion");
		Set<Parada> listado = new HashSet<Parada>(0);
		
		Itinerario itinerario = new Itinerario(nombre,categoria,duracion,ubicacion,listado);
		
		su.insertar(itinerario);
		
		
		return "index.html";
	}

}
