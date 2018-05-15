package com.dawes.itinerario;

import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Itinerario;
import com.dawes.modelo.Parada;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

import javassist.bytecode.Descriptor.Iterator;

public class BorrarItinerarioAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();

		String borrar = request.getParameter("nombre");
		
		Itinerario itinerario = (Itinerario) su.getDetalleItinerario(borrar);
	
		su.borrar(itinerario);
		
		return "index.html";
	}

}
