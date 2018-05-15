package com.dawes.premio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class MostrarPremiosAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();

		request.setAttribute("listado", su.getMostrarPremios());
		
		return "contenido/premios/ConfirmarMostrarPremios.jsp";
	

	}

}
