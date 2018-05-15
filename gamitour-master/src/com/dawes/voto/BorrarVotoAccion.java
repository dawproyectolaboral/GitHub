package com.dawes.voto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.dawes.modelo.Voto;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class BorrarVotoAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		String idBorrar = request.getParameter("idBorrar");
		
		int id = Integer.parseInt(idBorrar);

		su.borrar((Voto)su.getDetalleVoto(id));
		
		System.out.println("Voto borrada");
		

		return "index.html";
	}

}
