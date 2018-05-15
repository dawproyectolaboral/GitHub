package com.dawes.premio;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class InsertarPremioConSelectAccion extends Accion{

	

	
	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		request.setAttribute("listGanadores", su.getMostrarClientes());

		return "/contenido/premios/FormInsertarPremio.jsp";
	}

}
