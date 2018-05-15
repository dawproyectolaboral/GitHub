package com.dawes.usuarios;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Cliente;

import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class BorrarUsuarioAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
	
		ServiceGenericDAO su = new ServiceGenericDAOImp();

		String nick = request.getParameter("idBorrar");
		
		su.borrar((Cliente)su.getDetalleCliente(nick));

		return "index.html";
	}

}
