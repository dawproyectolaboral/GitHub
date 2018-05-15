package com.dawes.pDeportiva;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dawes.modelo.Pruebadeportiva;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class ModificarPDeportivaPasoAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		Pruebadeportiva pruebad = (Pruebadeportiva) su.getDetallePruebaDeportiva(request.getParameter("nombre"));
		
		request.setAttribute("parada", pruebad.getParada());
		request.setAttribute("nombre", pruebad.getNombre());
		request.setAttribute("fechainicio", pruebad.getFechainicio());
		request.setAttribute("fechafin", pruebad.getFechafin());
		request.setAttribute("explicacion", pruebad.getExplicacion());
		request.setAttribute("puntos", pruebad.getPuntos());
		request.setAttribute("pdf", pruebad.getPdf());
		request.setAttribute("video", pruebad.getVideo());
		

		
		return "contenido/pDeportivas/ModificarPDeportiva.jsp";
	}

}
