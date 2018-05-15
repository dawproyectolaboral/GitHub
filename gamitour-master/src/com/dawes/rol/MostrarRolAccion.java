package com.dawes.rol;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Cliente;
import com.dawes.modelo.Rol;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class MostrarRolAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		String nombreRol = request.getParameter("nombreRol");
		
		Rol rol = (Rol)su.getDetalleRol(nombreRol);
		
		Integer idrol = rol.getIdrol();
		request.setAttribute("idrol",idrol);
		
		String nombre = rol.getNombre();
		request.setAttribute("nombreRol",nombre);
		
		
		
		return "contenido/roles/ConfirmarBuscarRol.jsp";
	

	}

}
