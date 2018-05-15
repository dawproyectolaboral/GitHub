package com.dawes.pCultural;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

import antlr.ParserSharedInputState;

public class MostrarPCulturalesParadaAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		String nombre = request.getParameter("nombre");
		
		String idparada = request.getParameter("idparada");
		Integer id = Integer.parseInt(idparada);
		
		request.setAttribute("listado", su.getMostrarPCulturalesParada(id));
		request.setAttribute("nombre", nombre);
		
		return "contenido/pCulturales/ConfirmarMostrarPCulturalesParada.jsp";
	}
} // Fin class
		

