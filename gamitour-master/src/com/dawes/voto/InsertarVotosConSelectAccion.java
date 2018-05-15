package com.dawes.voto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Cliente;
import com.dawes.modelo.Multimedia;
import com.dawes.modelo.Voto;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class InsertarVotosConSelectAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {

		ServiceGenericDAO su = new ServiceGenericDAOImp();
		 
		request.setAttribute("listClie",su.getMostrarClientes());
		request.setAttribute("listMulti", su.getMostrarMultimedias());
		
		return "/contenido/votos/FormInsertarVoto.jsp";
	
	}



}
