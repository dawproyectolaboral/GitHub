package com.dawes.pCultural;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Pruebacultural;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class ModificarPCulturalPasoAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		Pruebacultural pcultural = (Pruebacultural) su.getDetallePruebaCultural(request.getParameter("nombre"));
		
		request.setAttribute("nombre", pcultural.getNombre());
		request.setAttribute("pregunta", pcultural.getPregunta());
		request.setAttribute("respuesta", pcultural.getRespuesta());
		request.setAttribute("puntos", pcultural.getPuntos());
		request.setAttribute("parada", pcultural.getParada());
		
		
		return "contenido/pCulturales/ModificarPCultural.jsp";
	}

}
