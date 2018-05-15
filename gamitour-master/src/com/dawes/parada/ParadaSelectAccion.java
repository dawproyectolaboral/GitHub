package com.dawes.parada;


import java.lang.ProcessBuilder.Redirect;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class ParadaSelectAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		
		ServiceGenericDAO service = new ServiceGenericDAOImp();

		request.setAttribute("lista", service.getMostrarItinerarios());

		return "/contenido/paradas/FormInsertarParadaConSelect.jsp";

	}

}
