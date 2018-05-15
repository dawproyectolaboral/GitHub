package com.dawes.rol;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.dawes.modelo.Rol;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class MostrarRolesAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
ServiceGenericDAO su = new ServiceGenericDAOImp();

		request.setAttribute("listado", su.getMostrarRoles());
		
		return "contenido/roles/ConfirmarMostrarRoles.jsp";
	}

}
