package com.dawes.rol;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Cliente;
import com.dawes.modelo.Rol;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class BorrarRolAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		ServiceGenericDAO su = new ServiceGenericDAOImp();

		String nombre = request.getParameter("idBorrar");
		
		
		su.borrar((Rol)su.getDetalleRol(nombre));
		
		
		return "index.html";
	}

}
