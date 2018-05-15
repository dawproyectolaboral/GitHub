package com.dawes.pCultural;


import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dawes.modelo.Parada;
import com.dawes.modelo.Pruebacultural;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class InsertarPCulturalConSelect extends Accion {
	

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		request.setAttribute("listparad", su.getMostrarParadas());
		
		return "/contenido/pCulturales/FormInsertarPCultural.jsp";
	}
}
	